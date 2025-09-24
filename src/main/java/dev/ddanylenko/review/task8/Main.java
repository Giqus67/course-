package dev.ddanylenko.review.task8;

import dev.ddanylenko.module8.task1.Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Lists.getList(10);
        FileWorker.writeToFile("numbers.txt", list);
        FileWorker.readFromFile("numbers.txt");
        FileWorker.copyFile("numbers.txt", "numbers123.txt");
        FileWorker.countStrings("numbers.txt");
    }
}
