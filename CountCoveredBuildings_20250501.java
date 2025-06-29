package com.company.javaRelearn;

import java.util.*;

public class CountCoveredBuildings_20250501 {
    public int countCoveredBuildings(int n, int[][] buildings) {
        Map<Integer, List<Integer>> map1 = new HashMap<Integer, List<Integer>>();
        Map<Integer, List<Integer>> map2 = new HashMap<Integer, List<Integer>>();
        for (int i = 1; i <= n; i++) {
            map1.put(i, new ArrayList<Integer>());
            map2.put(i, new ArrayList<Integer>());
        }
        Arrays.sort(buildings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        for (int i = 0; i < buildings.length; i++) {
            map1.get(buildings[i][0]).add(buildings[i][1]);
            map2.get(buildings[i][1]).add(buildings[i][0]);
        }
        int result = 0;
        for (Map.Entry<Integer, List<Integer>> entry : map1.entrySet()) {
            int key = entry.getKey();
            List<Integer> value = entry.getValue();
            if(value.size() >= 3){
                for (int i = 1; i < value.size() - 1; i++) {
                    int v = value.get(i);
                    List<Integer> list = map2.get(v);
                    if(list.indexOf(key) != 0 && list.indexOf(key) != list.size() && list.size() >= 3){
                        result++;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] buildings = {{1, 2}, {2, 1}, {3, 1}, {1, 1}, {3, 3}, {3, 2}};
        System.out.println(new CountCoveredBuildings_20250501().countCoveredBuildings(3, buildings));
    }
}
