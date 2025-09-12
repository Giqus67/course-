package dev.ddanylenko.module5.task3;

import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
        System.out.println("Sum of 2 elements: "  + sumOfNumbers(Math.random()*100, Math.random()*100));
        System.out.println("Sum of 3 elements: " + sumOfNumbers(Math.random()*100, Math.random()*100, Math.random()*100));
        System.out.println("Sum of 4 elements: "+ sumOfNumbers(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100));
        System.out.println("Sum of 5 elements: "+ sumOfNumbers(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100));
        System.out.println("Sum of 6 elements: "+ sumOfNumbers(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100));
        System.out.println("Sum of 7 elements: "+ sumOfNumbers(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100));
        System.out.println("Sum of 8 elements: "+ sumOfNumbers(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100));

    }

    public static double sumOfNumbers(double ... args){
        return Arrays.stream(args).sum();
    }
}
