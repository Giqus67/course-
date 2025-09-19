package dev.ddanylenko.module8.task2;

@FunctionalInterface
public  interface ElementProcessor  <T extends Number> {
    Double process(T element);
}
