package com.tushar.max;

public class MaxFinder {
    public static Float findMax(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        System.out.printf("Max values of %s %s %s is %s \n", num1, num2, num3, max);
        return max;
    }
}
