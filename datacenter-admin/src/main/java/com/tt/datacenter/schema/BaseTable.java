package com.tt.datacenter.schema;

import com.tt.datacenter.schema.base.Schema;

import java.util.List;

public interface BaseTable {

    /**
     * 获取表名
     * @return table name
     */
    String getTableName();

    /**
     * 获取表的别名
     * @return 表的别名
     */
    String getAlias();

    /**
     * 获取table所在的数据库名称
     *
     * @return database name
     */
    String getDBName();


    /**
     * 获取table的所有column字段
     *
     * @return table的所有column
     */
    Schema getColumns();
}
