package dev.ddanylenko.review.task2;

public class Main {

    public static void main(String[] args) {
        int n = 32;
        int f = 10;
        String s = "madam";
        System.out.println("Is prime number " + n + " = " + PrimeNumber.isPrime(n));
        MultiplicationTable.printTable();
        System.out.println("Factorial of " + f + " is " + Factorial.factorial(f));
        System.out.println("Is palindrome of " + s + " = " + Palindrome.isPalindrome(s));
        System.out.println("Fibonacci of " + f + " is " + Fibonacci.fibonacci(f));
    }
}
