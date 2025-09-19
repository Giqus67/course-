package dev.ddanylenko.module8.task1;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static List<Integer> getList(int n) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add((int) (Math.random() * 100));
        }
        return list;
    }

    public static String[] getStrings() {
        return new String[]{"Homer Simpson", "is a character", "in the animated television", "series The Simpsons.", "He is the boorish", "father of the Simpson family; with"};
    }
}
