package dev.ddanylenko.review.task4;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(21, "Denys");

        Rectangle rectangle = new Rectangle(21, 15);

        BankAccount bankAccount = new BankAccount(person);

        Animal animal = new Animal();
        Animal dog = new Dog();
        Dog dog1 = new Dog();

        Circle circle = new Circle(8);
        Square square =  new Square(10);

        System.out.println(person);
        System.out.println(rectangle);
        System.out.println(bankAccount);
        bankAccount.withdraw(300);
        bankAccount.deposit(1000);

        animal.makeSound();
        dog.makeSound();
        dog1.makeSound();
        System.out.println(circle);
        System.out.println(square);


    }
}
