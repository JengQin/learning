package com.tt.datacenter.test;


import com.alibaba.fastjson.JSON;
import com.tt.datacenter.lineage.clickhouse.CkTableLineageBuilder;
import com.tt.datacenter.lineage.clickhouse.VirtualColumnVisitor;
import com.tt.datacenter.lineage.clickhouse.VirtualTableVisitor;
import com.tt.datacenter.lineage.lib.column.ColumnLineage;
import com.tt.datacenter.lineage.lib.column.ColumnLineageBuilder;
import com.tt.datacenter.lineage.lib.table.SourceTable;
import com.tt.datacenter.lineage.lib.table.TableLineage;
import com.tt.datacenter.lineage.union.VirtualTable;
import com.tt.datacenter.parser.SqlBaseLexer;
import com.tt.datacenter.parser.SqlBaseParser;
import com.tt.datacenter.schema.BaseTable;
import com.tt.datacenter.schema.base.Table;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Map;


public class Test {

    public static void main(String[] args) {
        //        String sql = "select t1.id,t1.name from dw.t1";
//        String sql = "insert into dw.tb4(id,score,clz)\n" +
//                "select tb1.id,sum(t2.score) as score,count(t3.clz) as clz_cnt \n" +
//                "from dw.t1 tb1 " +
//                "join dw.t2 as tb2 on (t1.id=t2.id and t1.name=t2.name) " +
//                "join (select id,clz from tb3 where event_date>='2002-01-01' order  by id desc) t3 on (t1.id=t3.id)";
        String sql = "insert into dw.tb4(id,score,clz)\n" +
                "select t1.id,t3.id as uid,t1.score+t1.age as age,sum(t2.score) as score,count(t3.clz,t2.id) as clz_cnt \n" +
                "from dw.t1 global join dw.t2 on (t1.id=t2.id and t1.name=t2.name) \n" +
                "left SEMI join (\n" +
                "select id,clz from tab3 where event_date>='2002-01-01' and id global in (select id from t1)\n" +
                "union all\n" +
                "select id,clz from tab4 where event_date>='2002-01-01'\n" +
                "union all\n" +
                "select id,clz from tab5 where event_date>='2002-01-01'\n" +
                ") t3 on (t1.id=t3.id)";

        ANTLRInputStream input = new ANTLRInputStream(sql);
        SqlBaseLexer lexer = new SqlBaseLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SqlBaseParser parser = new SqlBaseParser(tokens);
        ParseTree parseTree = parser.singleStatement();




//        iterParserTree(parseTree);
//        testSelectQueryVisitor(parseTree);
//        testVirtualTableVisitor(parseTree);
//        testVirtualColumnVisitor(parseTree);
        testColumnLineageBuilder(parseTree);

    }

    public static void iterParserTree(ParseTree parseTree) {

        CkTableLineageBuilder lineageBuilder = new CkTableLineageBuilder();

        TableLineage tableLineage = lineageBuilder.build(parseTree);
        for (BaseTable sourceTable : tableLineage.getSourceTables()) {
            System.out.println("input table: "+sourceTable);
        }
        for (BaseTable sinkTable : tableLineage.getTargetTables()) {
            System.out.println("output table: "+sinkTable);
        }
    }



    public static void testVirtualTableVisitor(ParseTree parseTree) {

        VirtualTableVisitor visitor = new VirtualTableVisitor();

        parseTree.accept(visitor);

        Map<String, VirtualTable> visitedTable = visitor.getVisitedTable();
        String jsonString = JSON.toJSONString(visitedTable);
        System.out.println(jsonString);
    }


    public static void testVirtualColumnVisitor(ParseTree parseTree) {

        VirtualColumnVisitor visitor = new VirtualColumnVisitor();

        visitor.parseTreeToVirtualTable(parseTree);
//        parseTree.accept(visitor);

        Map<String, VirtualTable> visitedTable = visitor.getVisitedTable();
        String jsonString = JSON.toJSONString(visitedTable);
        System.out.println(jsonString);
        for (String key : visitedTable.keySet()) {
            System.out.println(key + " ==> " + visitedTable.get(key));
        }
    }


    public static void testColumnLineageBuilder(ParseTree parseTree) {

        VirtualColumnVisitor visitor = new VirtualColumnVisitor();

        VirtualTable tableTree = visitor.parseTreeToVirtualTable(parseTree);
//        parseTree.accept(visitor);

        ColumnLineageBuilder columnLineageBuilder = new ColumnLineageBuilder();
        ColumnLineage columnLineage = columnLineageBuilder.build(tableTree);
        String jsonString = JSON.toJSONString(columnLineage);
        System.out.println(jsonString);

    }

}
