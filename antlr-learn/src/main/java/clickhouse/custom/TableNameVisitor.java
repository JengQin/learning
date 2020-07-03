package clickhouse.custom;

import clickhouse.parser.ClickHouseParser;
import clickhouse.parser.ClickHouseParserBaseVisitor;
import clickhouse.parser.ClickHouseParserVisitor;
import clickhouse.parser.ClickHouseParser.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

import static clickhouse.parser.ClickHouseParser.DOT;

public class TableNameVisitor extends ClickHouseParserBaseVisitor<Table> {
    private List<Table> tables = new ArrayList<>();

    @Override

    public Table visitFull_table_name(Full_table_nameContext ctx) {
        //获取数据库
        Database_nameContext dbNode = ctx.getChild(Database_nameContext.class, 0);
        Table_nameContext tableNameNode = ctx.getChild(Table_nameContext.class, 0);

        Table table = new Table();
        if (null != dbNode) {
//            dbNode.getTokens().get(0).getText();
            // 依次遍历子树的所有叶子节点获取到改rule子树对应的字符串
            String databaseName = dbNode.getText();
            table.setDatabaseName(databaseName);
        }
        table.setTableName(tableNameNode.getText());
        tables.add(table);
        return table;
    }

    public List<Table> getTables() {
        return tables;
    }
}
