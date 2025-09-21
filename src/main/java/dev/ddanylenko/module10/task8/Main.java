package dev.ddanylenko.module10.task8;

import dev.ddanylenko.module10.task1.Colors;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("hello");
        new Thread(new Producer(message)).start();
        new Thread(new Consumer(message)).start();

    }

    public static class Producer implements Runnable {
        static String[] strings = {"The Ministry of Health", "Labour and Welfare (厚生労働省, Kōsei-rōdō-shō; lit", "Ministry of Health and Labour; MHLW)",
                "is a cabinet level ministry", "of the Japanese government", "It is commonly known as Kōrō-shō (厚労省) in Japan.",
                "The ministry provides", " services on health, labour and welfare.",
                "It was formed with the merger", "of the former Ministry of Health and Welfare", " or Kōsei-shō (厚生省)", " and the Ministry of Labour or Rōdō-shō (労働省).", "DONE"};

        private final Message message;

        public Producer(Message message) {
            this.message = message;
        }

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            Random random = new Random();
            for (String s : strings) {
                try {
                    synchronized (message){
                        message.setMessage(s);
                        System.out.println(Colors.YELLOW + "Producer put string: " + s);
                        message.notify();
                        if(!"DONE".equals(s)){
                            message.wait();
                        }
                        Thread.sleep(random.nextInt(1000));
                    }
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }
        }
    }

    private static class Consumer implements Runnable {

        private final Message message;

        public Consumer(Message message) {
            this.message = message;
        }

        @Override
        public void run() {
            consume();
        }

        private void consume()   {
            Random random = new Random();
            while (true){
                try {
                    synchronized (message){
                        String current = message.getMessage();
                        if("DONE".equals(current)){
                            System.out.println(Colors.BLUE + "Consumer finished.");
                            message.notify();
                            break;
                        }
                        System.out.println(Colors.BLUE + "Consumer consume: " + message.getMessage());
                        message.notify();
                        message.wait();
                        Thread.sleep(random.nextInt(2000));
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }
}
