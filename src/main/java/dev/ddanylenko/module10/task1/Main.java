package dev.ddanylenko.module10.task1;

public class Main {
    public static void main(String[] args) {

        new Thread(new MyRunnable()).run();

        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();

        new Thread(new MyRunnable()).start();

        new Thread(() -> {
            System.out.println(Colors.YELLOW + "Hello from lambda");
        }).start();

        new Thread(new MyRunnable()).run();

    }
}
