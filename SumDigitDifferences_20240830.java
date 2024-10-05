package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SumDigitDifferences_20240830 {
    public long sumDigitDifferences(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums){
            if(map.containsKey(n)){
                int t = map.get(n);
                t++;
                map.put(n, t);
            } else {
                map.put(n, 1);
            }
        }
        long result = 0;
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int diff = check(list.get(i), list.get(j));
                result += (diff * map.get(list.get(i)) * map.get(list.get(j)));
            }
        }
        return result;
    }

    private int check(int nums1, int nums2){
        String s1 = String.valueOf(nums1);
        String s2 = String.valueOf(nums2);
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i) != s2.charAt(i)){
                result++;
            }
        }
        return result;
    }
}
