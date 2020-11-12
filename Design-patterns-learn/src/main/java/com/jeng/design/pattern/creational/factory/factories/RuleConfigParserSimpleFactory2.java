package com.jeng.design.pattern.creational.factory.factories;

import com.jeng.design.pattern.creational.factory.*;

import java.util.HashMap;
import java.util.Map;

public class RuleConfigParserSimpleFactory2 {
    private final static Map<String, IRuleConfigParser> parserMap = new HashMap<>();

    static {
        parserMap.put("json", new JsonRuleConfigParser());
        parserMap.put("xml", new XmlRuleConfigParser());
        parserMap.put("yaml", new YamlRuleConfigParser());
        parserMap.put("properties", new PropertiesRuleConfigParser());
    }

    public IRuleConfigParser createParser(String configFormat) {
        return parserMap.get(configFormat.toLowerCase());
    }
}
