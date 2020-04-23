package com.jeng.flink.blink.sql;

import com.jeng.flink.config.SQLConfig;
import com.jeng.flink.config.SQLModel;
import org.apache.flink.api.common.JobExecutionResult;
import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.Table;
import org.apache.flink.table.api.TableEnvironment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BlinkSQLTest {
    private static Logger LOGGER = LoggerFactory.getLogger(BlinkSQLTest.class);
    private SQLConfig sqlConfig;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-BlinkSQLTest.xml");
        BlinkSQLTest blinkSQLTest = applicationContext.getBean(BlinkSQLTest.class);
        blinkSQLTest.execute();
    }

    private void execute() {
        /*创建Flink env,设置：使用Blink Planner，并运行在流模式下*/
        EnvironmentSettings settings = EnvironmentSettings.newInstance()
                .useBlinkPlanner()
                .inStreamingMode()
                .build();
        TableEnvironment tableEnv = TableEnvironment.create(settings);
        /*获取SQL*/
        List<SQLModel> sortedSqlModels = sqlConfig.getSortedSqlModels();
        for (SQLModel sqlModel : sortedSqlModels) {
            String type = sqlModel.getType();
            String sql = sqlModel.getSql();
            LOGGER.info("SQL No: {}, SQL: {}", sqlModel.getSqlNo(), sql);
            System.out.println("SQL No: "+ sqlModel.getSqlNo()+", SQL: "+ sql);
            switch (type) {
                case "CREATE":
                case "INSERT":
                    tableEnv.sqlUpdate(sql);
                    break;
                case "SELECT":
                    Table table = tableEnv.sqlQuery(sql);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported type: " + type);
            }
        }
        try {
            JobExecutionResult blinkSQLTest = tableEnv.execute("BlinkSQLTest");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public SQLConfig getSqlConfig() {
        return sqlConfig;
    }

    public void setSqlConfig(SQLConfig sqlConfig) {
        this.sqlConfig = sqlConfig;
    }
}
