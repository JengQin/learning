package com.tt.datacenter.lineage.lib.column;

/**
 * 来源列
 */
public class SourceColumn {
    // 表名
    private String tableName;
    // 数据库名
    private String dbName;

    // 列名
    private String columnName;


    public SourceColumn(String tableName, String dbName, String columnName) {
        this.tableName = tableName;
        this.dbName = dbName;
        this.columnName = columnName;
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
}
