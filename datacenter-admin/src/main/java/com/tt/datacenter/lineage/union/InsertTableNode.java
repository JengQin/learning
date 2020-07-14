package com.tt.datacenter.lineage.union;

import com.tt.datacenter.schema.base.DataBase;
import org.apache.commons.lang3.StringUtils;

public class InsertTableNode extends TableNode {



    public InsertTableNode(TableType type, String tableAlias) {
        super(type, tableAlias);
        this.dbName = DataBase.DEFAULT_DATABASE;
    }

    public InsertTableNode(TableType type, String tableAlias,String dbName) {
        super(type, tableAlias);
        if (StringUtils.isBlank(dbName)) {
            this.dbName = DataBase.DEFAULT_DATABASE;
        } else {
            this.dbName = dbName;
        }
    }

    /**
     * 加入依赖的子查询
     *
     * @param virtualTable
     * @return
     */
    public boolean addDependencyTable(TableNode virtualTable) {
        return dependencyTable.add(virtualTable);
    }

    /**
     * 添加parent table
     * @param virtualTable
     * @return
     */
    public boolean addParentTable(TableNode virtualTable) {
        return parentTable.add(virtualTable);
    }

    /**
     * 加入列信息
     *
     * @param column
     * @return
     */
    public boolean addColumn(VirtualColumn column) {
        column.setVirtualTable(this);
        column.setTableAlias(tableAlias);

        return columns.add(column);
    }


}
