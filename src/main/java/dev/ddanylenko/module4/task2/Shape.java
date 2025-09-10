package dev.ddanylenko.module4.task2;

import java.util.List;

public class Shape {
    public double getArea(){
        return 0;
    }

    public void printArea(){

    }

    public static void main(String[] args){
        List<Shape> shapes = List.of(new Circle(5), new Rectangle(10, 15), new Triangle(3, 4, 5));
        shapes.forEach(Shape::printArea);
    }
}
