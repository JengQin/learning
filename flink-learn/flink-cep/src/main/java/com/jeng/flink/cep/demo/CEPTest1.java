package com.jeng.flink.cep.demo;

import com.jeng.flink.cep.test.Event;
import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.api.java.tuple.Tuple;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.cep.CEP;
import org.apache.flink.cep.PatternStream;
import org.apache.flink.cep.functions.PatternProcessFunction;
import org.apache.flink.cep.nfa.aftermatch.AfterMatchSkipStrategy;
import org.apache.flink.cep.pattern.Pattern;
import org.apache.flink.cep.pattern.conditions.SimpleCondition;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CEPTest1 {

    public static void main(String[] args) {

        StreamExecutionEnvironment evn = StreamExecutionEnvironment.getExecutionEnvironment();
        List<Tuple2<String,String>> eventList = new ArrayList<>();
        eventList.add(new Tuple2("a","other_info1"));
        eventList.add(new Tuple2("c","other_info"));
        eventList.add(new Tuple2("a","other_info2"));
        eventList.add(new Tuple2("b","other_info"));
        eventList.add(new Tuple2("b","other_info"));
        eventList.add(new Tuple2("c","other_info"));
        eventList.add(new Tuple2("a","other_info3"));
        eventList.add(new Tuple2("d","other_info"));
        eventList.add(new Tuple2("b","other_info"));
        eventList.add(new Tuple2("b","other_info"));
        eventList.add(new Tuple2("c","other_info"));
        //生成事件流
        DataStreamSource<Tuple2<String,String>> inputStream = evn.fromCollection(eventList);

        //生成命名为“start”的起始模式
        Pattern<Tuple2<String,String>, Tuple2<String,String>> startPattern = Pattern.<Tuple2<String,String>>begin("start", AfterMatchSkipStrategy.skipToNext()).where(new SimpleCondition<Tuple2<String,String>>() {
//        Pattern<Tuple2<String,String>, Tuple2<String,String>> startPattern = Pattern.<Tuple2<String,String>>begin("start").where(new SimpleCondition<Tuple2<String,String>>() {
            public boolean filter(Tuple2<String,String> event) {
                return event.f0.equals("a");
            }
        });
        //生成第2个模式
        Pattern<Tuple2<String,String>, Tuple2<String,String>> middlePattern = startPattern.followedBy("middle");
//        Pattern<Tuple2<String,String>, Tuple2<String,String>> middlePattern = startPattern.next("middle");
        middlePattern.where(new SimpleCondition<Tuple2<String,String>>() {
            public boolean filter(Tuple2<String,String> event) {
                return event.f0.equals("b");
            }
        }).oneOrMore().optional();
        //生成第3个模式
        Pattern<Tuple2<String,String>, Tuple2<String,String>> endPattern = middlePattern.next("end").where(new SimpleCondition<Tuple2<String,String>>() {
            public boolean filter(Tuple2<String,String> event) {
                return event.f0.equals("c");
            }
        });

        //将模式序列应用到DataStream数据流，进行事件序列匹配
        PatternStream<Tuple2<String,String>> patternStream = CEP.pattern(inputStream, endPattern);
        //提取匹配结果
        patternStream.process(new PatternProcessFunction<Tuple2<String,String>, Object>() {
            @Override
            public void processMatch(Map<String, List<Tuple2<String,String>>> match, Context ctx, Collector<Object> out) throws Exception {
                System.out.println("--------------");
                for (String patternName : match.keySet()) {
                    List<Tuple2<String,String>> events = match.get(patternName);
                    for (Tuple2<String,String> event : events) {
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
