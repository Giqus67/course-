package dev.ddanylenko.module5.task2;

import java.util.Arrays;

public class MultiDim {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        fill(a);
        printMultiDim(a);
        sumOfColumns(a);
        sumOfRows(a);
    }

    public static void sumOfColumns(int[][] array){
        int[] sum = new int[array.length];
        Arrays.fill(sum, 0);
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                sum[i] += array[j][i];
            }
        }
        for(int i = 0; i < sum.length; i++){
            System.out.println("Sum of column " + i + " : " + sum[i]);
        }
    }

    public static void fill(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public static void sumOfRows(int[][] array){
        int[] sum = new int[array.length];
        Arrays.fill(sum, 0);
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                sum[i] += array[i][j];
            }
        }
        for(int i = 0; i < sum.length; i++){
            System.out.println("Sum of row " + i + " : " + sum[i]);
        }
    }

    public static void printMultiDim(int[][] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
