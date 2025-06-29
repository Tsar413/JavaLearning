package com.company.javaRelearn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxSum_20250611 {
    public long maxSum(List<Integer> nums, int m, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int index1 = 0;
        int index2 = 0;
        long result = 0;
        long flag = 0;
        while (index1 < nums.size()){
            if(map.containsKey(nums.get(index1))){
                int t = map.get(nums.get(index1));
                t++;
                map.put(nums.get(index1), t);
            } else {
                map.put(nums.get(index1), 1);
            }
            flag += nums.get(index1);
            index1++;
            if(index1 - index2 == k){
                if(map.size() >= m){
                    result = Math.max(result, flag);
                }
                int t = map.get(nums.get(index2));
                if(t == 1){
                    map.remove(nums.get(index2));
                } else {
                    t--;
                    map.put(nums.get(index2), t);
                }
                flag -= nums.get(index2);
                index2++;
            }
            if(index1 == nums.size() && map.size() >= m){
                result = Math.max(result, flag);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,1,2,1,2,1);
        int m = 3;
        int k = 3;
        System.out.println(new MaxSum_20250611().maxSum(nums, m, k));
    }
}
