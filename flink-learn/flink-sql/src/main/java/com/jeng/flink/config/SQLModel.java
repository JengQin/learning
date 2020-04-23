package com.jeng.flink.config;

import java.util.Set;

/**
 * The SQLModel
 *
 * @author JiaZheng
 * @create 2019-04-08 15:40
 */
public class SQLModel implements Comparable<SQLModel> {
    /*类型，如CREAT,INSERT,SELECT*/
    protected String type;
    /**
     * SQL编号
     */
    protected int sqlNo;
    /**
     * SQL语句.
     */
    protected String sql;
    /**
     * SQL语句中引用的变量的名称.
     */
    protected Set<String> referencedVariableInSQL;

    /*SQL执行结果的临时表名*/
    protected String resultTempTableName;
    /**
     * SQL执行结果的缓存模式
     */
    protected String resultStorageLevel;

    /**
     * Init.
     */
    public void init(){
        /*解析SQL语句中的引用变量*/
        this.referencedVariableInSQL = RegularMatcherUtils.parseReferencedVariable(sql, RegularMatcherUtils.DEFAULT_REGULAR_EXPR);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSqlNo() {
        return sqlNo;
    }

    public void setSqlNo(int sqlNo) {
        this.sqlNo = sqlNo;
    }

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public Set<String> getReferencedVariableInSQL() {
        return referencedVariableInSQL;
    }

    public void setReferencedVariableInSQL(Set<String> referencedVariableInSQL) {
        this.referencedVariableInSQL = referencedVariableInSQL;
    }

    public String getResultTempTableName() {
        return resultTempTableName;
    }

    public void setResultTempTableName(String resultTempTableName) {
        this.resultTempTableName = resultTempTableName;
    }

    public String getResultStorageLevel() {
        return resultStorageLevel;
    }

    public void setResultStorageLevel(String resultStorageLevel) {
        this.resultStorageLevel = resultStorageLevel;
    }

    public int compareTo(SQLModel other) {
        return Integer.compare(this.sqlNo,other.sqlNo);
    }
}
