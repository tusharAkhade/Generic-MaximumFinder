package com.tushar.max;

public class MaxFinder {

    public static <T extends Comparable> T findMax(T value1, T value2, T value3) {
        T max = value1;
        if (value2.compareTo(max) > 0) {
            max = value2;
        }
        if (value3.compareTo(max) > 0) {
            max = value3;
        }
        System.out.printf("Maximum of %s %s %s is %s \n", value1, value2, value3, max);
        return max;
    }
    
}
