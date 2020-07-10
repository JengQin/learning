package com.tt.datacenter.schema.base;

import com.tt.datacenter.schema.BaseColumn;

public class Column implements BaseColumn {
    // 列名
    private String columnName;
    // column所在的表
    private Table table;
    // column的数据类型
    private String dataType;

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @Override
    public String getName() {
        return columnName;
    }

    @Override
    public Table getTable() {
        return table;
    }

    @Override
    public String getDataType() {
        return dataType;
    }
}
