package dev.ddanylenko.module9.task5;

import dev.ddanylenko.module8.task1.Lists;
import dev.ddanylenko.module8.task1.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Lists.getNotUniquePersons();
        System.out.println("Lists before: ");
        persons.forEach(System.out::println);
        System.out.println("\n\nLists after: ");
        persons.stream().distinct().forEach(System.out::println);
    }
}
