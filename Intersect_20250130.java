package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersect_20250130 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for (int n : nums1){
            if(map1.containsKey(n)){
                int t = map1.get(n);
                t++;
                map1.put(n, t);
            } else {
                map1.put(n, 1);
            }
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int n : nums2){
            if(map1.containsKey(n)){
                int v1 = map1.get(n);
                if(map2.containsKey(n)){
                    int v2 = map2.get(n);
                    if(v2 < v1){
                        result.add(n);
                        v2++;
                        map2.put(n, v2);
                    }
                } else {
                    result.add(n);
                    map2.put(n, 1);
                }
            }
        }
        return result.stream().mapToInt(Integer::valueOf).toArray();
    }
}
