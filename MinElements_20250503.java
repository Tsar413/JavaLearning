package com.company.javaRelearn;

public class MinElements_20250503 {
    public int minElements(int[] nums, int limit, int goal) {
        long sum = 0;
        for (int n : nums){
            sum += n;
        }
        long goal1 = goal;
        long limit1 = limit;
        long result = 0;
        if(sum < goal1){
            if(sum + limit1 >= goal1){
                result = 1;
            } else {
                goal1 -= sum;
                if(goal1 < 0){
                    goal1 = -goal1;
                }
                if(goal1 % limit1 == 0){
                    result = goal1 / limit1;
                } else {
                    result = goal1 / limit1 + 1;
                }
            }
        } else if(sum > goal1){
            if(sum - limit1 <= goal1){
                result = 1;
            } else {
                goal1 -= sum;
                if(goal1 < 0){
                    goal1 = -goal1;
                }
                if(goal1 % limit1 == 0){
                    result = (int) goal1 / limit1;
                } else {
                    result = (int) goal1 / limit1 + 1;
                }
            }
        }
        return (int) result;
    }

    public static void main(String[] args) {
        int[] nums = {1, -1, 1};
        System.out.println(new MinElements_20250503().minElements(nums, 3, -4));
    }
}
