package com.jeng.learn.spring.javaconfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(JavaConfig.class)
public class BaseConfig {

}
