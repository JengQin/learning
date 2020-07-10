package com.tt.datacenter.lineage.lib.column;

import com.tt.datacenter.schema.BaseTable;
import com.tt.datacenter.schema.base.GroupBy;
import com.tt.datacenter.schema.base.Where;

import java.util.ArrayList;
import java.util.List;

public class SelectQuery implements BaseTable {




    // 当前层的select所属的类型
    private SelectType type;

    // select结果集的别名
    private String alias;

    // 查询结果的列信息：包含的列，以及列的依赖
    private List<SelectColumn> selectColumns = new ArrayList<>();

    // 查询的where和group by子句
    private Where where;
    private GroupBy groupBy;

    // 依赖的子查询
    private List<SelectQuery> subQueries = new ArrayList<>();

    public SelectQuery(SelectType type) {
        this.type = type;
    }

    public SelectQuery(SelectType type, String alias) {
        this.type = type;
        this.alias = alias;
    }

    /**
     * 加入依赖的子查询
     *
     * @param query
     * @return
     */
    public boolean addSubQuery(SelectQuery query) {
        return subQueries.add(query);
    }

    /**
     * 加入列信息
     *
     * @param selectColumn
     * @return
     */
    public boolean addSelectColumn(SelectColumn selectColumn) {
        return selectColumns.add(selectColumn);
    }

    @Override
    public String getTableName() {
        return alias;   // select结果集的tableName就是alias
    }

    @Override
    public String getDBName() {
        return null;
    }

    public SelectType getType() {
        return type;
    }

    public void setType(SelectType type) {
        this.type = type;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Where getWhere() {
        return where;
    }

    public void setWhere(Where where) {
        this.where = where;
    }

    public GroupBy getGroupBy() {
        return groupBy;
    }

    public void setGroupBy(GroupBy groupBy) {
        this.groupBy = groupBy;
    }
}
