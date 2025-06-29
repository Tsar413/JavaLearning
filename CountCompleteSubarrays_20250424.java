package com.company.javaRelearn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountCompleteSubarrays_20250424 {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int n : nums){
            set.add(n);
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int left = 0;
        int right = 0;
        int result = 0;
        while (left < nums.length){
            if(map.containsKey(nums[left])){
                int t = map.get(nums[left]);
                t++;
                map.put(nums[left], t);
            } else {
                map.put(nums[left], 1);
            }
            if(map.size() == set.size()){
                while (map.size() == set.size()){
                    result += (nums.length - left);
                    int t = map.get(nums[right]);
                    t--;
                    if(t == 0){
                        map.remove(nums[right]);
                    } else {
                        map.put(nums[right], t);
                    }
                    right++;
                }
            }
            left++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {5, 5, 5, 5};
        System.out.println(new CountCompleteSubarrays_20250424().countCompleteSubarrays(nums));
    }
}
