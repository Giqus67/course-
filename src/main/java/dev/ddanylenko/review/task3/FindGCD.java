package dev.ddanylenko.review.task3;

public class FindGCD {
    public static int findGCD(int a, int b) {
        if(a==b){
            return a;
        }
        if(b == 0 ){
            return a;
        }
        return findGCD(b, a % b);
    }
}
