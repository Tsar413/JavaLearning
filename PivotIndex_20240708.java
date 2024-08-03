package com.company.javaRelearn;

public class PivotIndex_20240708 {
    public int pivotIndex(int[] nums) {
        int temp = 0;
        int[] sums = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            temp += nums[i];
            sums[i] = temp;
        }
        int index = 0;
        for (int i = 0; i < sums.length; i++) {
            if(index == 0){
                if(sums[sums.length - 1] - sums[0] == sums[0]){
                    return 0;
                }
            } else {
                if (sums[sums.length - 1] - sums[index] == sums[index - 1]) {
                    return index;
                }
            }

            index++;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        System.out.println(new PivotIndex_20240708().pivotIndex(nums));
    }
}
