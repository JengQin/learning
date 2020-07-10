package com.tt.datacenter.lineage.lib.column;

import com.tt.datacenter.schema.base.Expression;

import java.util.List;

public class SelectColumn {

    // 列名
    private String columnName;
    // 列的下标
    private Integer columnIndex;

    // column的表达式
    private Expression expression;

    // 依赖的源字段
    private List<SelectColumn> sourceColumns;

    // 所属的selectQuery，以及select结果的临时表名
    private SelectQuery selectQuery;
    private String tableName;

    /**
     * 添加依赖的源字段
     *
     * @param sourceColumn
     * @return
     */
    public boolean addSourceColumns(SelectColumn sourceColumn) {
        return this.sourceColumns.add(sourceColumn);
    }

    public Expression getExpression() {
        return expression;
    }

    public void setExpression(Expression expression) {
        this.expression = expression;
    }

    public List<SelectColumn> getSourceColumns() {
        return sourceColumns;
    }

    public SelectQuery getSelectQuery() {
        return selectQuery;
    }

    public void setSelectQuery(SelectQuery selectQuery) {
        this.selectQuery = selectQuery;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }
}
