package com.tt.datacenter.lineage.clickhouse;

import com.tt.datacenter.parser.SqlBaseBaseVisitor;
import com.tt.datacenter.parser.SqlBaseParser;
import com.tt.datacenter.schema.base.Table;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.List;

/**
 * 解析sourceTable和TargetTable的visitor
 */
class SourceAndTargetTableVisitor extends SqlBaseBaseVisitor<Object> {

    private final List<Table> sourceTables = new ArrayList<>();

    private final List<Table> targetTables = new ArrayList<>();

    /**
     * 获取sourceTable
     *
     * @param ctx
     * @return
     */
    @Override
    public Object visitSourceTable(SqlBaseParser.SourceTableContext ctx) {
        // 获取table name
        String tableName = ctx.sourceTableName().getText();
        Table sourceTable = new Table(tableName);

        // 获取数据库名
        SqlBaseParser.DatabaseNameContext databaseNameContext = ctx.databaseName();
        if (null != databaseNameContext) {
            sourceTable.setDbName(databaseNameContext.getText());
        }

        // 判断是否有别名 aliasedRelation -> relationPrimary -> sourceTable
        ParserRuleContext parent = ctx.getParent().getParent();
        SqlBaseParser.AliasedRelationContext aliasedRelationContext = (SqlBaseParser.AliasedRelationContext) parent;
        SqlBaseParser.IdentifierContext identifier = aliasedRelationContext.identifier();
        if (null != identifier){
            String tableAlias = identifier.getText();
            sourceTable.setAlias(tableAlias);
        }

        // 加入血缘
        sourceTables.add(sourceTable);

        // 继续往下遍历
        visitChildren(ctx);
        return null;
    }


    /**
     * 解析输出的目标表
     * @param ctx
     * @return
     */
    @Override
    public Object visitInsertInto(SqlBaseParser.InsertIntoContext ctx) {
        SqlBaseParser.TargetTableContext targetTableContext = ctx.targetTable();

        // 获取表名
        String tableName = targetTableContext.targetTableName().getText();
        Table targetTable = new Table(tableName);

        // 获取数据库名称
        SqlBaseParser.DatabaseNameContext databaseNameContext = targetTableContext.databaseName();
        if (null != databaseNameContext) {
            targetTable.setDbName(databaseNameContext.getText());
        }

        // 加入血缘
        targetTables.add(targetTable);

        // 继续往下遍历
        visitChildren(ctx);
        return null;
    }

    public List<Table> getSourceTables() {
        return sourceTables;
    }

    public List<Table> getTargetTables() {
        return targetTables;
    }
}
