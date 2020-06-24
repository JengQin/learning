package com.jeng.learn.spring.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("house")
public class House {
    private int area = 150;

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
