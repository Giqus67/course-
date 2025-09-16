package dev.ddanylenko.module6.task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) {
        try {
            workWithPath("notes.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void workWithPath(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        System.out.println("Absolute path: " + path.toAbsolutePath());
        Path thisPath = Paths.get("backup");
        Files.createDirectory(thisPath);
        Files.copy(path, thisPath.resolve(fileName), StandardCopyOption.REPLACE_EXISTING);
        Files.deleteIfExists(thisPath.resolve(fileName));
    }
}
