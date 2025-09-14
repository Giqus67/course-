package dev.ddanylenko.module5.task9;

public class Student implements Comparable<Student> {
    private final String name;
    private final Double averageMark;

    public Student(String name, Double averageMark) {
        this.name = name;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.averageMark;
    }

    @Override
    public int compareTo(Student student) {
        if(this.averageMark < student.getAverageMark()){
            return -1;
        }
        else if(this.averageMark > student.getAverageMark()){
            return 1;
        }
        return student.getName().compareTo(this.name);
    }
}
