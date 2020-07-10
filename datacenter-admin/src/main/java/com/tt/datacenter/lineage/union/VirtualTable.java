package com.tt.datacenter.lineage.union;

import java.util.ArrayList;
import java.util.List;

/**
 * 虚表类，对应于查询过程中生成的临时中间表
 */
public class VirtualTable {

    /**
     * 虚表的类型
     */
    public static enum TableType {
//        FINAL,  // 最终的select结果
        UNION_RESULT,   // union的结果
//        JOIN_RESULT,    // join的结果
        SELECT_RESULT,  // select的结果
        SOURCE,         // 来源表
//        SOURCE_ALIAS    // 给来源表的取别名生成的表，如from dw.tab1 as t1, 其中tab1的是SOURCE，t1是SOURCE_ALIAS
    }


    // 表的类型
    private TableType type;

    // 是否是最终的结果
    private boolean isFinal = false;

    // 临时表名
    public String tableAlias;

    // 查询结果的列信息：包含的列
    private List<VirtualColumn> columns = new ArrayList<>();

    // 依赖的VirtualTable
    private List<VirtualTable> dependencyTable = new ArrayList<>();

    // 上层的父节点，通常情况下只有一个parent，但如果是with子句中的select，有可能会被多个parent引用
    private List<VirtualTable> parentTable = new ArrayList<>();

    public VirtualTable(TableType type, String tableAlias) {
        this.type = type;
        this.tableAlias = tableAlias;
    }

    /**
     * 加入依赖的子查询
     *
     * @param virtualTable
     * @return
     */
    public boolean addDependencyTable(VirtualTable virtualTable) {
        return dependencyTable.add(virtualTable);
    }

    /**
     * 添加parent table
     * @param virtualTable
     * @return
     */
    public boolean addParentTable(VirtualTable virtualTable) {
        return dependencyTable.add(virtualTable);
    }

    /**
     * 加入列信息
     *
     * @param column
     * @return
     */
    public boolean addSelectColumn(VirtualColumn column) {
        return columns.add(column);
    }


    public TableType getType() {
        return type;
    }

    public void setType(TableType type) {
        this.type = type;
    }

    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public List<VirtualColumn> getColumns() {
        return columns;
    }

    public List<VirtualTable> getDependencyTable() {
        return dependencyTable;
    }

    public List<VirtualTable> getParentTable() {

        return parentTable;
    }

    public boolean isFinal() {
        return isFinal;
    }

    public void setFinal(boolean aFinal) {
        isFinal = aFinal;
    }
}
