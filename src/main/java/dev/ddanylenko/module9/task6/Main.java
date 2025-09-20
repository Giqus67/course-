package dev.ddanylenko.module9.task6;

import dev.ddanylenko.module8.task1.Lists;
import dev.ddanylenko.module8.task1.Person;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> list = Lists.getPersons();
        Map<Boolean, List<Person>> collect = list.stream().collect(Collectors.partitioningBy(p -> p.getSalary() > 70_000));
        System.out.println("Employee with salary lower than 70.000: " + collect.getOrDefault(false, null));
        System.out.println("Employee with salary upper than 70.000: " + collect.getOrDefault(true, null));

        Map<String, List<Person>> sorted = list.stream().collect(Collectors.groupingBy(Person::getDepartment));

        for(Map.Entry<String, List<Person>> entry : sorted.entrySet()) {
            System.out.println("Department: " + entry.getKey() + "\n " + entry.getValue());
        }

    }
}
