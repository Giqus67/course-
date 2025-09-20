package dev.ddanylenko.module9.task10;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        random(10);
        pow(25);
    }

    public static void random(int limit){
        System.out.println("Random numbers");
        Stream.generate(Math::random ).limit(limit).forEach(System.out::println);
    }

    public static void pow(int limit){
        System.out.println("Pow of numbers");
        Stream.iterate(1, x -> x + 1).limit(limit).map(x -> x * x).forEach(System.out::println);
    }
}
