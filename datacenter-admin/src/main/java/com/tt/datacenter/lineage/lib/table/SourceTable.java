package com.tt.datacenter.lineage.lib.table;

import com.tt.datacenter.schema.base.DataBase;
import com.tt.datacenter.schema.base.Table;

public class SourceTable extends Table {

    public SourceTable(String tableName) {
        this(DataBase.DEFAULT_DATABASE, tableName);
    }

    public SourceTable(String dbName, String tableName) {
        super(dbName, tableName);
    }

}
