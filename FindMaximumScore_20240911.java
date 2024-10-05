package com.company.javaRelearn;

import java.util.List;

public class FindMaximumScore_20240911 {
    public long findMaximumScore(List<Integer> nums) {
        long result = 0L;
        int index = 0;
        for (int i = 1; i < nums.size(); i++) {
            if(nums.get(index) < nums.get(i)){
                result += (i - index) * nums.get(index);
                index = i;
            }
        }
        if(index == 0){
            return (nums.size() - 1) * nums.get(0);
        }
        if(index < nums.size() - 1){
            result += (nums.size() - index - 1) * nums.get(index);
        }
        return result;
    }
}
