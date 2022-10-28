package com.company.javaRelearn;

class Value {
    int i;
}

public class EqualMethod2_2021_3_16 {
    public static void main(String[] args) {
        Value v1 = new Value();
        Value v2 = new Value();
        v1.i = v2.i = 100;
        System.out.println(v1.equals(v2));
        System.out.println((v1.i)==(v2.i));
    }
}
