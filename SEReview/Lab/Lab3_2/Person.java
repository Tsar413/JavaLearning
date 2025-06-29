package com.company.javaRelearn.SEReview.Lab.Lab3_2;

import java.io.PrintStream;

public class Person implements Cloneable {
    private String name;
    private Date dob;

    public Person(String n, Date d) {
        name = n;
        dob = d;
    }

    public String getName() {
        return name;
    }

    public int getAge(Date now) {
        return dob.diffInYears(now);
    }

    public void print(PrintStream ps) {
        ps.print(name + ": ");
        dob.print(ps);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
