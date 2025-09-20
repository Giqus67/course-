package dev.ddanylenko.module9.task7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            Files.lines(Paths.get("words.txt")).
                    filter(s -> s.length() > 4).
                    map(String::toUpperCase).
                    distinct().
                    sorted().
                    toList().
                    forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
