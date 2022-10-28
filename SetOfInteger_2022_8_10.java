package com.company.javaRelearn;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetOfInteger_2022_8_10 {
    public static void main(String[] args) {
        Random rnd = new Random(47);
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 10000; i++) {
            set.add(rnd.nextInt(30));
        }
        System.out.println(set);
    }
}
