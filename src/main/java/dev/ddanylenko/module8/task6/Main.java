package dev.ddanylenko.module8.task6;

import dev.ddanylenko.module8.task1.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = Lists.getPersons();
        Predicate<Person> isRich = p -> p.getSalary() > 75000;
        Predicate<Person> isYoung = p -> p.getAge() < 40;
        Predicate<Person> richAndYoung = isRich.and(isYoung);
        System.out.println("List of workers:\n" + people);
        System.out.println("List of young and rich: \n" + sortPersons(people, richAndYoung));
        System.out.println("List of poor: \n" + sortPersons(people, isRich.negate()));

        Function<Person, Double> getSum = Person::getSalary;
        Function<Person, String> getName = Person::getName;
        Function<String, String> sayHello = s -> "Hello " + s;
        System.out.println("Sum of salary: \n" + sumOfSomeThings(people, getSum));
        System.out.println("Hello to:");
        concat(people, getName.andThen(sayHello));
        Consumer<Person> consumer = p -> p.setSalary(p.getSalary() * 11/10);
        process(people, consumer.andThen(System.out::println));
    }



    public static<T> void process(List<T> list, Consumer<T> consumer) {
        for (T person : list) {
            consumer.accept(person);
        }
    }

    public static <T> List<T> sortPersons(List<T> list, Predicate<T> predicate) {
        List<T> sortedPeople = new ArrayList<>();
        for(T e : list){
            if(predicate.test(e)){
                sortedPeople.add(e);
            }
        }
        return sortedPeople;
    }

    public static void concat(List<Person> people, Function<Person, String> f) {
        for(Person p : people){
            System.out.println(f.apply(p));
        }
    }

    public static <R extends Number> double sumOfSomeThings(List<Person> list, Function<Person, R>  function) {
        double sum = 0;
        for(Person p : list){
            sum = sum + function.apply(p).doubleValue();
        }
        return sum;
    }
}
