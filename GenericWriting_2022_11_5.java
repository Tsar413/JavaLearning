package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class GenericWriting_2022_11_5 {
    static <T> void writeExact(List<T> list, T item) {
        list.add(item);
    }

    static List<Apple3> apples = new ArrayList<Apple3>();
    static List<Fruit3> fruits = new ArrayList<Fruit3>();
    static void f1() {
        writeExact(apples, new Apple3());
        writeExact(fruits, new Apple3());
    }

    static <T> void writeWithWildCard(List<? super T> list, T item) {
        list.add(item);
    }

    static void f2() {
        writeWithWildCard(apples, new Apple3());
        writeWithWildCard(fruits, new Apple3());
    }

    public static void main(String[] args) {
        f1();
        f2();
    }
}
