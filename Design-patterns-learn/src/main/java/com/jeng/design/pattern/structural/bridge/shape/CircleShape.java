package com.jeng.design.pattern.structural.bridge.shape;

import com.jeng.design.pattern.structural.bridge.Shape;
import com.jeng.design.pattern.structural.bridge.Color;

public class CircleShape extends Shape {
    public CircleShape(Color color) {
        super(color);
    }

    @Override
    public String drawShape() {
        return "圆形";
    }
}
