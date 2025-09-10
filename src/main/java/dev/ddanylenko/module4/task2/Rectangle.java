package dev.ddanylenko.module4.task2;

public class Rectangle extends Shape{

    private double width;

    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void printArea() {
        System.out.println("Rectangle square: " + getArea());
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
