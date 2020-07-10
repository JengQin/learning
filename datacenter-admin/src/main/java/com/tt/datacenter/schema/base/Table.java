package com.tt.datacenter.schema.base;

import com.tt.datacenter.schema.BaseTable;

public class Table implements BaseTable {

    private String dbName;

    private String tableName;

    public Table(String tableName) {
        // 默认的DB名称是“default”
        this(DataBase.DEFAULT_DATABASE,tableName);
    }

    public Table(String dbName, String tableName) {
        this.dbName = dbName;
        this.tableName = tableName;
    }

    @Override
    public String getTableName() {
        return tableName;
    }

    @Override
    public String getDBName() {
        return dbName;
    }


    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String toString() {
        return "Table{" +
                "dbName='" + dbName + '\'' +
                ", tableName='" + tableName + '\'' +
                '}';
    }
}
