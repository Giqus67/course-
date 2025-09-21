package dev.ddanylenko.module10.task1;

import java.util.Random;
import java.util.stream.Stream;

import static dev.ddanylenko.module10.task1.Colors.*;

public class MyThread   extends Thread  {
    @Override
    public void run() {
        Random random = new Random();
        Stream.iterate(1, i -> i + 1).limit(10).map(i -> {
            try {
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println(RED + "Thread was interrupted!");
            }
            return i++;
        }).forEach(i-> System.out.println(PURPLE + currentThread().getName() + " - " + i));
    }
}
