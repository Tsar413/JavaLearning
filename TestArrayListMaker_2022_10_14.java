package com.company.javaRelearn;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestArrayListMaker_2022_10_14<T> {
    public List<T> testListMaker(T t, int n) {
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < n; i++) {
            result.add(t);
        }
        return result;
    }

    public void outputList(List<T> list) {
        for(T t : list) {
            System.out.println(t);
        }
    }

    public T[] testArraysMaker(Class<T> type, int n) {
        return (T[]) Array.newInstance(type, n);
    }

    public void outputArrays(T[] ts) {
        for(T t : ts) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        TestArrayListMaker_2022_10_14<String> l1 = new TestArrayListMaker_2022_10_14<String>();
        List<String> list = l1.testListMaker("HE", 8);
        l1.outputList(list);

        String[] strings = l1.testArraysMaker(String.class, 5);
        l1.outputArrays(strings);
    }
}
