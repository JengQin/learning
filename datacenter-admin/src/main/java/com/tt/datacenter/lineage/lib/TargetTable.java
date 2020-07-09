package com.tt.datacenter.lineage.lib;

import com.tt.datacenter.schema.base.DataBase;
import com.tt.datacenter.schema.base.Schema;
import com.tt.datacenter.schema.base.Table;

public class TargetTable extends Table {

    public TargetTable(String tableName) {
        super(DataBase.DEFAULT_DATABASE, tableName);
    }

    public TargetTable(String dbName, String tableName) {
        super(dbName, tableName);
    }

    public TargetTable(String dbName, String tableName, String alias) {
        super(dbName, tableName, alias);
    }

    public TargetTable(String dbName, String tableName, String alias, Schema columnSchema) {
        super(dbName, tableName, alias, columnSchema);
    }

}
