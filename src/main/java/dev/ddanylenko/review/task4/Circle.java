package dev.ddanylenko.review.task4;

public class Circle implements Shape {

    private final int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double calcArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double calcPerimeter() {
        return Math.PI * 2 * r;
    }

    @Override
    public String toString() {
       return "Circle with r = " + r + ". Has area = " + calcArea() + " and perimeter = " + calcPerimeter();
    }
}
