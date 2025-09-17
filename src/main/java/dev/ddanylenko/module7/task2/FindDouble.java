package dev.ddanylenko.module7.task2;

public class FindDouble implements Calculator<Double, Integer, Float>{

    @Override
    public Double calculate(Integer element1, Float element2) {
        return (double) element1 + element2;
    }
}
