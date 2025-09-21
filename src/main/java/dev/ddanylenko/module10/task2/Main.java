package dev.ddanylenko.module10.task2;


import static dev.ddanylenko.module10.task1.Colors.*;

public class Main {

    public static volatile    int counter = 0;

    public static void main(String[] args) {
        new Thread(new MyWriter()).start();
        new Thread(new MyReader()).start();
    }

    private static class MyWriter implements Runnable {

        @Override
        public void run() {
            int local = counter;
            for (int i = 0; i < 10; i++) {
                System.out.println(YELLOW + Thread.currentThread().getName() + " - " + (local + 1));
                counter = ++local;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(RED + "Thread interrupted");
                }
            }
        }

    }

    private static class MyReader implements Runnable {
        @Override
        public void run() {
            int lastSeen = counter;
            while (lastSeen < 10) {
                if (lastSeen != counter) {
                    System.out.println(BLUE + Thread.currentThread().getName() + " - " + counter);
                    lastSeen = counter;
                }
            }
        }
    }
}
