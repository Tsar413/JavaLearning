package com.company.javaRelearn.SEReview.Lab.Lab2_1;

public class Person {
    protected String name;
    protected DoB birth_date;    // date of birth

    public Person(String n, DoB person_birth_date) {
        name = n;
        birth_date = person_birth_date;
    }

    public String getName() {
        return this.name;
    }

    public DoB getBirthDate() {
        return this.birth_date;
    }


}
