package dev.ddanylenko.module5.task10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        testSet();
        uniqueLetters("GW250114 was a black hole merger detected by LIGO on January 14, 2025.[2][3] The detection exhibited the clearest gravitational wave signal to date, with a signal-to-noise ratio (SNR) of approximately 77–80, surpassing GW230814's SNR of 42,[4][5] and identified (with a 4.1σ level of significance) the" +
                " first overtone of the Kerr solution for a spinning black hole.[6] The findings were corroborated in a September 2025 scientific article.[1]");
        sortCarsByYear();
    }

    public static void testSet(){
        System.out.println("Will, will Will will Will Will's will? ");
        Set<String> set = new HashSet<String>();
        set.add("Will");
        set.add("will");
        set.add("Will");
        set.add("will");
        set.add("Will");
        set.add("Will's ");
        set.add("will");
        System.out.println("Sentence after adding to set: " + set);
    }

    public static void uniqueLetters(String s){
        System.out.println("Sentence to check: " + s);
        Set<Character> characters = new HashSet<>();
        for(char i :  s.toCharArray()){
            characters.add(i);
        }
        System.out.println("Sentence after check: " + characters);
    }

    public static void sortCarsByYear(){
        TreeSet<Car> cars = new TreeSet<>(Set.of(
                new Car("Model X", "Tesla", 2016),
                new Car("Cheeroke", "Jepp", 2017),
                new Car("M5", "BMW", 2024),
                new Car("Accent", "Hyundai", 2008),
                new Car("Tahoe", "Chevrolet", 1998),
                new Car("Tahoe", "Chevrolet", 1998)
        ));
        System.out.println(cars);
    }
}
