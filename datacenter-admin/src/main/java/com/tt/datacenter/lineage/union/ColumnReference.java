package com.tt.datacenter.lineage.union;

import java.util.Objects;

/**
 * expression表达式中引用的列
 */
public class ColumnReference {

    private String table;
    private String columnName;

    public ColumnReference(String table, String columnName) {
        this.table = table;
        this.columnName = columnName;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColumnReference that = (ColumnReference) o;
        return Objects.equals(table, that.table) &&
                Objects.equals(columnName, that.columnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, columnName);
    }

    @Override
    public String toString() {
        return "ColumnReference{" +
                "table='" + table + '\'' +
                ", columnName='" + columnName + '\'' +
                '}';
    }
}
