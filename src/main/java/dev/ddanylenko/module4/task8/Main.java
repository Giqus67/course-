package dev.ddanylenko.module4.task8;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape3D> shapes = List.of(
                new Cube(5),
                new Cylinder(5, 15),
                new Sphere(7)
        );
        shapes.forEach(System.out::println);
    }
}
