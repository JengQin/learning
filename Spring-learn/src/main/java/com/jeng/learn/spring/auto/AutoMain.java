package com.jeng.learn.spring.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan
public class AutoMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.jeng.learn.spring.auto");
        context.refresh();
        Person person = (Person) context.getBean("person");
        System.out.println(person.getName());
        System.out.println(person.getHouseSize());
    }
}
