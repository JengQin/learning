package com.jeng.design.pattern.structural.bridge;

import com.jeng.design.pattern.structural.bridge.color.Blue;
import com.jeng.design.pattern.structural.bridge.shape.SquareShape;

public class BridgeClient {

    public static void main(String[] args) {
        Color color = new Blue();
        Shape shape = new SquareShape(color);

        shape.draw();
    }
}
