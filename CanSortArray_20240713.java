package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class CanSortArray_20240713 {
    public boolean canSortArray(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        int bitNum = Integer.bitCount(nums[0]);
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < nums.length; i++){
            if(Integer.bitCount(nums[i]) == bitNum){
                max = Math.max(max, nums[i]);
                min = Math.min(min, nums[i]);
            } else {
                list.add(min);
                list.add(max);
                max = nums[i];
                min = nums[i];
                bitNum = Integer.bitCount(nums[i]);
            }
        }
        list.add(min);
        list.add(max);
        for (int i = 1; i < list.size() - 1; i += 2) {
            if(list.get(i) > list.get(i + 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {8,4,2,30,15};
        System.out.println(new CanSortArray_20240713().canSortArray(nums));
    }
}
