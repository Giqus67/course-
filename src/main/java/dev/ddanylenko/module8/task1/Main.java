package dev.ddanylenko.module8.task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Lists.getList(10);
        System.out.println("List before: "+list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer int1, Integer int2) {
                return int2 - int1;
            }
        });
        System.out.println("List after: "+list);
        String[] str = Lists.getStrings();
        System.out.println("Array before: "+Arrays.toString(str));
        Arrays.sort(str, (str1, str2) -> str1.length() - str2.length());
        System.out.println("Array after sort by length: "+Arrays.toString(str));
        Arrays.sort(str, (str1, str2) -> str1.compareTo(str2));
        System.out.println("Array after sort by alphabet order: "+Arrays.toString(str));
    }

}
