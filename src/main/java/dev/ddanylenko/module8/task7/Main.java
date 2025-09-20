package dev.ddanylenko.module8.task7;


import dev.ddanylenko.module8.task1.Lists;
import dev.ddanylenko.module8.task1.Person;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Double> sum = Double::sum;
        BinaryOperator<Double> max = Double::max;
        BinaryOperator<Double> min = Double::min;

        List<Person> people = Lists.getPersons();

        Function<Person, Double> f = Person::getSalary;
        System.out.println("Total salary: " + combine(people, people.getFirst().getSalary(), f, sum));
        System.out.println("Max salary: " + combine(people, people.getFirst().getSalary(), f, max));
        System.out.println("Min salary: " + combine(people, people.getFirst().getSalary(), f, min));

        Function<Person, String> getName = p-> p.getName() + ", ";
        Function<String, String> sayHello = y -> "Hello " + y;
        Function<Person, String> composed = sayHello.compose(getName);
    }


    public static <T, R> R combine(List<T> list, R zero, Function<T, R> function, BinaryOperator<R> combiner) {
        R result = zero;
        for (T t : list) {
            result = combiner.apply(result, function.apply(t));
        }
        return result;
    }

    private static <T> Function<T, T> compose(Function<T, T>... functions) {
        Function<T, T> result = Function.identity();
        for (Function<T, T> f : functions) {
            result = result.andThen(f);
        }
        return result;
    }
}
