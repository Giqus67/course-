package dev.ddanylenko.module6.task1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
    private String name;
    private double avgGrade;
    private List<SubjectGrade> subjectGrades;

    public Student(String name, List<SubjectGrade> subjectGrades) {
        this.name = name;
        this.subjectGrades = subjectGrades;
        double sum = subjectGrades.stream().mapToDouble(SubjectGrade::getGrade).sum();
        this.avgGrade = sum / subjectGrades.size();
    }

    public String getName() {
        return name;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public List<SubjectGrade> getSubjectGrades() {
        return subjectGrades;
    }

    public static List<Student> getStudents(){
        List<Student> students = new ArrayList<Student>();
        List<SubjectGrade> grades = new ArrayList<>(List.of(new SubjectGrade(81, "Math"),
                new SubjectGrade(90, "English"),
                new SubjectGrade(85, "History"),
                new SubjectGrade(85, "Computer Science"),
                new SubjectGrade(90, "Science ")
        ));
        students.add(new Student("Cruz Hilton", grades));
        List<SubjectGrade> grades1 = new ArrayList<>(List.of(new SubjectGrade(61, "Math"),
                new SubjectGrade(70, "English"),
                new SubjectGrade(65, "History"),
                new SubjectGrade(63, "Computer Science"),
                new SubjectGrade(61, "Science ")
        ));

        students.add(new Student("Isabella Massey", grades1));
        List<SubjectGrade> grades2 = new ArrayList<>(List.of(new SubjectGrade(95, "Math"),
                new SubjectGrade(100, "English"),
                new SubjectGrade(95, "History"),
                new SubjectGrade(93, "Computer Science"),
                new SubjectGrade(91, "Science ")
        ));

        students.add(new Student("Melvin Knight", grades2));
        List<SubjectGrade> grades3 = new ArrayList<>(List.of(new SubjectGrade(85, "Math"),
                new SubjectGrade(91, "English"),
                new SubjectGrade(85, "History"),
                new SubjectGrade(90, "Computer Science"),
                new SubjectGrade(84, "Science ")
        ));

        students.add(new Student("Rosemary Weaver", grades3));

        List<SubjectGrade> grades4 = new ArrayList<>(List.of(new SubjectGrade(82, "Math"),
                new SubjectGrade(83, "English"),
                new SubjectGrade(75, "History"),
                new SubjectGrade(89, "Computer Science"),
                new SubjectGrade(82, "Science ")
        ));
        students.add(new Student("Emilie Bloggs", grades4));

        return students;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avgGrade=" + avgGrade +
                ", subjectGrades=" + subjectGrades +
                '}';
    }
}
