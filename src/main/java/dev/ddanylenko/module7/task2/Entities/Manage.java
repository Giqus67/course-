package dev.ddanylenko.module7.task2.Entities;

public class Manage extends Employee{
    private String position;

    public Manage(Double salary, String name, String position) {
        super(salary, name);
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee= [salary='" + getSalary() + "', name='" + getName() + "', position='" + position + "']";
    }
}
