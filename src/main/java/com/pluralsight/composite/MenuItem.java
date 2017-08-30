package com.pluralsight.composite;

/**
 * Created by jingshanyin on 8/28/17.
 */
public class MenuItem extends MenuComponent {

    public MenuItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
