package dev.ddanylenko.review.task9;

public class Pair <K, V>{
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void printValues(){
        System.out.println(this.key + ": " + this.value);
    }
}
