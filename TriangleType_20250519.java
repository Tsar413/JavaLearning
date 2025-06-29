package com.company.javaRelearn;

import java.util.Arrays;

public class TriangleType_20250519 {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] + nums[1] <= nums[2]){
            return "none";
        } else {
            if(nums[0] == nums[1] && nums[1] == nums[2]){
                return "equilateral";
            } else if((nums[0] == nums[1]) || (nums[1] == nums[2]) || (nums[0] == nums[2])){
                return "isosceles";
            } else {
                return "scalene";
            }
        }
    }
}
