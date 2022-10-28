package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Test1<A, B> {
    public A first;
    public B second;
    Test1() {}
    Test1(A a, B b) {
        this.first = a;
        this.second = b;
    }

    @Override
    public String toString() {
        return "Test1{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}

class Test1_2<A, B, C> extends Test1<A, B> {
    public C third;
    Test1_2(A a, B b, C c) {
        super(a, b);
        this.third = c;
    }

    @Override
    public String toString() {
        return "Test1_2{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}

public class Test {
    public static Test1<Integer, String> f() {
        return new Test1<Integer, String>(3,"w");
    }
    public static Test1_2<Integer, String, Double> g() {
        return new Test1_2<>(3,"e",2.3);
    }

    @SafeVarargs
    static <T>List<T> createList(T ...args) {
        return new ArrayList<T>(Arrays.asList(args));
    }

    public static void main(String[] args) {
        Test1<Integer, String> test1 = f();
        System.out.println(test1);
        Test1_2<Integer, String, Double> test1_2 = g();
        System.out.println(test1_2);

        List<Integer> list = createList(1,2,3);
        System.out.println(list);


    }
}
