package dev.ddanylenko.module6.task3;

import dev.ddanylenko.module6.task1.Student;
import dev.ddanylenko.module6.task1.SubjectGrade;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            saveStudentsToFile(Student.getStudents(), "students.txt");
            readStudentsFromFile("students.txt");
        } catch (IOException e) {
            System.out.println("Error saving students to file");
            e.printStackTrace();
        }
        catch (ClassNotFoundException e) {
            System.out.println("Error reading from file");
            e.printStackTrace();
        }
    }

    public static void saveStudentsToFile(List<Student> students, String fileName) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(Paths.get(fileName)))){
            for(Student student : students){
                out.writeObject(student);
            }
            List<SubjectGrade> grades = new ArrayList<>();
            out.writeObject(new Student("", grades));
        }
    }

    public static void readStudentsFromFile(String fileName) throws IOException, ClassNotFoundException {
        List<Student> students = new ArrayList<>();
        try(ObjectInputStream input = new ObjectInputStream(Files.newInputStream(Paths.get(fileName)))){
            boolean keepReading = true;
            while(keepReading){
                Student student = (Student) input.readObject();
                if(!"".equals(student.getName())){
                    students.add(student);
                }else {
                    keepReading = false;
                }
            }
        }
        for(Student student : students){
            System.out.println(student);
        }
    }
}

