package com.jeng.design.pattern.strategy.comparator;

import com.jeng.design.pattern.strategy.Cat;
import com.jeng.design.pattern.strategy.Comparator;

public class CatComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getWeight() > o2.getWeight()) return 1;
        else if (o1.getWeight() < o2.getWeight()) return -1;
        else return 0;
    }
}
