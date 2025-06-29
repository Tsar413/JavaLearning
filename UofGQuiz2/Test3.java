package com.company.javaRelearn.UofGQuiz2;

public class Test3 {
    public static int p(int a) {
        if (a == 1) return 1;
        else
            return a + p(a - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(p(n));
    }
}
