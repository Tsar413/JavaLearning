package com.company.javaRelearn;

public class GenericClassReferences_2022_8_23 {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntClass = int.class;
        genericIntClass = Integer.class;
        intClass = double.class;
    }
}
