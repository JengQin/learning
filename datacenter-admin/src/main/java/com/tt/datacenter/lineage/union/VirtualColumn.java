package com.tt.datacenter.lineage.union;

import com.tt.datacenter.schema.base.Expression;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class VirtualColumn {

    // 列名
    private String columnName;
    // 列的下标: 从0开始
    private Integer columnIndex;

    // column的表达式
    private Expression expression;

    // 依赖的源字段
    private List<VirtualColumn> dependencyColumns = new ArrayList<>();

    // 所属的VirtualTable
    private VirtualTable virtualTable;
    // VirtualTable的临时表名
    private String tableAlias;

    public VirtualColumn() {
    }

    public VirtualColumn(String columnName, Integer columnIndex) {
        this.columnName = columnName;
        this.columnIndex = columnIndex;
    }

    /**
     * 添加依赖的源字段
     *
     * @param sourceColumn
     * @return
     */
    public boolean addDependencyColumns(VirtualColumn sourceColumn) {
        if (dependencyColumns.contains(sourceColumn)) {
            return true;
        }
        return this.dependencyColumns.add(sourceColumn);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<VirtualColumn> getDependencyColumns() {
        return dependencyColumns;
    }

    public VirtualTable getVirtualTable() {
        return virtualTable;
    }

    public void setVirtualTable(VirtualTable virtualTable) {
        this.virtualTable = virtualTable;
    }

    public String getTableAlias() {
        return tableAlias;
    }

    public void setTableAlias(String tableAlias) {
        this.tableAlias = tableAlias;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public Integer getColumnIndex() {
        return columnIndex;
    }

    public void setColumnIndex(Integer columnIndex) {
        this.columnIndex = columnIndex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VirtualColumn that = (VirtualColumn) o;
        return Objects.equals(columnName, that.columnName) &&
                Objects.equals(columnIndex, that.columnIndex) &&
                Objects.equals(tableAlias, that.tableAlias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnName, columnIndex, tableAlias);
    }

    @Override
    public String toString() {
        return "VirtualColumn{" +
                "columnName='" + columnName + '\'' +
                ", columnIndex=" + columnIndex +
                ", tableAlias='" + tableAlias + '\'' +
                '}';
    }
}
