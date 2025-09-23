package dev.ddanylenko.review.task4;

public class Square implements Shape {
    private final int x;

    public Square(int x) {
        this.x = x;
    }

    @Override
    public double calcArea() {
        return x * x;
    }

    @Override
    public double calcPerimeter() {
        return x * 4;
    }

    @Override
    public String toString() {
        return "Circle with x = " + x + ". Has area = " + calcArea() + " and perimeter = " + calcPerimeter();
    }
}
