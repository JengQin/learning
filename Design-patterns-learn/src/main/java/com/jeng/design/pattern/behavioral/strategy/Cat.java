package com.jeng.design.pattern.behavioral.strategy;

public class Cat {
    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
