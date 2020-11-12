package com.jeng.design.pattern.structural.bridge.shape;

import com.jeng.design.pattern.structural.bridge.Shape;
import com.jeng.design.pattern.structural.bridge.Color;

public class SquareShape extends Shape {
    public SquareShape(Color color) {
        super(color);
    }

    @Override
    public String drawShape() {
        return "正方形";
    }
}
