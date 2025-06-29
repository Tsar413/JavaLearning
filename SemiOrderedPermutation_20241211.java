package com.company.javaRelearn;

public class SemiOrderedPermutation_20241211 {
    public int semiOrderedPermutation(int[] nums) {
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                index1 = i;
                if(index2 != - 1){
                    break;
                }
            }
            if(nums[i] == nums.length){
                index2 = i;
                if(index1 != - 1){
                    break;
                }
            }
        }
        if(index1 < index2){
            return index1 + nums.length - index2 - 1;
        } else {
            return index1 + nums.length - index2 - 2;
        }
    }
}
