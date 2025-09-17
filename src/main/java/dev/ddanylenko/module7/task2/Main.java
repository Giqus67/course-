package dev.ddanylenko.module7.task2;

import dev.ddanylenko.module7.task2.Entities.Developer;
import dev.ddanylenko.module7.task2.Entities.Manage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> intPair = new Pair<>(1, "one");
        Pair<Double, String> doublePair = new Pair<>(2.0, "two point zero");
        System.out.println(intPair);
        System.out.println(doublePair);

        FindDouble find = new FindDouble();
        System.out.println(find.calculate(10, 20.2f));

        List<Manage> manages = new ArrayList<>(List.of(new Manage(10000.0, "Stacy", "Manager"),
                new Manage(1510.50, "Ivan", "Manager")));
        Department<Manage> manageDepartment = new Department<>(manages);

        System.out.println(manageDepartment.getEmployees());
        List<Developer> developers = new ArrayList<>(List.of(new Developer(60000.0, "Denys", "java-developer"),
                new Developer(55000.0, "Antony", "java-script-developer")));
        Department<Developer> developerDepartment = new Department<>(developers);

        System.out.println(developerDepartment.getEmployees());
    }
}
