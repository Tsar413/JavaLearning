package com.company.javaRelearn.AlgorithmsDataStructuresLearning.Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Exam {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int a1 : a) {
            System.out.print(a1 + " ");
        }
        System.out.println();
        List<Integer> list = new ArrayList<>(10);
        System.out.println(list.size());

        Map<String, String> map1 = new TreeMap<String, String>();
        map1.put("na","ti");
        map1.put("je","no");
        Map<String, String> map2 = new TreeMap<String, String>();
        map2.put("zi","tw");
        map2.put("an","m");
        map2.put("na","pr");
        map1.putAll(map2);
        System.out.println(map1);
    }

}
