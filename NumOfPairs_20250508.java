package com.company.javaRelearn;

public class NumOfPairs_20250508 {
    public int numOfPairs(String[] nums, String target) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j){
                    if((nums[i] + nums[j]).equals(target)){
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
