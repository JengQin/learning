package com.jeng.design.pattern.creational.factory;

public class JsonRuleConfigParser implements IRuleConfigParser {
    @Override
    public void parseConfig() {
        System.out.println("Parse json config");
    }
}
