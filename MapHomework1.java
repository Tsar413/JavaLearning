package com.company.javaRelearn;

import java.util.*;

public class MapHomework1 {
    public static void main(String[] args) {
//        问题1
        Map<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "a");
        map1.put(2, "b");
        map1.put(3, "c");
        System.out.println(map1);

//        问题2
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        map2.put(1, "a");
        map2.put(2, "c");
        map2.put(3, "c");
        System.out.println(map2);

//        问题3
//        Map<Integer, Integer> map3 = new HashMap<Integer, Integer>();
//        Map<Integer, int> map3 = new HashMap<Integer, int>();
//        Map<, Integer> map3 = new HashMap<, Integer>();

//        问题4
        Map<Integer, String> map4 = new HashMap<Integer, String>();
        map4.put(1, "a");
        map4.put(2, "b");
        map4.put(2, "c");
        Collection<String> collection = map4.values();
        System.out.println(collection);
        System.out.println(map4);
    }
}
