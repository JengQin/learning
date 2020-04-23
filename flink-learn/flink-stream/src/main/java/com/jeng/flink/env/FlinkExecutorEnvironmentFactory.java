package com.jeng.flink.env;

import org.apache.flink.runtime.state.filesystem.FsStateBackend;
import org.apache.flink.streaming.api.CheckpointingMode;
import org.apache.flink.streaming.api.environment.CheckpointConfig;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * The FlinkExecutorEnvironmentFactory
 *
 * @author JiaZheng
 * @create 2019-09-16 21:20
 */
public class FlinkExecutorEnvironmentFactory {
    private static StreamExecutionEnvironment env;

    public static synchronized StreamExecutionEnvironment getStreamExecutionEnvironment() {
        if (null == env) {
            env = StreamExecutionEnvironment.getExecutionEnvironment();
            /*开启checkpoint，并设置checkpoint的间隔为1000ms*/
            env.enableCheckpointing(60000);
            /*设置checkpoint的模式为exactly_one*/
            env.getCheckpointConfig().setCheckpointingMode(CheckpointingMode.EXACTLY_ONCE);
            /*设置checkpoint超时时间*/
            env.getCheckpointConfig().setCheckpointTimeout(600000);
            /*设置checkpoint的最小间隔*/
            env.getCheckpointConfig().setMinPauseBetweenCheckpoints(500);
            /*设置并行执行的checkpoint数量*/
            env.getCheckpointConfig().setMaxConcurrentCheckpoints(1);
            /*设置外部checkpoint*/
            env.getCheckpointConfig().enableExternalizedCheckpoints(CheckpointConfig.ExternalizedCheckpointCleanup.RETAIN_ON_CANCELLATION);
            /*当存在最近的checkpoint时，允许作业恢复回checkpoint*/
            env.getCheckpointConfig().setPreferCheckpointForRecovery(true);
            env.setStateBackend(new FsStateBackend("hdfs://jhcluster/flink-test/checkpoints"));
        }
        return env;
    }
}
