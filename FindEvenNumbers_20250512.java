package com.company.javaRelearn;

import java.util.*;

public class FindEvenNumbers_20250512 {
    private Set<Integer> set = new TreeSet<Integer>();

    public int[] findEvenNumbers(int[] digits) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : digits){
            if(map.containsKey(n)){
                int t = map.get(n);
                t++;
                map.put(n, t);
            } else {
                map.put(n, 1);
            }
        }
        recursiveCore(map, 1, "");
        return set.stream().mapToInt(Integer::intValue).toArray();
    }

    private void recursiveCore(Map<Integer, Integer> map, int level, String num){
        List<Integer> keys = new ArrayList<>(map.keySet());
        if(level == 1){
            for (Integer key : keys){
                if(key != 0 && map.get(key) != 0){
                    int t = map.get(key);
                    t--;
                    map.put(key, t);
                    recursiveCore(map, 2, num + key);
                    t++;
                    map.put(key, t);
                }
            }
        }
        if(level == 2){
            for (Integer key : keys){
                if(map.get(key) != 0){
                    int t = map.get(key);
                    t--;
                    map.put(key, t);
                    recursiveCore(map, 3, num + key);
                    t++;
                    map.put(key, t);
                }
            }
        }
        if(level == 3){
            for (Integer key : keys){
                if(map.get(key) != 0 && key % 2 == 0){
                    set.add(Integer.valueOf(num + key));
                }
            }
        }
    }
}
