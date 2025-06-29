package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;

public class CountGood_20250416 {
    public long countGood(int[] nums, int k) {
        long result = 0;
        int index1 = 0;
        int index2 = 0;
        long count = 0;
        Map<Integer, int[]> map1 = new HashMap<Integer, int[]>();
        while (index1 < nums.length){
            if(map1.containsKey(nums[index1])){
                int[] array = map1.get(nums[index1]);
                array[0] = array[0] + 1;
                count -= array[1];
                array[1] = array[0] * (array[0] - 1) / 2;
                count += array[1];
                map1.put(nums[index1], array);
                if(count >= k){
                    result++;
                }
            } else {
                map1.put(nums[index1], new int[]{1, 0});
            }
            index1++;
        }
        while (index2 < nums.length){
            if(map1.containsKey(nums[index2])){
                int[] array = map1.get(nums[index2]);
                array[0]--;
                if(array[0] == 0){
                    map1.remove(nums[index2]);
                }
                count -= array[1];
                array[1] = array[0] * (array[0] - 1) / 2;
                count += array[1];
                map1.put(nums[index2], array);
                if(count >= k){
                    result++;
                } else {
                    break;
                }
            }
            index2++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 1, 2, 2, 3, 3, 2, 2, 1, 1, 1, 3, 1};
        System.out.println(new CountGood_20250416().countGood(nums, 11));
    }
}
