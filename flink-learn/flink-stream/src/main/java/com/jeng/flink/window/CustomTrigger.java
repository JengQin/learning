package com.jeng.flink.window;

import org.apache.flink.api.common.state.ValueState;
import org.apache.flink.api.common.state.ValueStateDescriptor;
import org.apache.flink.streaming.api.windowing.triggers.Trigger;
import org.apache.flink.streaming.api.windowing.triggers.TriggerResult;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;

public class CustomTrigger extends Trigger<SocketWindowWordCount.WordKey, TimeWindow> {

    private int maxCount;

    private ValueStateDescriptor<Integer> countStateDesc;

    public CustomTrigger(int maxCount) {
        this.maxCount = maxCount;
        this.countStateDesc = new ValueStateDescriptor<>("elementCount", Integer.class);
    }

    @Override
    public TriggerResult onElement(SocketWindowWordCount.WordKey element, long timestamp, TimeWindow window, TriggerContext ctx) throws Exception {

        ctx.registerProcessingTimeTimer(window.maxTimestamp());
        // 计算当前窗口内已经存在的数据条数
        ValueState<Integer> countState = ctx.getPartitionedState(countStateDesc);
        Integer count = countState.value();
        if (null == count) {
            count = 0;
        }
        count++;
        countState.update(count);

        // 判断数据条数是否达到阈值
        if (count >= maxCount) {
            // 清楚状态，触发计算
            countState.clear();
            return TriggerResult.FIRE_AND_PURGE;
        } else {
            return TriggerResult.CONTINUE;
        }
    }

    @Override
    public TriggerResult onProcessingTime(long time, TimeWindow window, TriggerContext ctx) throws Exception {
        ctx.getPartitionedState(countStateDesc).clear();
        return TriggerResult.FIRE_AND_PURGE;
    }

    @Override
    public TriggerResult onEventTime(long time, TimeWindow window, TriggerContext ctx) throws Exception {
        return TriggerResult.CONTINUE;
    }

    @Override
    public void clear(TimeWindow window, TriggerContext ctx) throws Exception {
        ctx.deleteProcessingTimeTimer(window.maxTimestamp());
        ctx.getPartitionedState(countStateDesc).clear();
    }
}