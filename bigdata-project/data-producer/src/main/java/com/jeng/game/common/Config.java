package com.jeng.game.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * The Config
 *
 * @author JiaZheng
 * @create 2020-05-17 17:25
 */
public class Config {
    public static final String SERVER_HOST="server.host";
    public static final String SERVER_PORT="server.port";
    private static final Properties prop = new Properties();
    static {
        try {
            InputStream in = Config.class.getClassLoader().getResourceAsStream("config.properties");
            prop.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getConfig(String key) {
        return prop.getProperty(key);
    }
}
