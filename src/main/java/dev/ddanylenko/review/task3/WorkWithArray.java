package dev.ddanylenko.review.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WorkWithArray {

    public static int findMax(int[] array){
        return  Arrays.stream(array).max().getAsInt();
    }

    public static int findMaxV2(int[] array) {
        int max = 0;
        for(int i : array){
            if(max < i){
                max = i;
            }
        }
        return max;
    }




    public static String reverse(String s) {
        String returnString = "";
        for(int i = s.length() -1; i >= 0; i--){
            returnString += s.charAt(i);
        }
        return returnString;
    }

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        int uniqueCount = 0;
        for(int i = 0; i < n; i++){
            boolean found = false;
            for(int j = 0; j < uniqueCount; j++){
                if(array[i] == array[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                temp[uniqueCount++] = array[i];
            }
        }

        return Arrays.copyOf(temp, uniqueCount);

    }

    public static int[] removeDuplicatesV2(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }
}
