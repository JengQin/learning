package com.tt.datacenter.lineage.union;

import java.util.List;

/**
 * union集合操作之后的结果表
 */
public class UnionTable extends VirtualTable{


    public UnionTable(TableType type, String tableAlias) {
        super(type, tableAlias);
    }

    /**
     * 生成union结果集的列，并处理列的依赖关系
     */
    public void generateColumns() {
        List<VirtualTable> children = getDependencyTable();
        // 获取第一个select结果集的列信息
        List<VirtualColumn> selectColumns = children.get(0).getColumns();

        // 生成列信息
        for (VirtualColumn selectColumn : selectColumns) {
            Integer columnIndex = selectColumn.getColumnIndex();
            String columnName = selectColumn.getColumnName();

            VirtualColumn currentColumn = new VirtualColumn(columnName,columnIndex);

            // 设置列的依赖
            for (VirtualTable child : children) {
                VirtualColumn childColumn = child.getColumns().get(columnIndex);
                currentColumn.addDependencyColumns(childColumn);
            }

            // 设置列所属的table
            currentColumn.setVirtualTable(this);
            currentColumn.setTableAlias(this.tableAlias);
        }
    }
}
