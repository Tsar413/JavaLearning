package com.company.javaRelearn.GeneratorTest_2022_10_2;

import java.util.ArrayList;
import java.util.Collection;

public class SumGenerator {
    public static <T>Collection<T> fill(
            Collection<T> coll, GeneratorTest<T> gen, int n) {
        for(int i = 0; i < n; i++) {
            coll.add(gen.calculate());
        }
        return coll;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Collection<Integer> coll = fill(
                    new ArrayList<Integer>(), new SumNumbers(i), 10);
            System.out.println(coll);
        }


    }
}
