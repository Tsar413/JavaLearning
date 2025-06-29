package com.company.javaRelearn;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo_2023_1_7 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> linkedHashMap =
                new LinkedHashMap<Integer, String>(
                        new CountingMapData_2022_12_31(9));
        System.out.println(linkedHashMap);
        linkedHashMap =
                new LinkedHashMap<Integer, String>(16,0.75f,true);
        linkedHashMap.putAll(new CountingMapData_2022_12_31(9));
        System.out.println(linkedHashMap);
        for (int i = 0; i < 6; i++) {
            linkedHashMap.get(i);
        }
        System.out.println(linkedHashMap);
        linkedHashMap.get(0);
        System.out.println(linkedHashMap);
    }
}
