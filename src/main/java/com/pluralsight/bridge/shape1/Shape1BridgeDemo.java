package com.pluralsight.bridge.shape1;

/**
 * Created by jingshanyin on 8/27/17.
 */
public class Shape1BridgeDemo {

    public static void main(String[] args) {
        Circle circle = new BlueCircle();

        Square square = new RedSquare();

        Square greenSquare = new GreenSquare();

        circle.applyColor();
        square.applyColor();
        greenSquare.applyColor();
    }
}
