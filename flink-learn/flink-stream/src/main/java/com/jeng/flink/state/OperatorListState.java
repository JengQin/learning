package com.jeng.flink.state;

import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.state.*;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.api.java.tuple.Tuple4;
import org.apache.flink.runtime.state.FunctionInitializationContext;
import org.apache.flink.runtime.state.FunctionSnapshotContext;
import org.apache.flink.streaming.api.checkpoint.CheckpointedFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

public class OperatorListState {
    public static void main(String[] args) {
        /*创建执行环境*/
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<Tuple2<Integer, Long>> inputStream = env.fromElements(new Tuple2<Integer, Long>(2, 21L),
                new Tuple2<Integer, Long>(4, 1L),
                new Tuple2<Integer, Long>(5, 4L),
                new Tuple2<Integer, Long>(2, 10L),
                new Tuple2<Integer, Long>(4, 9L));

        inputStream.keyBy("0")
                .flatMap(new CheckpointCountFlatMapFunction())
                .print();
        try {
            JobExecutionResult jobExecutionResult = env.execute("OperatorListState");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static class CheckpointCountFlatMapFunction implements FlatMapFunction<Tuple2<Integer, Long>, Tuple4<Integer, Long, Long, Long>>, CheckpointedFunction {
        /*算子实例本地变量*/
        private Long operatorCount = 0L;
        /*定义keyedState，存储和key相关的状态值*/
        private ValueState<Long> keyState;
        /*定义OperatorState，存储算子的状态值*/
        private ListState<Long> operatorState;

        public void flatMap(Tuple2<Integer, Long> value, Collector<Tuple4<Integer, Long, Long, Long>> out) throws Exception {
            Long keyStateValue = keyState.value();
            if (null == keyStateValue) {
                keyStateValue = 0L;
            }
            keyStateValue++;
            /*更新key状态值*/
            keyState.update(keyStateValue);
            /*更新本地算子operatorCount值*/
            operatorCount++;
            out.collect(new Tuple4<Integer, Long, Long, Long>(value.f0, value.f1, keyStateValue, operatorCount));
        }

        /*每当checkpoint触发时，调用此方法*/
        public void snapshotState(FunctionSnapshotContext context) throws Exception {
            operatorState.clear();
            operatorState.add(operatorCount);
        }

        /*每次自定义函数初始化时（包括从之前状态恢复数据时的初始化），调用此方法初始化状态*/
        public void initializeState(FunctionInitializationContext context) throws Exception {
            /*初始化keyedState*/
            keyState = context.getKeyedStateStore().getState(new ValueStateDescriptor<Long>("keyedState", Long.class));
            /*初始化OperatorState*/
            operatorState = context.getOperatorStateStore().getListState(new ListStateDescriptor<Long>("OperatorState", Long.class));

            /*定义在restored过程中，从operatorState中恢复数据的逻辑*/
            if (context.isRestored()) {
                operatorCount = 0L;
                Iterable<Long> iterable = operatorState.get();
                for (Long state : iterable) {
                    operatorCount += state;
                }
            }
        }
    }
}
