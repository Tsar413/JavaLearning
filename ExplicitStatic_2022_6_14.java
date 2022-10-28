package com.company.javaRelearn;

class Cup {
    Cup(int number) {
        System.out.println("Cup's number is " + number);
    }

    void f(int number) {
        System.out.println("f(" + number + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic_2022_6_14 {
    public static void main(String[] args) {
        Cup cup = new Cup(3);
        Cups.cup1.f(99);
        Cup cup3 = new Cup(4);
    }
}
