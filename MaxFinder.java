package com.tushar.max;

public class MaxFinder<E> {
    E value1;
    E value2;
    E value3;

    public MaxFinder(E val1, E val2, E val3) {
        this.value1 = val1;
        this.value2 = val2;
        this.value3 = val3;
    }

    public <E extends Comparable> E findMax(E value1, E value2, E value3) {
        E max = value1;
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
