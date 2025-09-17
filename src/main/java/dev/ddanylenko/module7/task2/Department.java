package dev.ddanylenko.module7.task2;

import dev.ddanylenko.module7.task2.Entities.Employee;

import java.util.List;

public class Department <T extends Employee> {

    List<T> employees;

    public Department(List<T> employees) {
        this.employees = employees;
    }

    public void addEmployee(T employee) {
        employees.add(employee);
    }

    public List<T> getEmployees() {
        return employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employees=" + employees +
                '}';
    }
}
