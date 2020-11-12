package com.jeng.design.pattern.structural.bridge;

/**
 * 类型抽象类
 */
public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    /**
     * 绘制图形
     */
    protected abstract String drawShape();

    /**
     * 模版方法
     */
    public void draw(){
        String color = this.color.getColor();
        String shape = drawShape();
        System.out.println("正在绘制：" + color + "的" + shape);
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
