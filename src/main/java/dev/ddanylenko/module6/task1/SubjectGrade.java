package dev.ddanylenko.module6.task1;

import java.io.Serializable;

public class SubjectGrade implements Serializable {
    private double grade;
    private String subjectName;

    public SubjectGrade(double grade, String subjectName) {
        this.grade = grade;
        this.subjectName = subjectName;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return this.subjectName + " : " + this.grade;
    }
}
