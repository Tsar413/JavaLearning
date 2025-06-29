package com.company.javaRelearn.UofGWeek8;

import java.util.ArrayList;
import java.util.List;

public class Lab2_2 {
    static <T> void writeListClass(List<? super T> list, T item) {
        list.add(item);
    }

    static <T> T getFirstElement(List<? extends T> list) {
        return list.get(0);
    }

    static List<Person> l1 = new ArrayList<Person>();

    static void f1() {
        writeListClass(l1, new Student());
    }

    static void f2() {
        Person p = getFirstElement(l1);
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
