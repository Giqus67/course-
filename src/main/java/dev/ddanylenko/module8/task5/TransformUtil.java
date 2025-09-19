package dev.ddanylenko.module8.task5;

import java.util.ArrayList;
import java.util.List;

public class TransformUtil {
    public  <T> List<T> processElements(List<T> list, Transformable<T> util) {
        List<T> result = new ArrayList<>();
        for (T element : list) {
            result.add(util.transform(element));
        }
        return result;
    }

    public static String exclaims(String s){
        return s.toLowerCase();
    }
}
