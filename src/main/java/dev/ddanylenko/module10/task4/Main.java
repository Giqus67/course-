package dev.ddanylenko.module10.task4;

import dev.ddanylenko.module10.task1.Colors;
import dev.ddanylenko.module8.task1.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static final int[] arrayA = Lists.getArray(10);
    private static final int[] arrayB = Lists.getArray(10);
    private static List<Integer> listA = new ArrayList<>();
    private static List<Integer> listB = new ArrayList<>();

    private static final Object lock1 = new Object();
    private static final Object lock2 = new Object();


    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.copy();
    }
    private void copy() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread th1 = new Thread(new CopyArrayA());
        Thread th2 = new Thread(new CopyArrayB());
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        long end = System.currentTimeMillis();
        System.out.println(Colors.GREEN + "Time taken: " + (end - start));
    }

    private static class CopyArrayA implements Runnable {
        @Override
        public synchronized void run() {
            copyA();
        }
    }

    private static void copyA(){
        synchronized (lock1) {
            Arrays.stream(arrayA).forEach(i -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                listA.add(i);
            });
        }
    }

    private static void copyB(){
        synchronized (lock2){
            Arrays.stream(arrayB).forEach(i -> {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                listB.add(i);
            });
        }
    }

    private static class CopyArrayB implements Runnable {
        @Override
        public synchronized void run() {
            copyB();
        }
    }
}
