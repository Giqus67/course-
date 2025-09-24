package dev.ddanylenko.review.task8;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.List;
import java.util.logging.*;

public class FileWorker {

    private static Logger logger;

    public static void writeToFile(String fileName, List<Integer> content) {
        try(FileWriter writer = new FileWriter(fileName)){
            for(Integer i : content){
                writer.write(Integer.toString(i) + " \n");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readFromFile(String fileName){
        try(FileReader reader = new FileReader(fileName)){
            int i = 1;
            while ((i = reader.read()) != -1){
                System.out.print((char)i);
            }
            addLogger(fileName);
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void copyFile(String src, String dest){
        Path source = Paths.get(src);
        Path destination = Paths.get(dest);
        try {
            Files.copy(source.toAbsolutePath(), destination, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void countStrings(String filename) {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))){
            int count = 0;
            String s;
            while((s = bufferedReader.readLine()) != null){
                count++;
            }
            System.out.println("Count of strings: " + count);

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void addLogger(String filename){
        try(FileInputStream inputStream = new FileInputStream(filename)){
            LogManager.getLogManager().readConfiguration(inputStream);
            logger = Logger.getLogger(filename);

            FileHandler fileHandler = new FileHandler("app.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);

            logger.log(Level.INFO, "Wrote numbers on " + LocalDateTime.now());
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
