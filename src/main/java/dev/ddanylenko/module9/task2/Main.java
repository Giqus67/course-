package dev.ddanylenko.module9.task2;

import dev.ddanylenko.module8.task1.Lists;
import dev.ddanylenko.module8.task6.Person;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = Lists.getPersons();
        list.stream().
                filter(e -> e.getSalary() > 60_000).
                sorted((per1, per2) -> (int) (per1.getSalary() - per2.getSalary()))
                .toList().forEach(System.out::println);
    }
}
