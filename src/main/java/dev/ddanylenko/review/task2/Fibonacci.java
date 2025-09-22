package dev.ddanylenko.review.task2;

public class Fibonacci {
    public static int fibonacci(int n) {
        if(n <= 1){
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
