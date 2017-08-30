package com.pluralsight.bridge.shape2;

/**
 * Created by jingshanyin on 8/27/17.
 */
public abstract class Shape {

    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    abstract public void applyColor();

}
