package com.pluralsight.bridge.shape2;

/**
 * Created by jingshanyin on 8/27/17.
 */
public class Square extends Shape {

    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        color.applyColor();
    }
}
