package com.company.javaRelearn;

class Letter {
    char c;
}

public class PassObject_2021_3_14 {
    static void f(Letter y) {
        y.c = 'z';
    }
    public static void main(String[] args) {
        Letter x = new Letter();
        x.c = 'a';
        System.out.println("x.c = " + x.c);
        f(x);
        System.out.println("x.c = " + x.c);
    }
}
