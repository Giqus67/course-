package dev.ddanylenko.review.task5;

import java.util.*;
import java.util.stream.Collectors;

public class WorkWithCollections {

    public static void sortByLength(List<String> list){
        Collections.sort(list, Comparator.comparingInt(String::length));
    }

    public static void findMostFrequent(String string){
        String[] list = string.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String str : list){
            map.put(str, map.getOrDefault(str, 0) + 1);
        }
        Set<String> strings = map.keySet();
        for(String str : strings){
            System.out.println(str + " : " + map.get(str));
        }
    }

    public static Set<Integer> deleteDuplicates(List<Integer> list){
        return new HashSet<>(list);
    }

    public static void workWithQueue(List<Integer> list){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(list.getFirst());
        System.out.println("Added in queue " + queue.peek());
        queue.offer(list.get(list.size() -2));
        System.out.println("Added in queue " + list.get(list.size() -2));
        queue.offer(list.get(list.size() -3));
        System.out.println("Added in queue " + list.get(list.size() -3));
        while(!queue.isEmpty()){
            System.out.println("Removed " + queue.poll());
        }

    }
}
