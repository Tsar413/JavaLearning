package com.company.javaRelearn;

public class MovesToMakeZigzag_20250110 {
    public int movesToMakeZigzag(int[] nums) {
        int odd = 0;
        int even = 0;
        if(nums.length % 2 == 0){
            for (int i = 0; i < nums.length; i+=2) {
                if(i == 0){
                    if(nums[i] >= nums[i + 1]){
                        even += nums[i] - nums[i + 1] + 1;
                    }
                } else {
                    int t = Math.min(nums[i - 1], nums[i + 1]);
                    if(t <= nums[i]){
                        even += nums[i] - t + 1;
                    }
                }
            }
            for (int i = 1; i < nums.length; i+=2) {
                if(i == nums.length - 1){
                    if(nums[i] >= nums[i - 1]){
                        odd += nums[i] - nums[i - 1] + 1;
                    }
                } else {
                    int t = Math.min(nums[i - 1], nums[i + 1]);
                    if(t <= nums[i]){
                        odd += nums[i] - t + 1;
                    }
                }
            }
            return Math.min(odd, even);
        } else {
            for (int i = 0; i < nums.length; i+=2) {
                if(i == 0){
                    if(nums[i] >= nums[i + 1]){
                        even += nums[i] - nums[i + 1] + 1;
                    }
                } else if (i == nums.length - 1) {
                    if(nums[i] >= nums[i - 1]){
                        even += nums[i] - nums[i - 1] + 1;
                    }
                } else {
                    int t = Math.min(nums[i - 1], nums[i + 1]);
                    if(t <= nums[i]){
                        even += nums[i] - t + 1;
                    }
                }
            }
            for (int i = 1; i < nums.length; i += 2) {
                int t = Math.min(nums[i - 1], nums[i + 1]);
                if (t <= nums[i]) {
                    odd += nums[i] - t + 1;
                }
            }
            return Math.min(odd, even);
        }
    }
}
