package dev.ddanylenko.review.task4;

public class BankAccount {
    private final Person person;
    private double balance;

    public BankAccount(Person person) {
        this.person = person;
        this.balance = 500;
    }

    public void withdraw(double sum){
        balance -=sum;
        System.out.println("Withdraw " + sum + "$. Balance on account: " + balance);
    }

    public void deposit(double sum){
        balance +=sum;
        System.out.println("Deposit " + sum + "$. Balance on account: " + balance);
    }

    @Override
    public String toString() {
        return person.getName() + " has " + balance + "$";
    }
}
