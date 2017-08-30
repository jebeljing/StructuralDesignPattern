package com.pluralsight.flyweight;

/**
 * Created by jingshanyin on 8/29/17.
 */
// Instances of Item will be the Flyweights
public class Item {

    private final String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
