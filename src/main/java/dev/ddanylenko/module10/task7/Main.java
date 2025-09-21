package dev.ddanylenko.module10.task7;

import dev.ddanylenko.module10.task1.Colors;

import java.util.Random;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    private static BlockingDeque<String> queue = new LinkedBlockingDeque<String>(2);

    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }

    private static class Producer implements Runnable {

        static String[] strings =  {"The Ministry of Health", "Labour and Welfare (厚生労働省, Kōsei-rōdō-shō; lit", "Ministry of Health and Labour; MHLW)",
        "is a cabinet level ministry", "of the Japanese government", "It is commonly known as Kōrō-shō (厚労省) in Japan.",
        "The ministry provides"," services on health, labour and welfare.",
            "It was formed with the merger", "of the former Ministry of Health and Welfare"," or Kōsei-shō (厚生省)", " and the Ministry of Labour or Rōdō-shō (労働省).", "DONE"};
        @Override
        public void run() {
           produce();
        }

        private static void produce(){
            Random random = new Random();
            for(String s : strings){
                try{
                    queue.put(s);
                    System.out.println(Colors.YELLOW + "Producer put string: " + s+ ". Queue size " + queue.size());
                    Thread.sleep(random.nextInt(2000));
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        }
    }

    private static class Consumer implements Runnable {
        @Override
        public void run() {
            consume();
        }

        private void consume()   {
            Random random = new Random();
            while (true){
                try {
                    String message = queue.take();
                    System.out.println(Colors.BLUE + "Consumer consume: " + message + ". Queue size " + queue.size());
                    if("DONE".equals(message)){
                        return;
                    }
                    Thread.sleep(random.nextInt(4000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }

}
