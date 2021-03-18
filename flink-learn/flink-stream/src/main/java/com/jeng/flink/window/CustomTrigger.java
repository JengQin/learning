package com.jeng.flink.window;

import org.apache.flink.streaming.api.windowing.triggers.Trigger;
import org.apache.flink.streaming.api.windowing.triggers.TriggerResult;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;

public class CustomTrigger extends Trigger<SocketWindowWordCount.WordKey, TimeWindow> {

    private int maxCount;
    private int curCount;

    public CustomTrigger(int maxCount) {
        this.maxCount = maxCount;
        this.curCount = 0;
    }

    @Override
    public TriggerResult onElement(SocketWindowWordCount.WordKey element, long timestamp, TimeWindow window, TriggerContext ctx) throws Exception {
        System.out.println("curCount=" + curCount + ", maxCount=" + maxCount);
        curCount++;
        if (curCount >= maxCount) {
            return TriggerResult.FIRE;
        } else {
            return TriggerResult.CONTINUE;
        }
    }

    @Override
    public TriggerResult onProcessingTime(long time, TimeWindow window, TriggerContext ctx) throws Exception {
        return TriggerResult.FIRE_AND_PURGE;
    }

    @Override
    public TriggerResult onEventTime(long time, TimeWindow window, TriggerContext ctx) throws Exception {
        return TriggerResult.CONTINUE;
    }

    @Override
    public void clear(TimeWindow window, TriggerContext ctx) throws Exception {

    }
}