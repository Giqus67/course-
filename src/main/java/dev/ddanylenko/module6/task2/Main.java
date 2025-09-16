package dev.ddanylenko.module6.task2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            saveToFile("Hello world", "hello_world.txt");
            saveDir("testDir");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void saveToFile(String text, String fileName) throws IOException {
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write(text);
        }
    }

    public static void saveDir(String dirName) throws IOException {
        File dir = new File(dirName);
        if(!dir.exists()){
            throw new IOException("Dir doesn't exist!: " + dirName);
        }
        if(!dir.isDirectory()){
            throw new IOException( dirName + " is not a dir!");
        }
    }
}
