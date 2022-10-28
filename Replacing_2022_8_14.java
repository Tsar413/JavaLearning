package com.company.javaRelearn;

public class Replacing_2022_8_14 {
    static String s = Splitting_2022_8_14.knights;

    public static void main(String[] args) {
        System.out.println(s.replace("f\\w+","located"));
        System.out.println(s.replaceAll("shrubbery|tree|herring","banana"));
    }
}
