package com.company.javaRelearn;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetOfInteger_2022_8_10 {
    public static void main(String[] args) {
        Random rnd = new Random(47);
        Set<Integer> set = new TreeSet<Integer>();
        for(int i = 0; i < 10000; i++) {
            set.add(rnd.nextInt(30));
        }
        System.out.println(set);
    }
}
