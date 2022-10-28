package com.company.javaRelearn;

public class ThisUse_2022_6_12 {
    int i = 0;

    ThisUse_2022_6_12 increase() {
        i++;
        return this;
    }

    void print() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        int i = 9;
        ThisUse_2022_6_12 thisUse_2022_6_12 = new ThisUse_2022_6_12();
        thisUse_2022_6_12.increase().increase().print();

    }
}
