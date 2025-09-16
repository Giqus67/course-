package dev.ddanylenko.module6.task4;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        try {
            checkFile("notes.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void checkFile(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            throw new IOException("File not found!");
        }
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Relative path: " + file.getPath());
        System.out.println("Free space: " + file.getFreeSpace() / 1024 / 1024 + "MB");
        System.out.println("Free space: " + file.getFreeSpace() / 1024 / 1024 / 1024 + "GB");
        System.out.println("Parent path: " + file.getParent());
        Instant instant = Instant.ofEpochMilli(file.lastModified());
        System.out.println("Last modified: " + LocalDateTime.ofInstant(instant, ZoneId.systemDefault()));
        System.out.println("Hidden: " + file.isHidden());

        String[] list = new File(".").list();
        Arrays.stream(list).iterator().forEachRemaining(System.out::println);
    }
}
