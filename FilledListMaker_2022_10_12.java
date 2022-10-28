package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class FilledListMaker_2022_10_12<T> {
    List<T> create(T t, int n) {
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < n; i++) {
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        FilledListMaker_2022_10_12<String> stringMaker = new FilledListMaker_2022_10_12<String>();
        List<String> list = stringMaker.create("Hello", 4);
        System.out.println(list);
    }
}
