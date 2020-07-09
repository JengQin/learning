package com.tt.datacenter.lineage.lib;

import com.tt.datacenter.schema.base.GroupBy;
import com.tt.datacenter.schema.base.Schema;
import com.tt.datacenter.schema.base.Table;
import com.tt.datacenter.schema.base.Where;

import java.util.ArrayList;
import java.util.List;

public class SelectQuery extends Table {


    /**
     * 子查询的类型，
     * TEMP: 表示SelectQuery的结果是临时表，如多层嵌套select中的子查询
     * FINAL: 表示SelectQuery的结果是最终的查询结果，如多层嵌套select中最外层select的结果
     * SOURCE: 表是SelectQuery是一个来源表，如"from dw.tb1"中的dw.tb1是一个SOURCE类型的SelectQuery
     */
    public static enum QueryType {
        TEMP,FINAL,SOURCE
    }

    // 当前层的select所属的类型
    private QueryType type;

    // 查询结果的列信息
    private Schema fieldSchema;
    // 列的依赖关系
    private List<ColumnDependency> columnDependencies;

    // 查询的where和group by子句
    private Where where;
    private GroupBy groupBy;

    // 依赖的子查询
    private List<SelectQuery> subQueries = new ArrayList<>();


    public SelectQuery(String tableName) {
        super(tableName);
    }

    public SelectQuery(String dbName, String tableName) {
        super(dbName, tableName);
    }

    public SelectQuery(String dbName, String tableName, String alias) {
        super(dbName, tableName, alias);
    }

    public SelectQuery(String dbName, String tableName, String alias, Schema columnSchema) {
        super(dbName, tableName, alias, columnSchema);
    }

    /**
     * 加入子查询
     *
     * @param query
     * @return
     */
    public boolean addSubQuery(SelectQuery query) {
        return subQueries.add(query);
    }

    public List<SelectQuery> getSubQueries() {
        return subQueries;
    }

    public QueryType getType() {
        return type;
    }

    public void setType(QueryType type) {
        this.type = type;
    }

    public Schema getFieldSchema() {
        return fieldSchema;
    }

    public void setFieldSchema(Schema fieldSchema) {
        this.fieldSchema = fieldSchema;
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
