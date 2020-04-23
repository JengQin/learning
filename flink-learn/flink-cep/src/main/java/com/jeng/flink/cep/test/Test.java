package com.jeng.flink.cep.test;

import org.apache.flink.cep.nfa.NFA;
import org.apache.flink.cep.nfa.compiler.NFACompiler;
import org.apache.flink.cep.pattern.Pattern;
import org.apache.flink.cep.pattern.conditions.SimpleCondition;

public class Test {
//    public static void main(String[] args) {
//        Event event0 = new Event(40, "x", 1.0);
//        Event event1 = new Event(40, "c", 1.0);
//        Event event2 = new Event(42, "b", 2.0);
//        Event event3 = new Event(43, "b", 2.0);
//        Event event4 = new Event(44, "a", 2.0);
//        Event event5 = new Event(45, "b", 5.0);
//
//        Pattern pattern = Pattern.begin("start").where(new SimpleCondition() {
//            private static final long serialVersionUID = 5726188262756267490L;
//
//            @Override
//            public boolean filter(Event value) throws Exception {
//                return value.getName().equals("c");
//            }
//        }).followedBy("middle").where(new SimpleCondition() {
//            private static final long serialVersionUID = 5726188262756267490L;
//
//            @Override
//            public boolean filter(Event value) throws Exception {
//                return value.getName().equals("a");
//            }
//        }).optional(); //创建nfa
//        NFA nfa = NFACompiler.compile(pattern, Event.createTypeSerializer(), false);
//    }
}
