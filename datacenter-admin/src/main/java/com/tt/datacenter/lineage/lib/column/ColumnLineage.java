package com.tt.datacenter.lineage.lib.column;

import java.util.ArrayList;
import java.util.List;

public class ColumnLineage {

    private List<TargetColumn> columns = new ArrayList<>();


    public List<TargetColumn> getColumns() {
        return columns;
    }

    public void setColumns(List<TargetColumn> columns) {
        this.columns = columns;
    }

    public void addTargetColumn(TargetColumn targetColumn) {
        this.columns.add(targetColumn);
    }
}
