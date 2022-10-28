package com.company.javaRelearn;

public class OptionalTrailingArguments_2022_6_16 {
    static void f(int required, String ... Trailing) {
        System.out.print(required);
        for(String s : Trailing)
            System.out.print(s);
        System.out.println();
    }

    public static void main(String[] args) {
        f(1,"hello");
        f(2,"test");
        f(0);
    }
}
