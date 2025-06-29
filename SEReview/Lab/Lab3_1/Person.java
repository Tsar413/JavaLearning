package com.company.javaRelearn.SEReview.Lab.Lab3_1;

import java.io.PrintStream;

public class Person {
    private String name;
    private Date dob;

    public Person(String personName, Date personDOB) {
        this.name = personName;
        this.dob = personDOB;
    }

    public void print(PrintStream ps, Person person) {
        ps.print(String.format("name: %s", person.name));
        ps.print(String.format("   date of birth: %02d/%02d/%4d", person.dob.getDay(), person.dob.getMonth(), person.dob.getYear()));
    }

    public String getName() {
        return this.name;
    }

    public int getAge(Date currentDate) {
        return this.dob.diffInYears(currentDate);
    }

    public Date getDob() {
        return dob;
    }
}
