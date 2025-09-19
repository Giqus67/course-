package dev.ddanylenko.module8.task3;

import dev.ddanylenko.module8.task1.Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Lists.getList(16);
        System.out.println("List before:" + list);
        System.out.println("Sum of pairs: " + processElements(list, Integer::sum));
        System.out.println("Multiply of pairs: " + processElements(list, (x, y) -> x * y) );
        System.out.println("Pow of pairs: " + processElements(list, Math::pow));

    }

    public static List<Double> processElements(List<Integer> list, ElementProcessor elementProcessor) {
        List<Double> result = new ArrayList<>();
        for(int i =0 ; i < list.size() - 1 ; i++){
            result.add(elementProcessor.process(list.get(i), list.get(i+1)));
        }
        return result;
    }
}
