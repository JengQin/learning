package com.tt.datacenter.schema.base;

public class DataBase implements com.tt.datacenter.schema.DataBase {

    private String databaseName;

    public static final String DEFAULT_DATABASE = "default";

    @Override
    public String getDatabaseName() {
        return databaseName;
    }

    @Override
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }
}