package dev.ddanylenko.module5.task11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
//        countWords("GW250114 was a black hole merger detected by LIGO on January 14, 2025.[2][3] The detection exhibited the clearest gravitational wav" +
//                "e signal to date, with a signal-to-noise ratio (SNR) of approximately 77–80, surpassing GW230814's SNR of 42,[4][5] " +
//                "and identified (with a 4.1σ level of significance) the first overtone of the Kerr solution for a spinning black hole.[6] " +
//                "The findings were corroborated in a September 2025 scientific article.[1]");
        sortUsers();
        findById(7);
    }

    public static void countWords(String string) {
        String[] words = string.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String word : words) {
            map.put(word.toLowerCase(), map.getOrDefault(word.toLowerCase(), 0) + 1);
        }
        Set<String> strings = map.keySet();
        for(String word : strings) {
            System.out.println(word + " : " + map.get(word));
        }
    }

    public static void sortUsers(){
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Denys", 21);
        treeMap.put("Duncan", 35);
        treeMap.put("Bilal", 81);
        treeMap.put("Ronald", 10);
        treeMap.put("Hana", 25);
        treeMap.put("Stephen", 30);
        for(Map.Entry<String, Integer> e :  treeMap.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }

    public static void findById(Integer id){
        Map<Integer, String> map = new HashMap<>();
        map.put( 1, "Denys");
        map.put(2,"Duncan");
        map.put(3,"Bilal");
        map.put(4,"Ronald");
        map.put(5,"Hana");
        map.put(6, "Stephen");
        String string = map.getOrDefault(id, "Not found!");
        System.out.println("Name by id " + id + " : " + string);
        if(!string.equals("Not found!")){
            System.out.println("Map after deleting: ");
            map.remove(id);
            for(Map.Entry<Integer, String> e : map.entrySet()){
                System.out.println(e.getKey() + " : " + e.getValue());
            }
        }
    }
}
