package com.company.javaRelearn;

public class CountAlternatingSubarrays_20240706 {
    public long countAlternatingSubarrays(int[] nums) {
        long result = 0L;
        int startIndex = 0;
        int endIndex = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i + 1]){
                endIndex = i + 1;
            } else {
                result += (endIndex - startIndex + 2) * (endIndex - startIndex + 1) / 2;
                startIndex = i;
                endIndex = i;
            }
        }
        if(endIndex > startIndex){
            result += (endIndex - startIndex + 2) * (endIndex - startIndex + 1) / 2;
        } else {
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0,1};
        System.out.println(new CountAlternatingSubarrays_20240706().countAlternatingSubarrays(nums));
    }
}
