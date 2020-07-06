package com.tt.datacenter.schema.base;

import com.tt.datacenter.schema.BaseColumn;
import com.tt.datacenter.schema.BaseTable;

import java.util.List;

public class Table implements BaseTable {
    private String tableName;
    private String alias;
    private String dbName;
    private List<BaseColumn> columns;

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
}
