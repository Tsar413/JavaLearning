package com.company.javaRelearn;

class Tree {
    int height;
    Tree() {
        System.out.println("Planting a seed!");
        height = 0;
    }
    Tree(int initialHeight) {
        height = initialHeight;
        System.out.println(height + "feet tall");
    }
    void info() {
        System.out.println(height + "feet tall");
    }
    void info(String s) {
        System.out.println(s + height + "feet tall");
    }
}

public class Overloading_2021_6_6 {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Tree t = new Tree(i);
            t.info();
            t.info("Overloading method:");
        }
        new Tree();
    }
}
