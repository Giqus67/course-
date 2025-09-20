package dev.ddanylenko.module9.task1;

import dev.ddanylenko.module8.task1.Lists;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Lists.getList(10);
        System.out.println("Sum of odd numbers in pow 2" + numbers.stream().
                filter(n ->n % 2 ==0).
                map(n->n*n).
                reduce(Integer::sum).
                orElse(0));
    }
}
