package com.tt.datacenter.schema.base;

import com.tt.datacenter.lineage.union.ColumnReference;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Expression {

    public static enum ExpressionType {

    }


    // 表达式的字符串形式
    private String exprString;

    // 表达式中包含的引用列
    private List<ColumnReference> columnReferences = new ArrayList<>();

    // 表达式中包含的常量
    private Set<String> constReferences = new HashSet<>();

    /**
     * 添加引用的列信息
     *
     * @param columnRef
     * @return
     */
    public boolean addColumnReferences(ColumnReference columnRef) {
        if (columnReferences.contains(columnRef)) {
            return true;
        }
        return this.columnReferences.add(columnRef);
    }

    /**
     * 添加引用的常量
     *
     * @param constRef
     * @return
     */
    public boolean addConstReferences(String constRef) {
        return this.constReferences.add(constRef);
    }

    public Expression(String exprString) {
        this.exprString = exprString;
    }

    public String getExprString() {
        return exprString;
    }

    public void setExprString(String exprString) {
        this.exprString = exprString;
    }

    public List<ColumnReference> getColumnReferences() {
        return columnReferences;
    }

    public Set<String> getConstReferences() {
        return constReferences;
    }
}
