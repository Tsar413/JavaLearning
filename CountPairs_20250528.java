package com.company.javaRelearn;

import java.util.List;

public class CountPairs_20250528 {
    public int countPairs(List<List<Integer>> coordinates, int k) {
        int result = 0;
        for (int i = 0; i < coordinates.size() - 1; i++) {
            for (int j = i + 1; j < coordinates.size(); j++) {
                int i1 = (coordinates.get(i).get(0) ^ coordinates.get(j).get(0)) + (coordinates.get(i).get(1) ^ coordinates.get(j).get(1));
                if(i1 == k){
                    result++;
                }
            }
        }
        return result;
    }
}
