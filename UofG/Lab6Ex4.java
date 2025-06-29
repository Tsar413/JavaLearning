package com.company.javaRelearn.UofG;

public class Lab6Ex4 {
    public static void showTriangle(int number) {
        String s = "";

        for (int i = 1; i <= number; i++) {
            for(int j = 0; j < number - i; j++) {
                s += " ";
            }
            for(int h = 0; h < i; h++) {
                s += i + " ";
            }
            s += "\n";

        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        showTriangle(5);
    }
}
