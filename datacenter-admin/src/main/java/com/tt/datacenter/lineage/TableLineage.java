package com.tt.datacenter.lineage;

import com.tt.datacenter.lineage.lib.SourceTable;
import com.tt.datacenter.lineage.lib.TargetTable;
import com.tt.datacenter.schema.base.Table;

import java.util.ArrayList;
import java.util.List;

/**
 * 表级别的血缘关系
 */
public class TableLineage {
    // 输出表，可能会存在多个insert into table，所以targetTable使用List类型
    private final List<TargetTable> targetTables;
    // 来源表
    private final List<SourceTable> sourceTables;

    public TableLineage() {
        this.targetTables = new ArrayList<>();
        this.sourceTables = new ArrayList<>();
    }

    public TableLineage(List<TargetTable> targetTables, List<SourceTable> sourceTables) {
        this.targetTables = targetTables;
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
    public boolean addSourceTable(SourceTable sourceTable) {
        return sourceTables.add(sourceTable);
    }

    public boolean addSinkTable(TargetTable targetTable) {
        return targetTables.add(targetTable);
    }

    public List<SourceTable> getSourceTables() {
        return sourceTables;
    }

    public List<TargetTable> getTargetTables() {
        return targetTables;
    }
}
