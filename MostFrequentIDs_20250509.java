package com.company.javaRelearn;

import java.util.*;

public class MostFrequentIDs_20250509 {
    public long[] mostFrequentIDs(int[] nums, int[] freq) {
        Map<Integer, Long> map1 = new HashMap<Integer, Long>();
        Map<Long, List<Integer>> map2 = new TreeMap<Long, List<Integer>>();
        long[] result = new long[freq.length];
        for (int i = 0; i < freq.length; i++) {
            long v = 0; // 原来的
            long v2 = 0; // 改变的
            if(map1.containsKey(nums[i])){
                v = map1.get(nums[i]);
                v2 = v + freq[i];
                map1.put(nums[i], v2);
            } else {
                v = freq[i];
                v2 = freq[i];
                map1.put(nums[i], v2);
            }

            if(!map2.containsKey(v)){
                map2.put(v, new ArrayList<>(List.of(nums[i])));
            } else {
                if(v != v2){
                    List<Integer> list1 = map2.get(v);
                    list1.remove(list1.indexOf(nums[i]));
                    if(list1.isEmpty()){
                        map2.remove(v);
                    } else {
                        map2.put(v, list1);
                    }
                }

                if(!map2.containsKey(v2)){
                    map2.put(v2, new ArrayList<>(List.of(nums[i])));
                } else {
                    List<Integer> list2 = map2.get(v2);
                    list2.add(nums[i]);
                    map2.put(v2, list2);
                }
            }

            result[i] = new ArrayList<Long>(map2.keySet()).get(map2.size() - 1);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 8};
        int[] freq = {2, 2};
        System.out.println(Arrays.toString(new MostFrequentIDs_20250509().mostFrequentIDs(nums, freq)));
    }
}
