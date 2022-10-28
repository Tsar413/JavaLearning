package com.company.javaRelearn.Factory_2022_9_10;

public class ExamClass {
    public String makeString(int a, double b) {
        String s = "";
        s = String.format("a is %d, and b is %5.2f", a++, b);
        return s;
    }
    public static void main(String[] args) {
        int a = 4;
        double aDouble = 3.141529;
        String formatted = new ExamClass().makeString(a,aDouble); // Line B
        System.out.println(formatted); // Line A
        System.out.println(a); // Line C
        System.out.println(aDouble); // Line D
    }
}
