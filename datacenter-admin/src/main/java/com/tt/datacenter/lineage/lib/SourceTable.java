package com.tt.datacenter.lineage.lib;

import com.tt.datacenter.schema.base.DataBase;
import com.tt.datacenter.schema.base.Schema;
import com.tt.datacenter.schema.base.Table;

public class SourceTable extends Table {

    public SourceTable(String tableName) {
        super(DataBase.DEFAULT_DATABASE, tableName);
    }

    public SourceTable(String dbName, String tableName) {
        super(dbName, tableName);
    }

    public SourceTable(String dbName, String tableName, String alias) {
        super(dbName, tableName, alias);
    }

    public SourceTable(String dbName, String tableName, String alias, Schema columnSchema) {
        super(dbName, tableName, alias, columnSchema);
    }

}
