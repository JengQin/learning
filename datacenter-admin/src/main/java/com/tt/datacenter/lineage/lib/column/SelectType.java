package com.tt.datacenter.lineage.lib.column;

/**
 * 子查询的类型，
 * TEMP: 表示SelectQuery的结果是临时表，如多层嵌套select中的子查询
 * FINAL: 表示SelectQuery的结果是最终的查询结果，如多层嵌套select中最外层select的结果
 * SOURCE: 表是SelectQuery是一个来源表，如"from dw.tb1"中的dw.tb1是一个SOURCE类型的SelectQuery
 */
public enum SelectType {
    TEMP,FINAL,SOURCE
}
