package com.tt.datacenter.lineage;

import com.tt.datacenter.schema.BaseTable;

import java.util.List;

/**
 * 表级别的血缘关系
 */
public class TableLineage {
    // 输出表
    private BaseTable sinkBaseTable;
    // 来源表
    private List<BaseTable> sourceBaseTables;
}
