package com.jeng.flink.config;

import java.util.Collections;
import java.util.List;

/**
 * The SQLConfig
 *
 * @author JiaZheng
 * @create 2019-04-09 11:48
 */
public class SQLConfig {

    //SQL配置
    private List<SQLModel> sqlModels;

    //排序标记
    private boolean sqlModelSortedFlag = false;

    /**
     * 获取已排序的SQLModel.
     *
     * @return the sorted sql models
     */
    public List<SQLModel> getSortedSqlModels() {
        if (!sqlModelSortedFlag) {
            Collections.sort(sqlModels);
            sqlModelSortedFlag = true;
        }
        return sqlModels;
    }


    /**
     * get size.
     *
     * @return the int
     */
    public int size(){
        return sqlModels.size();
    }

    public void setSqlModels(List<SQLModel> sqlModels) {
        this.sqlModels = sqlModels;
    }
}
