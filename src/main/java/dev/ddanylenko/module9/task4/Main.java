package dev.ddanylenko.module9.task4;

import dev.ddanylenko.module8.task1.Lists;
import dev.ddanylenko.module8.task1.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> it = Lists.getIT();
        List<Person> managers = Lists.getManagers();
        List<List<Person>> department = new ArrayList<>();
        department.add(it);
        department.add(managers);
        department.stream().
                flatMap(Collection::stream).
                sorted(Comparator.comparingInt(Person::getAge)).
                forEach(System.out::println);
    }
}
