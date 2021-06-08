package com.jeng.apollo;

import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.ConfigChangeListener;
import com.ctrip.framework.apollo.ConfigService;
import com.ctrip.framework.apollo.model.ConfigChange;
import com.ctrip.framework.apollo.model.ConfigChangeEvent;

/**
 * The Test
 *
 * @author JiaZheng
 * @create 2021-06-07 22:26
 */
public class Test {


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("env", "DEV");
        Config config = ConfigService.getAppConfig();
        String key = "dsp.application.name";
        String defaultValue = "000";
        String value = config.getProperty(key, defaultValue);

        System.out.println(value);


        config.addChangeListener(new ConfigChangeListener() {
            @Override
            public void onChange(ConfigChangeEvent changeEvent) {
                System.out.println("changes for namespace" + changeEvent.getNamespace());
                for (String key : changeEvent.changedKeys()) {
                    ConfigChange change = changeEvent.getChange(key);
                    System.out.println(String.format("%s, %s: %s ---> %s", change.getChangeType(), change.getPropertyName(), change.getOldValue(), change.getNewValue()));
                }
            }
        });

        Thread.sleep(100000);
    }
}
