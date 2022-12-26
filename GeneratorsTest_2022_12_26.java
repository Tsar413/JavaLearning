package com.company.javaRelearn;

import com.company.javaRelearn.Generator_2022_9_25.Generator;

public class GeneratorsTest_2022_12_26 {
    public static int size = 10;
    public static void test(Class<?> surroundingClass) {
        for (Class<?> type : surroundingClass.getClasses()) {
            System.out.println(type.getSimpleName() + ": ");
            try {
                Generator<?> g = (Generator<?>) type.newInstance();
                for (int i = 0; i < size; i++) {
                    System.out.printf(g.next() + " ");
                }
                System.out.println();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        test(CountingGenerator_2022_12_25.class);
    }
}
