package com.pluralsight.adapter;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jingshanyin on 8/27/17.
 */
public class AdapterEverydayDemo {

    public static void main(String[] args) {
        Integer[] arrayOfInts = new Integer[] { 42, 43, 44};
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);
        System.out.println(arrayOfInts);
        System.out.println(listOfInts);
    }
}
