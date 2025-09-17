package dev.ddanylenko.module7.task2.Entities;

public class Employee {
    private Double salary;
    private String name;

    public Employee(Double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

}
