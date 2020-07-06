package com.tt.datacenter.test;


import com.tt.datacenter.parser.ClickHouseLexer;
import com.tt.datacenter.parser.ClickHouseParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        iterParserTree();

    }

    public static void iterParserTree() {

        String sql = "select t1.id,t1.name from dw.t1";

        ANTLRInputStream input = new ANTLRInputStream(sql);
        ClickHouseLexer lexer = new ClickHouseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ClickHouseParser parser = new ClickHouseParser(tokens);
        ClickHouseParser.ParseContext parseTree = parser.parse();

        System.out.println(parseTree.toStringTree(parser));

    }
}
