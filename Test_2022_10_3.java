package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class Test_2022_10_3 {
    public static <T>List<T> makeList (T ...args) {
        List<T> list = new ArrayList<T>();
        for (T temp : args) {
            list.add(temp);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = makeList("A B C D".split(" "));
        System.out.println(list);
    }
}
