package com.tt.datacenter.lineage.lib.table;

import com.tt.datacenter.schema.base.DataBase;
import com.tt.datacenter.schema.base.Schema;
import com.tt.datacenter.schema.base.Table;

public class TargetTable extends Table {

    public TargetTable(String tableName) {
        this(DataBase.DEFAULT_DATABASE, tableName);
    }

    public TargetTable(String dbName, String tableName) {
        super(dbName, tableName);
    }

}
