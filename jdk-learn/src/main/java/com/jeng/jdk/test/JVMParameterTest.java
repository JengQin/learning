package com.jeng.jdk.test;

import java.util.Map;
import java.util.Properties;

public class JVMParameterTest {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        for (Object key : properties.keySet()) {
            System.out.println(key + " = " + properties.getProperty((String) key));
        }
        System.out.println("------------------------------");
        System.out.println("------------------------------");
        Map<String, String> env = System.getenv();
        for (String key : env.keySet()) {
            System.out.println(key.toLowerCase() + " = " + env.get(key));
        }

        System.out.println(properties.size() + "," + env.size());
    }
}
