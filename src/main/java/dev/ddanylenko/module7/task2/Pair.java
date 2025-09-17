package dev.ddanylenko.module7.task2;

public class Pair <K, V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair: " + key + " = " + value;
    }
}
