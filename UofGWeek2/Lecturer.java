package com.company.javaRelearn.UofGWeek2;

public class Lecturer extends Person {
    private double salary;

    Lecturer(int id, String name, int age, String department, double salary) {
        super(id, name, age, department);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "salary=" + salary +
                '}';
    }
}
