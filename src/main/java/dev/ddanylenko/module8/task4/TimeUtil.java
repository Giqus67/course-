package dev.ddanylenko.module8.task4;

import java.util.List;
import java.util.function.Consumer;

public class TimeUtil {

    public static <T extends Number>  void measure(Function function){
        long start = System.currentTimeMillis();
        function.process();
        long end = System.currentTimeMillis();
        System.out.println("Time in mls to complete function: " + (end - start) );
    }
}
