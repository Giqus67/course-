package dev.ddanylenko.module10.task1;

import java.util.Random;
import java.util.stream.Stream;

import static dev.ddanylenko.module10.task1.Colors.RED;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        Stream.generate(random::nextInt).limit(10).map(i -> {
            try{
                Thread.sleep(random.nextInt(1000));
            }catch (InterruptedException e){
                System.out.println(RED+"Thread interrupted");
            }
            return i * 2;
        }).forEach(i-> System.out.println(Colors.GREEN+Thread.currentThread().getName()+" - " + i));
    }
}
