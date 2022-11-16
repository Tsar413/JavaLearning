package com.company.javaRelearn.SelfBound;

public class SelfBoundedMethod_2022_11_16 {
    static <T extends SelfBounded<T>> T f(T arg) {
        return arg.set(arg).get();
    }

    public static void main(String[] args) {
        A a = f(new A());
    }
}
