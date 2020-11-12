package com.jeng.design.pattern.creational.factory.factories;

import com.jeng.design.pattern.creational.factory.*;

import java.util.HashMap;

public class RuleConfigParserSimpleFactory {
    private java.util.Map<String, IRuleConfigParser> parserMap = new HashMap<>();

    public IRuleConfigParser createParser(String configFormat) {
        IRuleConfigParser parser = parserMap.get(configFormat);
        if (parser != null) {
            return parser;
        }

        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }

        parserMap.put(configFormat, parser);
        return parser;
    }
}
