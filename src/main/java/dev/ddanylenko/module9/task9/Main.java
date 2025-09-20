package dev.ddanylenko.module9.task9;

import dev.ddanylenko.module8.task1.Lists;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Lists.getList(10_000_000);
        measure(list, true);
        measure(list, false);

    }

    public static <T> void measure(List<T> list, boolean bol) {
        long startTime = System.currentTimeMillis();
        if(bol){
            System.out.println("Sorted by parallel stream!");
            list.parallelStream().sorted().toList();
        }
        else{
            System.out.println("Sorted by casual stream!");
            list.stream().sorted().toList();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed time: " + (endTime - startTime) + "ms");
    }
}
