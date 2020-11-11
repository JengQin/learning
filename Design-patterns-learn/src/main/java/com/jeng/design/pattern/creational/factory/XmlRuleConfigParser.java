package com.jeng.design.pattern.creational.factory;

public class XmlRuleConfigParser implements IRuleConfigParser {
    @Override
    public void parseConfig() {
        System.out.println("Parse xml config");
    }
}
