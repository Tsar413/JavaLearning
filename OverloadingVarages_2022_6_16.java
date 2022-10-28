package com.company.javaRelearn;

public class OverloadingVarages_2022_6_16 {
    static void f(Integer i, Character ... args) {
        System.out.println("First");
    }

    static void f(char j, Character ... args) {
        System.out.println("Second");
    }

    public static void main(String[] args) {
        f(1,'a');
        f('a','b');
    }
}
