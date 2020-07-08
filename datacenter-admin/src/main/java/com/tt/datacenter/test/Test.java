package com.tt.datacenter.test;


import com.tt.datacenter.lineage.TableLineage;
import com.tt.datacenter.lineage.clickhouse.CkTableLineageBuilder;
import com.tt.datacenter.parser.SqlBaseLexer;
import com.tt.datacenter.parser.SqlBaseParser;
import com.tt.datacenter.schema.BaseTable;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class Test {

    public static void main(String[] args) {
        iterParserTree();

    }

    public static void iterParserTree() {

//        String sql = "select t1.id,t1.name from dw.t1";
        String sql = "insert into dw.tb4(id,score,clz)\n" +
                "select tb1.id,sum(t2.score) as score,count(t3.clz) as clz_cnt \n" +
                "from dw.t1 tb1 join dw.t2 as tb2 on (t1.id=t2.id and t1.name=t2.name) join (select id,clz from tb3 where event_date>='2002-01-01' order  by id desc) t3 on (t1.id=t3.id)";

        ANTLRInputStream input = new ANTLRInputStream(sql);
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);
        ParseTree parseTree = parser.singleStatement();

        System.out.println("===============");

        CkTableLineageBuilder lineageBuilder = new CkTableLineageBuilder();

        TableLineage tableLineage = lineageBuilder.build(parseTree);
        for (BaseTable sourceTable : tableLineage.getSourceTables()) {
            System.out.println("input table: "+sourceTable);
        }
        for (BaseTable sinkTable : tableLineage.getTargetTables()) {
            System.out.println("output table: "+sinkTable);
        }
    }
}
