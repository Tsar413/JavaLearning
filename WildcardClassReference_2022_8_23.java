package com.company.javaRelearn;

public class WildcardClassReference_2022_8_23 {
    public static void main(String[] args) {
        Class<?> intClass = int.class;
        intClass = double.class;
    }
}
