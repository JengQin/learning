package com.jeng.flink.state;

import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.api.common.functions.RuntimeContext;
import org.apache.flink.api.common.state.ValueState;
import org.apache.flink.api.common.state.ValueStateDescriptor;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KeyedValueState {
    private static Logger LOGGER = LoggerFactory.getLogger(KeyedValueState.class);

    public static void main(String[] args) {
        /*创建执行环境*/
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        /*数据源（user,login_ts）*/
        DataStreamSource<Tuple2<String, Long>> inputStream = env.fromElements(new Tuple2<String, Long>("Java", 10L),
                new Tuple2<>("Java", 1L),
                new Tuple2<>("Java", 20L),
                new Tuple2<>("Java", 25L),
                new Tuple2<>("Flink", 9L),
                new Tuple2<>("Flink", 20L),
                new Tuple2<>("Flink", 100L));

        /*按user分组，计算每个user的最小login_ts，并将最小的login_ts加到行尾*/
        DataStream<Tuple3<String, Long, String>> withMinValueStream = inputStream
                .keyBy("0")
                .map(new RichMapFunction<Tuple2<String, Long>, Tuple3<String, Long, String>>() {
                    /*valueState句柄，记录每个key的最小值*/
                    private ValueState<Long> minValueState;

                    @Override
                    public void open(Configuration parameters) throws Exception {
                        /*创建stateDescriptor，并设置valueState的配置*/
                        ValueStateDescriptor<Long> stateDescriptor = new ValueStateDescriptor<Long>("leastValue", Long.class);

                        /*获取通过RuntimeContext注册并获取ValueState*/
                        RuntimeContext runtimeContext = getRuntimeContext();
                        minValueState = runtimeContext.getState(stateDescriptor);
                    }

                    @Override
                    public Tuple3<String, Long, String> map(Tuple2<String, Long> inputTuple2) throws Exception {
                        /*获取当前的状态值*/
                        Long minValue = minValueState.value();
                        if (null == minValue || inputTuple2.f1 < minValue) {
                            /*如果状态值为空（未初始化），或当前指标小于最小值，更新状态中的最小值*/
                            minValueState.update(inputTuple2.f1);
                            minValue = inputTuple2.f1;
                        }
                        /*将最小值加入行尾*/
                        return new Tuple3<>(inputTuple2.f0, inputTuple2.f1, " min:" + minValue);
                    }
                });
        withMinValueStream.print();


        try {
            JobExecutionResult jobExecutionResult = env.execute("KeyedValueState");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
