package dev.ddanylenko.module5.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Listed {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(List.of("Alex", "John", "Bob", "Mike", "Tom", "Adam"));
        System.out.println("List before sort: " + list);
        Collections.sort(list);
        System.out.println("List after sort: " + list);
        Collections.shuffle(list);
        System.out.println("List after shuffle: " + list);
        System.out.println("Min elem of list: " +  Collections.min(list));
        System.out.println("Max elem of list: " + Collections.max(list));
    }
}
