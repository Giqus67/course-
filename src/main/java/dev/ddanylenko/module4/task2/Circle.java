package dev.ddanylenko.module4.task2;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void printArea() {
        System.out.println("Circle square: " + getArea());
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
