package dev.ddanylenko.module8.task5;

import dev.ddanylenko.module8.task1.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> list = Lists.getDoubleList(10);
        List<String> strings = Arrays.stream(Lists.getStrings()).toList();
        TransformUtil transformUtil = new TransformUtil();
        System.out.println("Lists before: "+list + "\n" + strings);
        System.out.println("Static ceil method reference: "+transformUtil.processElements(list, Math::ceil));
        System.out.println("Non static method reference: "+ transformUtil.processElements(strings, String::toUpperCase));
        System.out.println("Non static from class method reference: "+ transformUtil.processElements(strings, TransformUtil::exclaims));
        System.out.println("New method reference: "+ transformUtil.processElements( strings,String::new));
    }

}
