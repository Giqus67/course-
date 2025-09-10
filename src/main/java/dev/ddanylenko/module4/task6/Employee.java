package dev.ddanylenko.module4.task6;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private double salaryKoef;

    public Employee(double salaryKoef) {
        this.salaryKoef = salaryKoef;
    }

    public double getSalaryKoef() {
        return salaryKoef;
    }

    public void setSalaryKoef(double salaryKoef) {
        this.salaryKoef = salaryKoef;
    }

    public abstract double calcSalary();

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<Employee>();
        Developer developer = new Developer("Denys", 1, 1.05);
        employees.add(developer);
        Developer developer1 = new Developer("John", 3, 1.2);
        employees.add(developer1);
        Developer developer2 = new Developer("Victor", 5, 1.00);
        employees.add(developer2);
        Manager manager = new Manager(1.01, "Stacy", 3);
        employees.add(manager);
        Manager manager1 = new Manager(1.2, "Brook", 20);
        employees.add(manager1);
        Manager manager2 = new Manager(1.15, "Stepan", 5);
        employees.add(manager2);
        employees.forEach(System.out::println);
    }
}
