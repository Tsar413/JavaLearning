package com.company.javaRelearn.SelfBound;

public class BasicHolder_2022_11_15<T> {
    T element;
    void set(T arg) {
        element = arg;
    }
    T get() {
        return element;
    }
    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
