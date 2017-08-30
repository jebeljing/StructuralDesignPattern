package com.pluralsight.bridge.shape2;

/**
 * Created by jingshanyin on 8/27/17.
 */
public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
