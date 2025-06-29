package com.company.javaRelearn;

import java.util.*;

public class FindRedundantConnection_20241027 {
    public int[] findRedundantConnection(int[][] edges) {
        int[] result = new int[2];
        Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
        for (int i = 0; i < edges.length; i++) {
            if(!map.containsKey(edges[i][0]) && !map.containsKey(edges[i][1])){
                Set<Integer> list1 = new HashSet<Integer>();
                list1.add(edges[i][1]);
                map.put(edges[i][0], list1);
                Set<Integer> list2 = new HashSet<Integer>();
                list2.add(edges[i][0]);
                map.put(edges[i][1], list2);
            } else if(map.containsKey(edges[i][0]) && !map.containsKey(edges[i][1])){
                Set<Integer> set1 = map.get(edges[i][0]);
                List<Integer> list1 = new ArrayList<Integer>(set1);
                Set<Integer> list2 = new HashSet<Integer>(list1);
                list2.add(edges[i][0]);
                map.put(edges[i][1], list2);
                for (int j = 0; j < list1.size(); j++) {
                    map.get(list1.get(j)).add(edges[i][1]);
                }
                map.get(edges[i][0]).add(edges[i][1]);
            } else if(!map.containsKey(edges[i][0]) && map.containsKey(edges[i][1])){
                Set<Integer> set1 = map.get(edges[i][1]);
                List<Integer> list1 = new ArrayList<Integer>(set1);
                Set<Integer> list2 = new HashSet<Integer>(list1);
                list2.add(edges[i][1]);
                map.put(edges[i][0], list2);
                for (int j = 0; j < list1.size(); j++) {
                    map.get(list1.get(j)).add(edges[i][0]);
                }
                map.get(edges[i][1]).add(edges[i][0]);
            } else {
                Set<Integer> set1 = map.get(edges[i][0]);
                Set<Integer> set2 = map.get(edges[i][1]);
                List<Integer> list1 = new ArrayList<Integer>(set1);
                List<Integer> list2 = new ArrayList<Integer>(set2);
                if(list1.contains(edges[i][1])){
                    result[0] = edges[i][0];
                    result[1] = edges[i][1];
                } else {
                    for (int j = 0; j < list1.size(); j++) {
                        map.get(list1.get(j)).addAll(list2);
                        map.get(list1.get(j)).add(edges[i][1]);
                    }
                    map.get(edges[i][0]).addAll(list2);
                    map.get(edges[i][0]).add(edges[i][1]);
                    for (int j = 0; j < list2.size(); j++) {
                        map.get(list2.get(j)).addAll(list1);
                        map.get(list2.get(j)).add(edges[i][0]);
                    }
                    map.get(edges[i][1]).addAll(list1);
                    map.get(edges[i][1]).add(edges[i][0]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] edges = {{3, 4}, {1, 2}, {2, 4}, {3, 5}, {2, 5}};
        int[][] edges1 = {{3, 7}, {1, 4}, {2, 8}, {1, 6}, {7, 9}, {6, 10}, {1, 7}, {2, 3}, {8, 9}, {5, 9}};
        System.out.println(Arrays.toString(new FindRedundantConnection_20241027().findRedundantConnection(edges1)));
    }
}
