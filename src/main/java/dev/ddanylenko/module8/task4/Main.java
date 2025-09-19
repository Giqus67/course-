package dev.ddanylenko.module8.task4;

import dev.ddanylenko.module8.task1.Lists;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Lists.getList(1000000);
        TimeUtil.measure(() -> Arrays.sort(list.toArray()));
        TimeUtil.measure(() -> list.stream().mapToInt(Integer::intValue).sum());
    }
}
