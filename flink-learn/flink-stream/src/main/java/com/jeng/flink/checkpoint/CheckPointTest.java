package com.jeng.flink.checkpoint;

import com.jeng.flink.env.FlinkExecutorEnvironmentFactory;
import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.functions.RichFlatMapFunction;
import org.apache.flink.api.common.functions.RuntimeContext;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.api.common.state.ValueState;
import org.apache.flink.api.common.state.ValueStateDescriptor;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer010;
import org.apache.flink.util.Collector;

/**
 * The CheckPointTest
 *
 * @author JiaZheng
 * @create 2019-08-27 21:49
 */
public class CheckPointTest {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = FlinkExecutorEnvironmentFactory.getStreamExecutionEnvironment();
        DataStreamSource<Tuple2<String, Long>> inputStream = env.fromElements(new Tuple2<>("Java", 21L),
                new Tuple2<>("Java", 1L),
                new Tuple2<>("Hadoop", 4L),
                new Tuple2<>("Flink", 10L),
                new Tuple2<>("Flink", 11L),
                new Tuple2<>("Spark", 9L));

        DataStream<Tuple4<String, Long, Long,Long>> withLeastValueStream = inputStream.keyBy("0")
                /*对每一行，加入当前的最小值*/
                .flatMap(new RichFlatMapFunction<Tuple2<String, Long>, Tuple4<String, Long, Long,Long>>() {
                    /*valueState句柄*/
                    private ValueState<Long> leastValueState;
                    private ValueState<Long> countValueState;

                    @Override
                    public void open(Configuration parameters) throws Exception {
                        /*创建stateDescriptor，并设置valueState的配置*/
                        ValueStateDescriptor<Long> stateDescriptor = new ValueStateDescriptor<>("leastValue", Long.class);
                        ValueStateDescriptor<Long> countValueStateDescriptor = new ValueStateDescriptor<>("countValue", Long.class);

                        /*获取通过RuntimeContext注册并获取ValueState*/
                        RuntimeContext runtimeContext = getRuntimeContext();
                        leastValueState = runtimeContext.getState(stateDescriptor);
                        countValueState = runtimeContext.getState(countValueStateDescriptor);
                    }

                    public void flatMap(Tuple2<String, Long> inputTuple2, Collector<Tuple4<String, Long, Long, Long>> collector) throws Exception {
                        Long leastValue = leastValueState.value();//记录每个key的最小value
                        Long countValue = countValueState.value();//记录每个key的记录数
                        /*如果当前指标小于最小值，更新状态中的最小值*/
                        if (leastValue == null || inputTuple2.f1 < leastValue) {
                            leastValue = inputTuple2.f1;
                            leastValueState.update(leastValue);
                        }
                        /*初始化countValue*/
                        if (null == countValue) {
                            countValue=0L;
                        }
                        countValue++;
                        /*更新状态*/
                        countValueState.update(countValue);
                        collector.collect(new Tuple4<>(inputTuple2.f0, inputTuple2.f1, leastValue,countValue));
                    }
                });
//        withLeastValueStream.print();

        SingleOutputStreamOperator<String> stream = withLeastValueStream.map(new MapFunction<Tuple4<String, Long, Long,Long>, String>() {
            @Override
            public String map(Tuple4<String, Long, Long,Long> tuple4) throws Exception {
                return tuple4.f0 + "," + tuple4.f1 + "," + tuple4.f2+","+tuple4.f3;
            }
        });
        /*输出到kafka*/
        FlinkKafkaProducer010<String> myProducer = new FlinkKafkaProducer010<String>(
                "hadoop1:6667",
                "flink_keyed_value_state_test",
                new SimpleStringSchema()
        );
        stream.addSink(myProducer);

        try {
            JobExecutionResult jobExecutionResult = env.execute("CheckpointTest");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
