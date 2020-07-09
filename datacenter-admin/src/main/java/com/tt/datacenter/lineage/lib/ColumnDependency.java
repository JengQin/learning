package com.tt.datacenter.lineage.lib;

import com.tt.datacenter.schema.base.Column;

import java.util.ArrayList;
import java.util.List;

/**
 * 记录列字段的依赖关系
 */
public class ColumnDependency {

    // 结果字段
    private Column targetColumn;
    // 源字段
    private List<Column> sourceColumns;


    public ColumnDependency() {
        this.sourceColumns = new ArrayList<>();
    }

    /**
     * 添加依赖的源字段
     *
     * @param sourceColumn
     * @return
     */
    public boolean addSourceColumn(Column sourceColumn) {
        return sourceColumns.add(sourceColumn);
    }

    public void setTargetColumn(Column targetColumn) {
        this.targetColumn = targetColumn;
    }

    public Column getTargetColumn() {
        return targetColumn;
    }

    public List<Column> getSourceColumns() {
        return sourceColumns;
    }
}
