package com.company.javaRelearn;

public class SubsetXORSum_20250405 {
    public int subsetXORSum(int[] nums) {

        return recursiveCore(nums, 0, 0);
    }

    private int recursiveCore(int[] nums, int index, int data){
        if(index == nums.length - 1){
            return data ^ nums[index];
        }
        int sum = 0;
        for (int i = index; i < nums.length; i++) {
            int temp = data ^ nums[i];
            sum += temp;
            sum += recursiveCore(nums, i + 1, temp);
        }
        return sum;
    }
}
