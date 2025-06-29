package com.company.javaRelearn.UofGWeek4;

import com.company.javaRelearn.UofGWeek2.Person;

public class Lab31_32_33 {
    public static Person initialization() {
        return new Person();
    }

    public static int calculateAge(Person[] people) {
        int age = 0;
        for (Person p : people) {
            age += p.getAge();
        }
        return age;
    }

    public static void main(String[] args) {
        Person[] people = new Person[4];
        for (Person p : people) {
            p = initialization();
            System.out.println(p);
        }
        people[0] = new Person(1,"Jim",35,"Development");
        people[1] = new Person(2,"Charles",30,"Development");
        people[2] = new Person(3,"Sam",55,"Development");
        people[3] = new Person(4,"Ayako",40,"Development");
        for (Person p : people) {
            System.out.println(p);
        }
        System.out.println(calculateAge(people));

    }
}
