package dev.ddanylenko.module9.task3;

import dev.ddanylenko.module8.task1.Lists;
import dev.ddanylenko.module8.task1.Person;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = Lists.getPersons();
        System.out.println( "Names of employee: ");
        list.stream().
                map(Person::getName).
                toList().forEach(System.out::println);
        System.out.println( "\nEmployee with max salary: ");
        list.stream().max(Comparator.comparingDouble(Person::getSalary)).ifPresent(System.out::println);

        System.out.println( "\nAverage salary: ");
        list.stream().mapToInt(e -> (int) e.getSalary()).
                average().
                ifPresent(System.out::println);
    }
}
