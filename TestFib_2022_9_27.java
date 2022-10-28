package com.company.javaRelearn;

public class TestFib_2022_9_27 {
    public static int fib(int n) {
        if(n == 1 || n == 2) {
            return 1;
        } else {
            return fib(n - 2) + fib(n - 1);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(fib(i));
        }

    }
}
