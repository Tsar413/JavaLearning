package com.company.javaRelearn;

import java.util.ArrayList;

class Apple2 {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}

class Orange2 {}

public class ApplesAndOrangesWithGenerics_2022_7_31 {
    public static void main(String[] args) {
        ArrayList<Apple2> apples = new ArrayList<Apple2>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple2());
        }
        for (int i = 0; i < apples.size(); i++) {
            System.out.println(apples.get(i).id());
        }
        for (Apple2 c: apples) {
            System.out.println(c.id());
        }
    }
}
