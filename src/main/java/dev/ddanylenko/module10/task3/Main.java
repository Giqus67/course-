package dev.ddanylenko.module10.task3;

import java.util.stream.Stream;

import static dev.ddanylenko.module10.task1.Colors.*;

public class Main {
    private static int prev = 0;
    private static int cur = 1;

    public static void main(String[] args) {
        new Thread(new Fibonacci()).start();
        new Thread(new Fibonacci()).start();
    }

    public  static synchronized void culcNext(){
        int next = prev + cur;
        prev = cur;
        cur = next;
        System.out.println(cur);
    }

    private static class Fibonacci implements Runnable{

        @Override
        public void run() {
            Stream.iterate(1, i -> i+1).limit(10).forEach(i -> culcNext());
        }
    }
}
