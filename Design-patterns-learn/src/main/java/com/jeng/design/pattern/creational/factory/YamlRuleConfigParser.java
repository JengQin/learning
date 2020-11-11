package com.jeng.design.pattern.creational.factory;

public class YamlRuleConfigParser implements IRuleConfigParser {
    @Override
    public void parseConfig() {
        System.out.println("Parse yaml config");
    }
}
