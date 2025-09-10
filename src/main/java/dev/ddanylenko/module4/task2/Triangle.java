package dev.ddanylenko.module4.task2;

public class Triangle extends Shape{

    private double a;

    private double b;

    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return squarePerimeter(a, b, c);
    }

    @Override
    public void printArea() {
        System.out.println("Triangle square: " + getArea());
    }

    private double squarePerimeter(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
