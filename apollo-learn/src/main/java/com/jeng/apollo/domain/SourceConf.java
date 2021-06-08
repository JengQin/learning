package com.jeng.apollo.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * The SourceConf
 *
 * @author JiaZheng
 * @create 2021-06-08 22:57
 */
@Data
@ConfigurationProperties(prefix = "source")
@Component
public class SourceConf {
    private Integer appId;

    private String appName;
}
