package com.tt.datacenter.lineage.lib.table;

import com.tt.datacenter.schema.base.DataBase;
import com.tt.datacenter.schema.base.Table;

public class SourceTable extends Table {
    private String alias;

    public SourceTable(String tableName) {
        this(DataBase.DEFAULT_DATABASE, tableName);
    }

    public SourceTable(String dbName, String tableName) {
        super(dbName, tableName);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
