package com.tt.datacenter.lineage.union;

import java.util.ArrayList;
import java.util.List;

public abstract class TableNode {
    /**
     * 虚表的类型
     */
    public static enum TableType {
        INSERT_TABLE,   // insert into语句的目标表
        UNION_RESULT,   // union的结果
        SELECT_RESULT,  // select的结果
        SOURCE         // 来源表
    }

    // 表的类型
    protected TableType type;

    // 临时表名
    protected String tableAlias;

    // 数据库名
    protected String dbName;

    // 查询结果的列信息：包含的列
    protected List<VirtualColumn> columns = new ArrayList<>();

    // 依赖的VirtualTable
    protected List<TableNode> dependencyTable = new ArrayList<>();

    // 上层的父节点，通常情况下只有一个parent，但如果是with子句中的select，有可能会被多个parent引用
    protected List<TableNode> parentTable = new ArrayList<>();

    public TableNode(TableType type, String tableAlias) {
        this.type = type;
        this.tableAlias = tableAlias;
    }

    /**
     * 添加列
     *
     * @param column
     * @return
     */
    abstract public boolean addColumn(VirtualColumn column);

    /**
     * 加入依赖的子表
     *
     * @param virtualTable
     * @return
     */
    abstract public boolean addDependencyTable(TableNode virtualTable);

    /**
     * 添加parent table
     * @param virtualTable
     * @return
     */
    abstract public boolean addParentTable(TableNode virtualTable);
    /**
     * 获取列的个数
     * @return
     */
    public int getColumnSize() {
        return columns.size();
    }
    /**
     * 获取指定下标的列
     * @return
     */
    public VirtualColumn getColumnByIndex(int index) {
        return columns.get(index);
    }

    /**
     * 通过名称获取dependencyTable
     *
     * @param tableAlias
     * @return
     */
    public TableNode findDependencyTableByAlias(String tableAlias) {
        for (TableNode table : dependencyTable) {
            if (table.getTableAlias().equals(tableAlias)) {
                return table;
            }
        }
        throw new RuntimeException(this.tableAlias + "中没有这个的dependencyTable: " + tableAlias);
    }

    /**
     * 通过名称获取column
     * @param columnName
     * @return
     */
    public VirtualColumn getColumnByName(String columnName) {
        for (VirtualColumn column : columns) {
            if (columnName.equals(column.getColumnName())) {
                return column;
            }
        }
        return null;
    }

    /**
     * 从所有的dependencyTable中获取指定的列
     *
     * @param columnName
     * @return
     */
    public VirtualColumn findColumnInAllDependencyTable(String columnName) {
        VirtualColumn column = null;
        for (TableNode table : dependencyTable) {
            column = ((SelectTableNode)table).getColumnByName(columnName);
            if (null != column) {
                return column;
            }
        }

        throw new RuntimeException(this.tableAlias + "的所有dependencyTable都没有这个column: " + tableAlias);
    }

    public List<VirtualColumn> getColumns() {
        return columns;
    }

    public List<TableNode> getDependencyTable() {
        return dependencyTable;
    }

    public List<TableNode> getParentTable() {
        return parentTable;
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

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}
