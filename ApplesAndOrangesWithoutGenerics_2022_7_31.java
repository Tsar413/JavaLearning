package com.company.javaRelearn;

import java.util.ArrayList;

class Apple1 {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}

class Orange1 {}

public class ApplesAndOrangesWithoutGenerics_2022_7_31 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple1());
        }
        apples.add(new Orange1());
        for (int i = 0; i < apples.size(); i++) {
            ((Apple1)apples.get(i)).id();
        }
    }
}
