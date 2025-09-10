package dev.ddanylenko.module4.task5;

public class PayPalPayment extends Payment{
    @Override
    public void process() {
        System.out.println("Payment by PayPal");
    }
}
