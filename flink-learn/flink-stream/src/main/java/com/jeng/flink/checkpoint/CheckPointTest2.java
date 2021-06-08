package com.jeng.flink.checkpoint;

import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.api.common.functions.RuntimeContext;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.api.common.state.ValueState;
import org.apache.flink.api.common.state.ValueStateDescriptor;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.runtime.state.filesystem.FsStateBackend;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.CheckpointConfig;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * The CheckPointTest
 *
 * @author JiaZheng
 * @create 2019-08-27 21:49
 */
public class CheckPointTest2 {

    private static StreamExecutionEnvironment getStreamExecutionEnvironment() {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        /*开启checkpoint，并设置checkpoint的间隔为10s*/
        env.enableCheckpointing(10000);
        /*设置checkpoint的模式为exactly_one*/
        env.getCheckpointConfig().setCheckpointingMode(CheckpointingMode.EXACTLY_ONCE);
        /*设置checkpoint超时时间为10m*/
        env.getCheckpointConfig().setCheckpointTimeout(600000);
        /*设置checkpoint的最小间隔为5m*/
        env.getCheckpointConfig().setMinPauseBetweenCheckpoints(5000);
        /*设置并行执行的checkpoint数量*/
        env.getCheckpointConfig().setMaxConcurrentCheckpoints(1);
        /*设置外部checkpoint*/
        env.getCheckpointConfig().enableExternalizedCheckpoints(CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
        /*当存在最近的checkpoint时，允许作业恢复回checkpoint*/
        env.getCheckpointConfig().setPreferCheckpointForRecovery(true);
        /*使用FsStateBackend，并设置checkpoint数据的保留路径*/
        env.setStateBackend(new FsStateBackend("hdfs://jhcluster/flink-test/checkpoints"));
        return env;
    }

    public static void main(String[] args) {
        /*获取Flink的env*/
        StreamExecutionEnvironment env = getStreamExecutionEnvironment();

        /*配置kafka source*/
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "hadoop1:6667");
        properties.setProperty("group.id", "test");
        List<String> topics = new ArrayList<>();
        topics.add("flink_checkpoint_test");
        FlinkKafkaConsumer<String> myConsumer = new FlinkKafkaConsumer<>(topics, new SimpleStringSchema(), properties);
        myConsumer.setStartFromGroupOffsets();

        /*添加kafka source*/
        DataStreamSource<String> kafkaSourceStream = env.addSource(myConsumer);
        DataStream<Tuple2<String, Long>> inputStream = kafkaSourceStream.map(new SplitStringMap());

        /*按第一个字段分组，计算每个key的最小值和记录数，并加入行尾*/
        DataStream<Tuple4<String, Long, Long,Long>> withMinValueStream = inputStream
                .keyBy("0")
                .map(new RichMapFunction<Tuple2<String, Long>, Tuple4<String, Long, Long,Long>>() {
                    /*valueState句柄*/
                    private ValueState<Long> minValueState;//保存每个key的最小值
                    private ValueState<Long> countValueState;//记录每个key的记录数

                    @Override
                    public void open(Configuration parameters) throws Exception {
                        /*创建stateDescriptor，并设置valueState的配置*/
                        ValueStateDescriptor<Long> stateDescriptor = new ValueStateDescriptor<>("minValue", Long.class);
                        ValueStateDescriptor<Long> countValueStateDescriptor = new ValueStateDescriptor<>("countValue", Long.class);

                        /*获取通过RuntimeContext注册并获取ValueState*/
                        RuntimeContext runtimeContext = getRuntimeContext();
                        minValueState = runtimeContext.getState(stateDescriptor);
                        countValueState = runtimeContext.getState(countValueStateDescriptor);
                    }

                    public Tuple4<String, Long, Long, Long> map(Tuple2<String, Long> inputTuple2) throws Exception {
                        Long minValue = minValueState.value();//记录每个key的最小value
                        Long countValue = countValueState.value();//记录每个key的记录数

                        /*如果当前指标小于最小值，更新状态中的最小值*/
                        if (minValue == null || inputTuple2.f1 < minValue) {
                            minValue = inputTuple2.f1;
                            minValueState.update(minValue);//更新最小值
                        }

                        /*初始化countValue*/
                        if (null == countValue) {
                            countValue=0L;
                        }
                        countValue++;
                        /*更新记录数，PS: 这里应该把两个状态放到不同的算子里面去执行，性能可能会更好。*/
                        countValueState.update(countValue);

                        /*将最小值和记录数加入行尾*/
                       return new Tuple4<>(inputTuple2.f0, inputTuple2.f1, minValue,countValue);
                    }
                });
//        withLeastValueStream.print();

        DataStream<String> stream = withMinValueStream.map(new MapFunction<Tuple4<String, Long, Long,Long>, String>() {
            @Override
            public String map(Tuple4<String, Long, Long,Long> tuple4) throws Exception {
                return tuple4.f0 + "," + tuple4.f1 + "," + tuple4.f2+","+tuple4.f3;
            }
        });

        /*输出到kafka*/
        FlinkKafkaProducer<String> myProducer = new FlinkKafkaProducer<String>(
                "hadoop1:6667",
                "flink_keyed_value_state_test",
                new SimpleStringSchema()
        );
        stream.addSink(myProducer);

        try {
            JobExecutionResult jobExecutionResult = env.execute("CheckpointTest2");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
