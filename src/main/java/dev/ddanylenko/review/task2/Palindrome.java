package dev.ddanylenko.review.task2;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String reversedStr = new StringBuilder(str).reverse().toString();
        return str.equals(reversedStr);
    }
}
