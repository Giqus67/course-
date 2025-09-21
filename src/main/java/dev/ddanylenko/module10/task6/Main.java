package dev.ddanylenko.module10.task6;

import dev.ddanylenko.module10.task1.Colors;

public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new Worker(5));
        Thread th2 = new Thread(new Worker(3));
        th1.setDaemon(true);
        th1.start();
        th2.start();
    }

    private static class Worker implements Runnable{

        private int count;

        public Worker(int count){
            this.count = count;
        }

        @Override
        public void run() {
           for(int i = 0; i < count; i++){
               try{
                   Thread.sleep(2000);
                   System.out.println(Colors.RED + Thread.currentThread().getName() + " is working");
               }catch (InterruptedException e){
                   System.out.println(Colors.RED + "Thread interrupted");
               }
           }
        }
    }
}
