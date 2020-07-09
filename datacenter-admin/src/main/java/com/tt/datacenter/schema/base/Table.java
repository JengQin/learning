package com.tt.datacenter.schema.base;

import com.tt.datacenter.schema.BaseTable;

public class Table implements BaseTable {
    private String dbName;
    private String tableName;
    private String alias;
    private Schema columnSchema;

    public Table(String tableName) {
        this(DataBase.DEFAULT_DATABASE,tableName);
    }

    public Table(String dbName, String tableName) {
        this(dbName,tableName,null);
    }

    public Table(String dbName, String tableName, String alias) {
        this(dbName, tableName, alias, null);
    }

    public Table(String dbName, String tableName, String alias, Schema columnSchema) {
        this.dbName = dbName;
        this.tableName = tableName;
        this.alias = alias;
        this.columnSchema = columnSchema;
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public String getAlias() {
        return alias;
    }

    @Override
    public String getDBName() {
        return dbName;
    }

    @Override
    public Schema getColumns() {
        return columnSchema;
    }

    @Override
    public String toString() {
        return "Table{" +
                "dbName='" + dbName + '\'' +
                ", tableName='" + tableName + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
