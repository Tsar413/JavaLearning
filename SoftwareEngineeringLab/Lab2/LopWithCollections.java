package com.company.javaRelearn.SoftwareEngineeringLab.Lab2;

import java.util.ArrayList;
import java.util.List;

public class LopWithCollections {
    private List<Person> list;

    public LopWithCollections() {
        list = new ArrayList<Person>();
    }

    public void add(Person person) {
        list.add(person);
    }

    public Person delete(Person person) {
        if (list.contains(person)) {
            list.remove(person);
            return person;
        } else {
            return null;
        }
    }

    public Person find(String name) {
        Person result = null;
        for (Person p : list) {
            if (p.getName().equals(name)) {
                result = p;
                break;
            }
        }
        if (result != null) {
            return result;
        } else {
            return null;
        }
    }

    public String print() {
        StringBuilder s = new StringBuilder();
        for (Person p : list) {
            if (p != null) {
                s.append(p.print(System.out));
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        LopWithCollections lop = new LopWithCollections();
        Date date = new Date(1,1,2010);
        Person person = new Person("yaya",date);
        Person person1 = new Person("Light",date);
        Person person2 = new Person("Gin",date);
        lop.add(person);
        lop.add(person1);

        System.out.println(lop.find("Light"));
        lop.print();
        System.out.println(lop.delete(person1));
        System.out.println(lop.delete(person2));
        lop.print();
    }
}
