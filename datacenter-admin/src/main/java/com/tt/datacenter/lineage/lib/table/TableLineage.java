package com.tt.datacenter.lineage.lib.table;

import com.tt.datacenter.schema.base.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * 表级别的血缘关系
 */
public class TableLineage {
    // 输出表，
    private Table targetTable;
    // 来源表
    private final List<Table> sourceTables;

    public TableLineage() {
        this.sourceTables = new ArrayList<>();
    }

    public TableLineage(Table targetTable, List<Table> sourceTables) {
        this.targetTable = targetTable;
        this.sourceTables = sourceTables;
    }

    /**
     * 判断是否有source table
     *
     * @return 是否有source table
     */
    public boolean hasSourceTable() {
        return null != sourceTables && sourceTables.isEmpty();
    }

    /**
     * 添加一个source table
     *
     * @param sourceTable source table
     * @return add result
     */
    public boolean addSourceTable(Table sourceTable) {
        return sourceTables.add(sourceTable);
    }

    public void setTargetTable(Table targetTable) {
        this.targetTable = targetTable;
    }

    public Table getTargetTable() {
        return targetTable;
    }

    public List<Table> getSourceTables() {
        return sourceTables;
    }
}
