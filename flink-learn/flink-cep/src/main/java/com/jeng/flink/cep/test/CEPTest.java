package com.jeng.flink.cep.test;

import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.cep.CEP;
import org.apache.flink.cep.PatternStream;
import org.apache.flink.cep.functions.PatternProcessFunction;
import org.apache.flink.cep.pattern.Pattern;
import org.apache.flink.cep.pattern.conditions.SimpleCondition;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CEPTest {

    public static void main(String[] args) {

        StreamExecutionEnvironment evn = StreamExecutionEnvironment.getExecutionEnvironment();
        List<Event> eventList = new ArrayList<Event>();
        eventList.add(new Event("active", "u001", "active01"));
        eventList.add(new Event("login", "u001","login01"));
        eventList.add(new Event("login", "u002","login02"));
        eventList.add(new Event("login", "u003","login03"));
        eventList.add(new Event("order", "u001", "6"));
        eventList.add(new Event("order", "u001", "10"));
        DataStreamSource<Event> inputStream = evn.fromCollection(eventList);

        //生成命名为“start”的起始模式
        Pattern<Event, Event> startPattern = Pattern.<Event>begin("start");
        //设置start模式的条件（接受的事件）,接受“active”事件
        startPattern.where(new SimpleCondition<Event>() {
            public boolean filter(Event event) throws Exception {
                return event.getEventType().equals("active");
            }
        });

        //生成第2个模式
        Pattern<Event, Event> middlePattern = startPattern.followedBy("middle");
        //设置模式的条件,接受“login”事件
        middlePattern.where(new SimpleCondition<Event>() {
            public boolean filter(Event event) throws Exception {
                return event.getEventType().equals("login");
            }
        });
        //设置模式条件的量词，oneOrMore:一次或者多次
        middlePattern.oneOrMore();
//        middlePattern.optional();

        //生成第3个模式
        Pattern<Event, Event> endPattern = middlePattern.followedBy("end");
        //设置模式的条件,接受“order”事件
        endPattern.where(new SimpleCondition<Event>() {
            public boolean filter(Event event) throws Exception {
                return event.getEventType().equals("order");
            }
        });
        endPattern.oneOrMore();

        //将模式序列应用到DataStream数据流，进行事件序列匹配
        PatternStream<Event> patternStream = CEP.pattern(inputStream, endPattern);
        patternStream.process(new PatternProcessFunction<Event, Object>() {
            @Override
            public void processMatch(Map<String, List<Event>> match, Context ctx, Collector<Object> out) throws Exception {
                System.out.println("--------------");
                for (String patternName : match.keySet()) {
                    List<Event> events = match.get(patternName);
                    for (Event event : events) {
                        System.out.println(patternName+"=>>"+event.toString());
                    }
                }
            }
        });


        try {
            JobExecutionResult test = evn.execute("test");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}