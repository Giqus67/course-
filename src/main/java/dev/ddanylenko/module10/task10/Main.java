package dev.ddanylenko.module10.task10;

import dev.ddanylenko.module10.task1.Colors;

import java.lang.reflect.AnnotatedType;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class Main {
    private static final int sellers = 3;
    private static final int customers = 30;

    public static void main(String[] args) {
        SemaphoreService semaphore = new SemaphoreService(sellers, customers);
        ExecutorService executorService = Executors.newCachedThreadPool();

        IntStream.range(0, customers).forEach(i -> executorService.submit(semaphore::connect));
        executorService.shutdown();
    }
    private static class SemaphoreService{
        private AtomicInteger connectedCustomers  = new AtomicInteger();
        private AtomicInteger queuedCustomers  = new AtomicInteger();

        private Semaphore semaphore;

        public SemaphoreService(int sellers, int customers) {
            this.semaphore = new Semaphore(sellers);
            queuedCustomers.set(customers);
        }

        public void connect(){
            try {
                Random random = new Random();
                semaphore.acquire();
                connectedCustomers.incrementAndGet();
                queuedCustomers.decrementAndGet();
                Thread.sleep(random.nextInt(2000));
                System.out.println(Colors.BLUE + "Connected: " + connectedCustomers.get() + Colors.RESET + Colors.YELLOW + ". Queued: " + queuedCustomers.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                semaphore.release();
                connectedCustomers.decrementAndGet();
            }
        }
    }
}
