package dev.ddanylenko.module4.task5;

import java.util.List;

public abstract class Payment {

    public abstract void process();

    public static void main(String[] args){
        List<Payment> payments = List.of(new BitcoinPayment(), new PayPalPayment(), new CreditCardPayment());
        payments.stream().forEach(Payment::process);
    }
}
