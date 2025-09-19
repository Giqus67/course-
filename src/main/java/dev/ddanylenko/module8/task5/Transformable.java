package dev.ddanylenko.module8.task5;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Transformable<T>{
    T transform(T t);


     default public String exclaims(String s){
        return s.toLowerCase();
    }

}
