package dev.ddanylenko.review.task6;

import dev.ddanylenko.module8.task1.Person;

public class Main {
    public static void main(String[] args) {
        divide(1, 0);
        System.out.println(createPerson("Denys", 60000, 21, "IT"));
        System.out.println(createPerson("Ivan", 55555, 16, "IT"));
        System.out.println(parseToInt("188"));
        System.out.println(parseToInt("188s"));
    }

    public static int divide( int d1, int d2 ) {
        int result = 0;
        try {
            result =  d1 / d2;
        }catch (ArithmeticException e) {
            System.out.println("You can't divide by zero!");
        }
        return result;
    }

    public static Person createPerson(String name, double salary, int age, String department) {
        try {
            if(age < 18){
                throw new InvalidAgeException("Age must be at least 18!");
            }
            return new Person(name, salary, age, department);
        }catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static int parseToInt(String string){
        int i = 0;
        try{
            i = Integer.parseInt(string);
        }catch (NumberFormatException e) {
            System.out.println("Can't parse String to int!");
        }
        return i;
    }
}
