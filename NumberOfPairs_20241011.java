package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NumberOfPairs_20241011 {
    public long numberOfPairs(int[] nums1, int[] nums2, int k) {
        Map<Integer, Integer> map1 = new TreeMap<Integer, Integer>();
        Map<Integer, Integer> map2 = new TreeMap<Integer, Integer>();
        for (int n : nums1){
            if(map1.containsKey(n)){
                int t = map1.get(n);
                t++;
                map1.put(n, t);
            } else {
                map1.put(n, 1);
            }
        }
        for (int n : nums2){
            int t1 = n * k;
            if(map2.containsKey(t1)){
                int t = map2.get(t1);
                t++;
                map2.put(t1, t);
            } else {
                map2.put(t1, 1);
            }
        }
        List<Integer> list1 = new ArrayList<Integer>(map1.keySet());
        int max = list1.get(list1.size() - 1);
        List<Integer> list2 = new ArrayList<Integer>(map2.keySet());
        long result = 0;
        for (int i = 0; i < list2.size(); i++) {
            int m = 1;
            while (m * list2.get(i) <= max){
                int index = binarySearch(list1, m * list2.get(i));
                if(list1.get(index) == m * list2.get(i)){
                    result += (map1.get(list1.get(index)) * map2.get(list2.get(i)));
                }
                m++;
            }
        }
        return result;
    }

    private int binarySearch(List<Integer> list, int target){
        int left = 0;
        int right = list.size() - 1;
        while (left < right){
            int mid = left + right >> 1;
            if(list.get(mid) == target){
                return mid;
            } else {
                if(list.get(mid) < target){
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        return right;
    }
}
