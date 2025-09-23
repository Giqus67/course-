package dev.ddanylenko.review.task3;

import dev.ddanylenko.module8.task1.Lists;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = Lists.getArray(10);
        int[] duplicates = {1, 2, 3, 4, 1, 2, 4, 10, 2, 7};
        int a = 313131;
        int b = 518;
        String string = "Hello world";
        System.out.println("Array of: " + Arrays.toString(array));
        System.out.println("Max in array: " + WorkWithArray.findMax(array));
        System.out.println("Reverse string: " + string + " is - " + WorkWithArray.reverse(string));
        System.out.println(a + " is even - " + IsEven.isEven(a));
        System.out.println("GCD of " + a + " and " + b + " is " + FindGCD.findGCD(a, b));
        System.out.println("Remove duplicates form" + Arrays.toString(duplicates) + ": " + Arrays.toString(WorkWithArray.removeDuplicates(duplicates)));
    }
}
