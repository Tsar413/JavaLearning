package com.company.javaRelearn.AdvancedProgrammingLab.Lab2;

public class Pet extends AbstractPet {
    private String name;
    private int age;

    public Pet(String n, int a) {
        super(n, a);
        this.name = n;
        this.age = a;
    }

    public Pet(String name) {
        super(name,0);
        this.name = name;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.equals("")) {
            throw new UnsupportedOperationException();
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new UnsupportedOperationException();
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return name + " is my pet and is aged " + age;
    }
}
