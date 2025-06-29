package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueryResults_20250516 {
    public int[] queryResults(int limit, int[][] queries) {
        Map<Integer, List<Integer>> map1 = new HashMap<Integer, List<Integer>>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        int[] result = new int[queries.length];
        int index = 0;
        for (int[] query : queries){
            if(!map2.containsKey(query[0])){
                map2.put(query[0], query[1]);
                List<Integer> list;
                if(!map1.containsKey(query[1])){
                    list = new ArrayList<Integer>(List.of(query[0]));
                } else {
                    list = map1.get(query[1]);
                    list.add(query[0]);
                }
                map1.put(query[1], list);
            } else {
                int value1 = map2.get(query[0]);
                List<Integer> list1 = map1.get(value1);
                list1.remove(list1.indexOf(query[0]));
                if(list1.isEmpty()){
                    map1.remove(value1);
                } else {
                    map1.put(value1, list1);
                }
                map2.put(query[0], query[1]);
                List<Integer> list;
                if(!map1.containsKey(query[1])){
                    list = new ArrayList<Integer>(List.of(query[0]));
                } else {
                    list = map1.get(query[1]);
                    list.add(query[0]);
                }
                map1.put(query[1], list);
            }
            result[index] = map1.size();
            index++;
        }
        return result;
    }
}
