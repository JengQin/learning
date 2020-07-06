package com.tt.datacenter.schema.base;

import com.tt.datacenter.schema.BaseColumn;
import com.tt.datacenter.schema.BaseTable;

public class Column implements BaseColumn {
    // 列名
    private String columnName;
    // column的别名
    private String alias;
    // column的表达式
    private String columnExpr;
    // column所在的表
    private BaseTable table;
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
    public String getColumnExpr() {
        return columnExpr;
    }

    @Override
    public BaseTable getTable() {
        return table;
    }

    @Override
    public String getDataType() {
        return null;
    }
}
