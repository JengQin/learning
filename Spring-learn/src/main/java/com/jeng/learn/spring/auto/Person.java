package com.jeng.learn.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    @Autowired
    private House house;

    public Person() {
    }

    public Person(House house) {
        this.house = house;
    }

    private String name = "lansem";

    public int getHouseSize() {
        return house.getArea();
    }

    public String getName() {
        return name;
    }
}
