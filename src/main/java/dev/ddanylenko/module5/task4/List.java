package dev.ddanylenko.module5.task4;

import java.util.ArrayList;
import java.util.Iterator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ivan");
        list.add("Mykola");
        list.addAll(java.util.List.of("Denys", "John", "Stephan"));
        System.out.println("List: "+list);
        list.remove(1);
        System.out.println("List after remove first index: "+list);
        list.set(0, "Alex");
        System.out.println( "List after set new student: "+list);
        System.out.println("Contains Alex: " + list.contains("Alex"));
        ArrayList<Integer> integers = getList(10);
        System.out.println("List of integers: " + integers);
        removeOdd(integers);
        System.out.println("List after remove odd numbers" + integers);
    }
    public static ArrayList<Integer> getList(int value) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }

    public static void removeOdd(ArrayList<Integer> list){
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            int i = iterator.next();
            if(i % 2 != 0){
                iterator.remove();
            }
        }
    }
}
