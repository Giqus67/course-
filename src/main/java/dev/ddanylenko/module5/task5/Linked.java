package dev.ddanylenko.module5.task5;

import dev.ddanylenko.module5.task4.List;

import java.util.LinkedList;
import java.util.ListIterator;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> list = fillArray(10);
        System.out.println("LinkedList: " + list);
        removeOdd(list);
        System.out.println("LinkedList after delete odd: " + list);
        list = fillArray(10);
        removeOddReverse(list);
        System.out.println("New Linked list after delete odd in reverse order: " + list);
    }

    public static LinkedList<Integer> fillArray(int size){
        LinkedList<Integer> list = new LinkedList<>();
        for(int i =0; i<size; i++){
            list.add((int)(Math.random()*10));
        }
        return list;
    }

    public static void removeOdd(LinkedList<Integer> list){
        ListIterator<Integer> iterator = list.listIterator();
        while(iterator.hasNext()){
            if(iterator.next()%2 != 0){
                iterator.remove();
            }
        }
    }

    public static void removeOddReverse(LinkedList<Integer> list){
        ListIterator<Integer> iterator = list.listIterator(list.size());
        while(iterator.hasPrevious()){
            int i = iterator.previous();
            if(i %2 != 0){
                iterator.remove();
            }
        }
    }
}
