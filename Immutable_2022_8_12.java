package com.company.javaRelearn;

public class Immutable_2022_8_12 {
    public static String upCase(String m) {
        return m.toUpperCase();
    }

    public static void main(String[] args) {
        String q = "howdy";
        System.out.println(q);
        String qq = upCase(q);
        System.out.println(qq);
        System.out.println(q);
    }
}
