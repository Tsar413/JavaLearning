package com.company.javaRelearn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LargestCombination_20250112 {
    public int largestCombination(int[] candidates) {
        int result = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : candidates){
            String nums = Integer.toBinaryString(n);
            String temp = "";
            for (int i = nums.length() - 1; i >= 0; i--) {
                temp += nums.charAt(i);
            }
            for (int i = 0; i < temp.length(); i++) {
                if(temp.charAt(i) == '1'){
                    if(map.containsKey(i)){
                        int i1 = map.get(i);
                        i1++;
                        map.put(i, i1);
                    } else {
                        map.put(i, 1);
                    }
                }
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result = Math.max(result, entry.getValue());
        }
        return result;
    }

    public static void main(String[] args) {
        int[] candidates = {16, 17, 71, 62, 12, 24, 14};
        System.out.println(new LargestCombination_20250112().largestCombination(candidates));

    }
}
