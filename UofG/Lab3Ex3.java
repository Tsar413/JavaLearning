package com.company.javaRelearn.UofG;

public class Lab3Ex3 {
    public static void testParameterChange(String parameterForTesting) {
        parameterForTesting += "b1";
        parameterForTesting += "c1";
        System.out.println(parameterForTesting);
    }

    public static void main(String[] args) {
        String initialParameter = "a1";
        testParameterChange(initialParameter);
        System.out.println(initialParameter);
    }
}
