package com.company.javaRelearn.UofGWeek8;

public class Student extends Person {
    private Double gpa;

    Student() {}
    Student(int id, String name, int age, String department, double gpa) {
        super(id, name, age, department);
        this.gpa = gpa;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "gpa=" + gpa +
                '}';
    }
}
