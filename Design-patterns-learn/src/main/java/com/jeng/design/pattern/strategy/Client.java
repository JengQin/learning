package com.jeng.design.pattern.strategy;

import com.jeng.design.pattern.strategy.comparator.DogComparator;

public class Client {
    public static void main(String[] args) {
        Dog[] arr = {new Dog(3), new Dog(5), new Dog(1)};

        Sort sort = new Sort();
        sort.sort(arr, new DogComparator());
        for (Dog dog : arr) {
            System.out.println(dog);
        }
    }
}
