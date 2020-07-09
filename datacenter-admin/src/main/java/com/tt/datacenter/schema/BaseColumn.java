package com.tt.datacenter.schema;

import com.tt.datacenter.schema.base.Expression;

public interface BaseColumn {

    /**
     * 获取column的名称
     * @return column的名称
     */
    String getName();

    /**
     * 获取column的别名
     * @return column的别名
     */
    String getAlias();

    /**
     * 获取column的生成公式
     * @return column的生成公式
     */
    Expression getColumnExpr();

    /**
     * 返货column所在的table
     * @return column所在的table
     */
    BaseTable getTable();

    /**
     * column的数据类型
     *
     * @return 数据类型
     */
    String getDataType();
}
