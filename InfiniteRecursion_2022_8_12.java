package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion_2022_8_12 {
    @Override
    public String toString() {
        return "Infinite Recursion Address: " + super.toString() + "\n";
    }

    public static void main(String[] args) {
        List<InfiniteRecursion_2022_8_12> list = new ArrayList<InfiniteRecursion_2022_8_12>();
        for(int i = 0; i < 10; i++) {
            list.add(new InfiniteRecursion_2022_8_12());
        }
        System.out.println(list);
    }
}
