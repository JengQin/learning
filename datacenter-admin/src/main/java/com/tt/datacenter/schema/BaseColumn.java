package com.tt.datacenter.schema;

public interface BaseColumn {

    /**
     * 获取column的名称
     * @return column的名称
     */
    String getName();

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
