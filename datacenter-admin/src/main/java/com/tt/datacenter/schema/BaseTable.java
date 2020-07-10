package com.tt.datacenter.schema;

public interface BaseTable {

    /**
     * 获取表名
     * @return table name
     */
    String getTableName();

    /**
     * 获取table所在的数据库名称
     *
     * @return database name
     */
    String getDBName();


}
