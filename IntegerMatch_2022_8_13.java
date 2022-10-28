package com.company.javaRelearn;

public class IntegerMatch_2022_8_13 {
    public static void main(String[] args) {
        System.out.println("-1234".matches("-?\\d+"));
        System.out.println("5678".matches("-?\\d+"));
        System.out.println("+911".matches("-?\\d+"));
        System.out.println("+911".matches("([-+])?\\d+"));
    }
}
