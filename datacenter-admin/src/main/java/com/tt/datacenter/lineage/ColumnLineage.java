package com.tt.datacenter.lineage;

import com.tt.datacenter.schema.BaseColumn;

import java.util.List;

/**
 * 列级别的血缘关系
 */
public class ColumnLineage {
    // 最终生成的列
    private BaseColumn finalBaseColumn;
    // 依赖的列
    private List<BaseColumn> sourceBaseColumns;
}
