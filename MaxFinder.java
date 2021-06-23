package com.tushar.max;
import java.util.Scanner;

/**
 * Finding the maximum value in Integer, Float, String array using Generic type.
 * @author Tushar Akhade
 * @since 20 Jun 2021
 */

public class MaxFinder {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Press 1 to find maximum of Integers\nPress 2 to find maximum of Float number\nPress 3 to find maximum of String");
        System.out.print("Enter option : ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter a size of Integer array: ");
                int size = scanner.nextInt();
                Integer[] integersArray = new Integer[size];
                integersArray = printInteger(integersArray, size);
                Integer integerMax = findMax(integersArray);
                System.out.println("Maximum integer value is :" + integerMax);
                break;
            case 2:
                System.out.println("Enter a size of float array: ");
                size = scanner.nextInt();
                Float[] floatsArray = new Float[size];
                floatsArray = printFloat(floatsArray, size);
                Float floatMax = findMax(floatsArray);
                System.out.println("Maximum float number is :" + floatMax);
                break;
            case 3:
                System.out.println("Enter a size of String array: ");
                size = scanner.nextInt();
                String[] stringsArray = new String[size];
                stringsArray = printString(stringsArray, size);
                String stringMax = findMax(stringsArray);
                System.out.println("Maximum String is :" + stringMax);
                break;
            default:
                System.out.println("Invalid input.");
        }
    }

    public static Integer[] printInteger(Integer[] integersArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            integersArray[i] = scanner.nextInt();
        }
        return integersArray;
    }

    public static Float[] printFloat(Float[] floatsArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            floatsArray[i] = scanner.nextFloat();
        }
        return floatsArray;
    }

    public static String[] printString(String[] stringsArray, int size) {
        for (int i = 0; i<size; i++) {
            System.out.println("Enter array value : ");
            stringsArray[i] = scanner.next();
        }
        return stringsArray;
    }

    // Generic type method
    // We have to extends Comparable otherwise it will give error while using compareTo() method
    public static <E extends Comparable> E findMax(E[] integers) {
        E max = integers[0];
        for (E i : integers) {
            if (i.compareTo(max) > 0) {
                max = i;
            }
        }
        return max;
    }

}
