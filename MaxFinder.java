package com.tushar.max;

public class MaxFinder {

    public static <T extends Comparable> T findMax(T value1, T value2, T value3) {
        T maxString = value1;
        if (value2.compareTo(maxString) > 0) {
            maxString = value2;
        }
        if (value3.compareTo(maxString) > 0) {
            maxString = value3;
        }
        System.out.printf("Maximum of %s %s %s is %s \n", value1, value2, value3, maxString);
        return maxString;
    }

}
