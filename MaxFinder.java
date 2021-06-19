package com.tushar.max;

public class MaxFinder {
    public static String findMax(String str1, String str2, String str3) {
        String maxString = str1;
        if (str2.compareTo(maxString) > 0) {
            maxString = str2;
        }
        if (str3.compareTo(maxString) > 0) {
            maxString = str3;
        }
        System.out.printf("Maximum of %s %s %s is %s \n", str1, str2, str3, maxString);
        return maxString;
    }
}
