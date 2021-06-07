package com.jeng.apollo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigService;

/**
 * The Test
 *
 * @author JiaZheng
 * @create 2021-06-07 22:26
 */
public class Test {


    public static void main(String[] args) {
        Config config = ConfigService.getAppConfig();
        String key = "dsp.application.name";
        String defaultValue = "000";
        String value = config.getProperty(key, defaultValue);

        System.out.println(value);
    }
}
