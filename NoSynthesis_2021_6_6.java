package com.company.javaRelearn;

class Bird2 {
    Bird2(int i) {}
    Bird2(double d) {}
}

public class NoSynthesis_2021_6_6 {
    public static void main(String[] args) {
        Bird2 b2 = new Bird2(5);
        Bird2 b3 = new Bird2(6.5);
    }
}
