package com.company.javaRelearn.Practise_3_7_ManagerEmployeeSalaries_20241014;

public abstract class Employee extends Person {
    private int id;
    private int wage;
    private int age;

    public Employee() {}

    public Employee(int id, int wage, int age) {
        this.id = id;
        this.wage = wage;
        this.age = age;
    }

    public Employee(String name, String address, int id, int wage, int age) {
        super(name, address);
        this.id = id;
        this.wage = wage;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void add();
}
