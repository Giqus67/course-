package dev.ddanylenko.module10.task9;

import dev.ddanylenko.module10.task1.Colors;

import java.util.Random;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    private static final Lock monitor = new ReentrantLock();

    private static Condition read = monitor.newCondition();
    private static Condition write = monitor.newCondition();

    private static int buffer = 0;

    private static boolean isEmpty = true;

    public static void main(String[] args) {
        new Thread(Main::write).start();
        new Thread(Main::read).start();
    }

    private static void write() {
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            try {
                monitor.lock();
                while (!isEmpty) {
                    write.await();
                }
                buffer = rand.nextInt(100);
                isEmpty = false;
                System.out.println(Colors.BLUE + "Wrote= " + buffer);
                read.signal();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            } finally {
                monitor.unlock();
            }

        }
    }

    private static void read() {
        for (int i = 0; i < 10; i++) {
            try {
                monitor.lock();
                while (isEmpty) {
                    read.await();
                }
                int local = buffer;
                System.out.println(Colors.YELLOW + "Read= " + local);
                isEmpty = true;
                write.signal();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            } finally {
                monitor.unlock();
            }
        }
    }


}
