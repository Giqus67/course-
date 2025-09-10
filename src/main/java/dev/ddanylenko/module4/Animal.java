package dev.ddanylenko.module4;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    public void makeSound(){
        System.out.println("Animal made a sound");
    }

    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Cow());
        animals.forEach(Animal::makeSound);
    }
}
