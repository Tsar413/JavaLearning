package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;

public class CountPairs_20250526 {
    public int countPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums){
            if(map.containsKey(num)){
                int t = map.get(num);
                t++;
                map.put(num, t);
            } else {
                map.put(num, 1);
            }
            String numString = String.valueOf(num);
            for (int i = 0; i < numString.length() - 1; i++) {
                for (int j = i + 1; j < numString.length(); j++) {
                    Integer changed = change(numString, i, j);
                    if(map.containsKey(changed)){
                        int t1 = map.get(changed);
                        t1++;
                        map.put(changed, t1);
                    } else {
                        map.put(changed, 1);
                    }
                }
            }
        }
        int result = 0;
        for (Integer value : map.values()) {
            result += value * (value - 1) / 2;
        }
        return result;
    }

    private Integer change(String num, int index1, int index2){
        String part1 = "";
        if(index1 != 0){
            part1 = num.substring(0, index1);
        }
        String part2 = String.valueOf(num.charAt(index2));
        String part3 = "";
        if(index1 + 1 != index2){
            part3 = num.substring(index1, index2);
        }
        String part4 = String.valueOf(num.charAt(index1));
        String part5 = "";
        if(index2 != num.length() - 1){
            part5 = num.substring(index2 + 1);
        }

        return Integer.valueOf(part1 + part2 + part3 + part4 + part5);
    }

    public static void main(String[] args) {
        int[] nums = {3, 12, 30, 17, 21};
        System.out.println(new CountPairs_20250526().countPairs(nums));
//        System.out.println(new CountPairs_20250526().change("1234", 0, 1));
    }
}
