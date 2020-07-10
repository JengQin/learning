package com.tt.datacenter.lineage.union;

import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 原始的数据来源表
 */
public class VirtualSourceTable extends VirtualTable {


    // 真正的表名
    private String tableName;

    //数据库名称
    private String dbName;

    public VirtualSourceTable(String dbName, String tableName, String tableAlias) {
        super(TableType.SOURCE, tableAlias);
        this.dbName = dbName;
        this.tableName = tableName;
    }

    /**
     * 生成union结果集的列，并处理列的依赖关系
     */
    public void generateColumns() {
        VirtualTable parentTable = getParentTable().get(0);
        // 获取parent table的列信息
        List<VirtualColumn> parentColumns = parentTable.getColumns();

        // 生成列信息
        for (VirtualColumn parentColumn : parentColumns) {
            for (VirtualColumn dependencyColumn : parentColumn.getDependencyColumns()) {
                // 判断父表的column依赖列中是否包含当前表的列
                if (dependencyColumn.getTableAlias().equals(tableAlias)) {
                    // TODO: 2020/7/10/010 源表的列信息目前只能从parent中获取，index永远是null。这种方法不够严谨，以后需要改成读取数据库，
                    VirtualColumn currentColumn = new VirtualColumn(dependencyColumn.getColumnName(),dependencyColumn.getColumnIndex());
                    // 设置列所属的table
                    currentColumn.setVirtualTable(this);
                    currentColumn.setTableAlias(this.tableAlias);
                }
            }
        }
    }

    public String getTableAlias() {
        return StringUtils.isNotBlank(tableAlias)? tableAlias : tableName;
    }

    public String getSourceTableName() {
        return tableName;
    }

    public String getDbName() {
        return dbName;
    }

}
