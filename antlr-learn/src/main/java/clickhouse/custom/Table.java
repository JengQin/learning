package clickhouse.custom;

public class Table {
    private String databaseName;
    private String tableName;

    public Table() {
    }

    public Table(String databaseName, String tableName) {
        this.databaseName = databaseName;
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    @Override
    public String toString() {
        return "Table{" +
                "databaseName='" + databaseName + '\'' +
                ", tableName='" + tableName + '\'' +
                '}';
    }
}
