package com.company.javaRelearn;

public class CallingConstructorsWithThis_2022_6_12 {
    int i = 0;
    String s = "hh";

    CallingConstructorsWithThis_2022_6_12(int m, String n) {
        this.i = m;
//        this(m);
        this.s = n;
        System.out.println("i = " + i + " s = " + s);
    }

    CallingConstructorsWithThis_2022_6_12() {
        this(47,"lol");
    }

    public static void main(String[] args) {
        CallingConstructorsWithThis_2022_6_12 a = new CallingConstructorsWithThis_2022_6_12();
    }
}
