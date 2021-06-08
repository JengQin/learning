package com.jeng.apollo.service;

import com.jeng.apollo.domain.SourceConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * The ApolloServiceTest
 *
 * @author JiaZheng
 * @create 2021-06-08 23:02
 */
@Component
public class ApolloServiceTest {
    @Value("${sink.config.tableName:xxx_table}")
    private String sinkTable;

    @Autowired
    private SourceConf sourceConf;

    public void run() {
        System.out.println("sinkTable=" + sinkTable);
        System.out.println("sourceConf=" + sourceConf);
    }
}
