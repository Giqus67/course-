package dev.ddanylenko.review.task9;

import java.util.Comparator;

public class Container <T> {

    public void swap(T[] array, int i, int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void findMax(T[] array, Comparator<T> comparator){
        T max = array[0];
        for(T temp : array){
            if(comparator.compare(max,temp) > 0){
                max = temp;
            }
        }
        System.out.println("Max element is: " + max);
    }
}
