package com.jeng.design.pattern.strategy.comparator;

import com.jeng.design.pattern.strategy.Comparator;
import com.jeng.design.pattern.strategy.Dog;

public class DogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o3) {
        if (o1.getFood() > o3.getFood()) return 1;
        else if (o1.getFood() < o3.getFood()) return -1;
        else return 0;
    }
}
