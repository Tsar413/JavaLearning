package com.company.javaRelearn;

import java.util.*;

public class CountPairs_20250531 {

    private static Set<Integer> set;

    static {
        set = new HashSet<Integer>();
        int num = 1;
        for (int i = 0; i <= 21; i++) {
            set.add(num);
            num *= 2;
        }
    }

    public int countPairs(int[] deliciousness) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int delicious : deliciousness){
            if(map.containsKey(delicious)){
                int t = map.get(delicious);
                t++;
                map.put(delicious, t);
            } else {
                map.put(delicious, 1);
            }
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        int result = 0;
        int mod = 1_000_000_007;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i; j < list.size(); j++) {
                if(Objects.equals(list.get(i), list.get(j))){
                    if(set.contains(list.get(i) + list.get(j))){
                        result += map.get(list.get(i)) * (map.get(list.get(i)) - 1) / 2 % mod;
                    }
                } else {
                    if(set.contains(list.get(i) + list.get(j))){
                        result += map.get(list.get(i)) * map.get(list.get(j)) % mod;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        System.out.println(new CountPairs_20250531().countPairs(nums));
    }
}
