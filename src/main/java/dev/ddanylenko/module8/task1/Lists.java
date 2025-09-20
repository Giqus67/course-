package dev.ddanylenko.module8.task1;

import dev.ddanylenko.module8.task6.Person;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static List<Integer> getList(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }
    public static List<Double> getDoubleList(int n) {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add((Math.random() * 100));
        }
        return list;
    }

    public static String[] getStrings() {
        return new String[]{"Homer Simpson", "is a character", "in the animated television", "series The Simpsons.", "He is the boorish", "father of the Simpson family; with"};
    }


    public static List<Person> getPersons() {
        List<Person> persons = new ArrayList<>(List.of(
                new Person("Markus O'Reilly", 60000, 31, "IT"),
                new Person("Alexandria Fowler", 120000, 50, "IT"),
                new Person("Dillan Cherry", 115000, 55, "Manager>"),
                new Person("Kate Humphrey", 55000, 21, "IT"),
                new Person("Kurt Waters", 80000, 35, "IT"),
                new Person("Andrew Grant", 70000, 41, "Manager"),
                new Person("Tommy Flynn", 75000, 31, "IT"),
                new Person("Kenny Donaldson", 66000, 25, "Manager"),
                new Person("Katerina Olson", 80000, 26, "IT"),
                new Person("Alan Branch", 50000, 20, "Manager")
        ));
        return persons;
    }
}
