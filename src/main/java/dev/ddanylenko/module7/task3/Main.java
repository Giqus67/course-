package dev.ddanylenko.module7.task3;

import dev.ddanylenko.module7.task2.Entities.Developer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(List.of("a", "b", "c", "d", "e", "f", "g", "h"));
        //printElement(list);
        List<Integer> integerList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
        printElement(integerList);
        List<Double> doubles = new ArrayList<>(List.of(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0));
        printElement(doubles);

        List<Object> objects = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
        List<Developer> developers = new ArrayList<>(List.of(new Developer(60000.0, "Denys", "java-developer"),
                new Developer(55000.0, "Antony", "java-script-developer")));

        System.out.println("Upper bound");
        printDeveloper(developers);

        System.out.println();
        System.out.println("Lower bound");
        printDevelopers(objects);
        printDevelopers(developers);

        System.out.println(Box.returnValue(10));
        System.out.println(Box.<Double>returnValue(10.0));
        //System.out.println(Box.<String>returnValue(10.0));
    }

    public static void printElement(List<? extends Number> list){
        for(Number n : list){
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void printDeveloper(List<? extends Developer> list){
        for(Developer developer : list){
            System.out.print(developer);
        }
    }
    public static void printDevelopers(List<? super Developer> list){
        System.out.println(list);
    }

    public static void printALL(List<?> list ){
        System.out.println(list);
    }
}
