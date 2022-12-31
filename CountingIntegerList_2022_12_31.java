package com.company.javaRelearn;

import java.util.AbstractList;

public class CountingIntegerList_2022_12_31 extends AbstractList<Integer> {
    private int size;

    public CountingIntegerList_2022_12_31(int size) {
        this.size = Math.max(size, 0);
    }

    @Override
    public Integer get(int index) {
        return size;
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        System.out.println(new CountingIntegerList_2022_12_31(30));
    }
}
