package com.jeng.flink.window;

import org.apache.flink.streaming.api.windowing.triggers.Trigger;
import org.apache.flink.streaming.api.windowing.triggers.TriggerResult;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;

import java.time.LocalTime;

/**
 * The CustomTrigger
 *
 * @author JiaZheng
 * @create 2021-03-18 22:09
 */
public class CustomTrigger extends Trigger<SocketWindowWordCount.WordKey, TimeWindow> {
    private int maxCount;
    private int curCount;

    public CustomTrigger(int maxCount) {
        this.maxCount = maxCount;
        this.curCount = 0;
    }

    @Override
    public TriggerResult onElement(SocketWindowWordCount.WordKey element, long timestamp, TimeWindow window, TriggerContext ctx) throws Exception {
        curCount++;
        System.out.println(element+">>>>> count = "+curCount);
        if (curCount >= maxCount) {
            curCount = 0;
            return TriggerResult.FIRE_AND_PURGE;
        } else {
            return TriggerResult.CONTINUE;
        }
    }

    @Override
    public TriggerResult onProcessingTime(long time, TimeWindow window, TriggerContext ctx) throws Exception {
        System.out.println("curCount="+curCount+", onProcessingTime="+ LocalTime.now().toString());
        curCount = 0;
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
