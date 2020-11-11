package com.jeng.design.pattern.creational.factory;

import com.jeng.design.pattern.creational.factory.factories.RuleConfigParserSimpleFactory2;

public class Client {
    private RuleConfigParserSimpleFactory2 parserFactory;

    public static void main(String[] args) {
        Client client = new Client();
        client.parserFactory = new RuleConfigParserSimpleFactory2();
        client.execute();
    }

    public void execute() {
        IRuleConfigParser parser = parserFactory.createParser("json");
        parser.parseConfig();
    }
}
