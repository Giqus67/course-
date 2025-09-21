package dev.ddanylenko.module10.task5;

import dev.ddanylenko.module10.task1.Colors;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try(ExecutorService executor = Executors.newFixedThreadPool(3)){
            NameRunnable nameRunnable = new NameRunnable();
            executor.execute(nameRunnable);
            executor.execute(nameRunnable);
            executor.execute(nameRunnable);
            executor.execute(nameRunnable);
            executor.execute(nameRunnable);
            executor.execute(nameRunnable);
        }

    }

    private static class NameRunnable implements Runnable {

        @Override
        public void run() {
            Random random = new Random();
            Stream.iterate(1, n -> n + 1).limit(5).forEach(i -> {
                System.out.println(Colors.CYAN + Thread.currentThread().getName() + " - " + i);
                try{
                    Thread.sleep(random.nextInt(2000));
                }catch (InterruptedException e){
                    System.out.println(Colors.RED + "Exception caught: " + e);
                }
            });
        }
    }
}
