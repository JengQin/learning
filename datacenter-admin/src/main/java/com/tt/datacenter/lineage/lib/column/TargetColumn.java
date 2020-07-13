package com.tt.datacenter.lineage.lib.column;

import java.util.ArrayList;
import java.util.List;

/**
 * 目标列
 */
public class TargetColumn {
    // 表名
    private String tableName;
    // 数据库名
    private String dbName;

    // 列名
    private String columnName;

    // 表达式
    private String expression;

    // 依赖的列
    private List<SourceColumn> sourceColumns = new ArrayList<>();


    public TargetColumn(String tableName, String dbName, String columnName, String expression) {
        this.tableName = tableName;
        this.dbName = dbName;
        this.columnName = columnName;
        this.expression = expression;
    }

    /**
     * 添加依赖列
     * @param sourceColumn
     */
    public void addSourceColumns(SourceColumn sourceColumn) {
        this.sourceColumns.add(sourceColumn);
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public List<SourceColumn> getSourceColumns() {
        return sourceColumns;
    }

}
