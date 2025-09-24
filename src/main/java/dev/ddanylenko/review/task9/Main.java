package dev.ddanylenko.review.task9;

import dev.ddanylenko.module8.task1.Lists;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 6, 321,87213, 123, 721, 8, 2, 734, 8231};
        Container<Integer> c = new Container<>();
        System.out.println("Array before " + Arrays.toString(array));
        c.swap(array, 2, 3);
        System.out.println("Array after " + Arrays.toString(array));
        Pair<Integer, String> first = new Pair<>(1, "one");
        first.printValues();
        Pair<Integer, String> second = new Pair<>(2, "two");
        second.printValues();
        Pair<Integer, String> third = new Pair<>(3, "three");
        third.printValues();
        c.findMax(array, (num1, num2)-> num2 - num1);
    }
}
