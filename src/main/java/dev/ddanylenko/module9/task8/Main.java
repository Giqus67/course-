package dev.ddanylenko.module9.task8;

import dev.ddanylenko.module8.task1.Lists;
import dev.ddanylenko.module8.task1.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> list = Lists.getPersons();
        list.stream().filter(e -> e.getSalary() > 50_000).findFirst().ifPresent(System.out::println);

    }
}
