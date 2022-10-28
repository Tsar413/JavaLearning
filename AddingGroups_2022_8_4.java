package com.company.javaRelearn;

import java.util.*;

public class AddingGroups_2022_8_4 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] integers = {6,7,8,9,10};
        collection.addAll(Arrays.asList(integers));
        Collections.addAll(collection,11,12,13,14,15);
        Collections.addAll(collection,integers);
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1,99);
    }
}
