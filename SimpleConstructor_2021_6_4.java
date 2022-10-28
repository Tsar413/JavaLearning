package com.company.javaRelearn;

class Rock {
    Rock(int i) {
        System.out.print("Rock" + i + " ");
    }
}

public class SimpleConstructor_2021_6_4 {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Rock(i);
        }
    }
}
