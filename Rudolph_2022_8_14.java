package com.company.javaRelearn;

public class Rudolph_2022_8_14 {
    public static void main(String[] args) {
        for(String pattern : new String[] { "Rudolph",
            "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*"})
            System.out.println("Rudolph".matches(pattern));
    }
}
