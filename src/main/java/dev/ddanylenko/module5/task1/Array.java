package dev.ddanylenko.module5.task1;

import java.util.Arrays;
import java.util.Random;

public class Array {
    public static void main(String[] args){
        int[] array = randomArray(30);
        System.out.println("Array before sort: ");
        printArray(array);
        bubbleSort(array);
        System.out.println("Array before sorting: ");
        printArray(array);
        System.out.println("Min of array: " + min(array));
        System.out.println("Max of array: " + max(array));
        System.out.println("Array after reverse: ");
        reverse(array);
        printArray(array);
        copyThreeElements(array);
    }

    public static int[] randomArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array){
        for( int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static int min(int[] array){
        int min = array[0];
        for(int i : array){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public static int max(int[] array){
        int max = array[0];
        for(int i : array){
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    public static void reverse(int[] array){
        int[] temp = new int[array.length];
        System.arraycopy(array, 0, temp, 0, array.length);
        for(int i = 0; i < array.length; i++){
            array[i] = temp[array.length - 1 - i];
        }
    }

    public static void copyThreeElements(int[] array){
        int[] temp = new int[3];
        System.arraycopy(array, 0, temp, 0, 3);
        printArray(temp);
    }
}
