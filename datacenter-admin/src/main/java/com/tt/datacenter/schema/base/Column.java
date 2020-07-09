package com.tt.datacenter.schema.base;

import com.tt.datacenter.schema.BaseColumn;

public class Column implements BaseColumn {
    // 列名
    private String columnName;
    // column的别名
    private String alias;
    // column的表达式
    private Expression columnExpr;
    // column所在的表
    private Table table;
    // column的数据类型
    private String dataType;

    @Override
    public String getName() {
        return columnName;
    }

    @Override
    public String getAlias() {
        return alias;
    }

    @Override
    public Expression getColumnExpr() {
        return columnExpr;
    }

    @Override
    public Table getTable() {
        return table;
    }

    @Override
    public String getDataType() {
        return null;
    }
}
