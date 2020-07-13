package com.tt.datacenter.lineage.union;

import com.tt.datacenter.schema.base.DataBase;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * 原始的数据来源表
 */
public class VirtualSourceTable extends VirtualTable {


    // 真正的表名
    private String tableName;

    public VirtualSourceTable(String dbName, String tableName, String tableAlias) {
        super(TableType.SOURCE, tableAlias);
        this.tableName = tableName;
        if (StringUtils.isBlank(dbName)) {
            this.dbName = DataBase.DEFAULT_DATABASE;
        } else {
            this.dbName = dbName;
        }
    }

    /**
     * 生成 Source Table的列
     */
    public void generateColumns() {
        VirtualTable parentTable = getParentTable().get(0);
        // 获取parent table的列信息
        List<VirtualColumn> parentColumns = parentTable.getColumns();
        // 获取parent的依赖子表，如果parent的依赖子表只有一个，则parent对子表的引用列不需要指明的table，如如“t1.id”
        int size = parentTable.getDependencyTable().size();
        // 生成列信息
        for (VirtualColumn parentColumn : parentColumns) {
            for (ColumnReference columnRef : parentColumn.getExpression().getColumnReferences()) {
                // 判断父表的column表达式中是否包含当前表的列
                if (1 == size || columnRef.getTable().equals(tableAlias)) {
                    // TODO: 2020/7/10/010 源表的列信息目前只能从parent中获取，columnIndex永远是null。这种方法不够严谨，以后需要改成读取数据库，
                    VirtualColumn currentColumn = new VirtualColumn(columnRef.getColumnName(), null);

                    if (!getColumns().contains(currentColumn)) {
                        this.addColumn(currentColumn);
                    }
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

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String toString() {
        return "VirtualSourceTable{" +
                "type=" + type +
                ", isFinal=" + isFinal +
                ", tableAlias='" + tableAlias + '\'' +
                ", tableName='" + tableName + '\'' +
                ", dbName='" + dbName + '\'' +
                ", columns=" + columns +
                ", dependencyTable=" + dependencyTable +
                '}';
    }
}
