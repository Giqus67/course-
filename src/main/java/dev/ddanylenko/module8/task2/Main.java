package dev.ddanylenko.module8.task2;

import dev.ddanylenko.module8.task1.Lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list = Lists.getDoubleList(10);
        List<Integer> integerList = Lists.getList(10);
        System.out.println("Anonymous method: ");
        System.out.println(processElement(integerList, new ElementProcessor() {
                    @Override
                    public Double process(Number element) {
                        return element.doubleValue() * element.doubleValue();
                    }
                }
                ));
        System.out.println("Lambda: ");
        System.out.println(processElement(integerList, e -> Math.pow(e, 2)));
        System.out.println("Method reference: ");
        System.out.println(processElement(integerList, Main::square));

    }

    public static Double square(Number n) {
        return Math.pow(n.doubleValue(), 2);
    }



    public static <T extends Number> List<T> processElement(List<T> list, ElementProcessor<T> elementProcessor) {
        List<T> processedList = new ArrayList<>();
        for (T element : list) {
            processedList.add((T) elementProcessor.process(element));
        }
        return processedList;
    }
}
