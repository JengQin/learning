package com.jeng.learn.spring.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(JavaConfig.class);
//        context.refresh();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BaseConfig.class);
        Mp3 mp3 = (Mp3) context.getBean("mp3");
        mp3.play();
    }
}
