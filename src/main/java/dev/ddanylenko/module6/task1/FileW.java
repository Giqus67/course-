package dev.ddanylenko.module6.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileW {
    private static final String FILE_NAME = "notes.txt";

    public static void main(String[] args) {
        try {
            writeToFile(FILE_NAME, Student.getStudents());
            readFromFile(FILE_NAME);
            System.out.println("\n\nRead with buffer\n\n");
            readWithBuffer(FILE_NAME);
        }catch (IOException e){
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
    }

    public static void writeToFile(String fileName, List<Student> students) throws IOException {
        try(FileWriter writer = new FileWriter(fileName)) {
            for(Student student : students){
                writer.write("----------------------------------------------\n");
                writer.write(student.getName() + ". Average grade: " + student.getAvgGrade() + "\n");
                for(SubjectGrade subjectGrade : student.getSubjectGrades()){
                    writer.write(subjectGrade.getSubjectName() + " " + subjectGrade.getGrade() + "\n");
                }
                writer.write("\n");
            }
        }
    }

    public static void readFromFile(String fileName) throws IOException {
        try(FileReader reader = new FileReader(fileName)){
            int c;
            while((c = reader.read()) != -1){
                System.out.print((char)c);
            }
        }
    }

    public static void readWithBuffer(String fileName) throws IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }

    }

}
