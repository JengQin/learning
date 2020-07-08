package com.tt.datacenter.schema.base;

import com.tt.datacenter.schema.BaseColumn;
import com.tt.datacenter.schema.BaseTable;

import java.util.List;

import static com.tt.datacenter.schema.base.DataBase.DEFAULT_DATABASE;

public class Table implements BaseTable {
    private String dbName;
    private String tableName;
    private String alias;
    private List<BaseColumn> columns;

    public Table(String tableName) {
        this(DEFAULT_DATABASE,tableName);
    }

    public Table(String dbName, String tableName) {
        this(dbName,tableName,null);
    }

    public Table(String dbName, String tableName, String alias) {
        this(dbName, tableName, alias, null);
    }

    public Table(String dbName, String tableName, String alias, List<BaseColumn> columns) {
        this.dbName = dbName;
        this.tableName = tableName;
        this.alias = alias;
        this.columns = columns;
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
    public List<BaseColumn> getColumns() {
        return columns;
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
