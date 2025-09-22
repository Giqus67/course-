package dev.ddanylenko.review.task2;

public class Factorial {
    public static int factorial(int n){
        if(n < 0){
            System.out.println("Invalid input");
            return 0;
        }
        if(n == 1 || n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
