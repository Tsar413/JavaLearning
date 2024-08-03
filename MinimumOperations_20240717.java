package com.company.javaRelearn;

public class MinimumOperations_20240717 {
    public int minimumOperations(String num) {
        String[] nums = num.split("");
        int result = nums.length;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            boolean flag = false;
            if(nums[i].equals("0") || nums[i].equals("5")){
                flag = judge(nums, i + 1, "0");
            } else if(nums[i].equals("2") || nums[i].equals("7")){
                flag = judge(nums, i + 1, "5");
            }
            if(!flag){
                count++;
            }
            if(flag){
                result = Math.min(result, nums.length - i - 2);
            }
        }
        if(count == nums.length - 1){
            return nums.length - 1;
        }
        return result;
    }

    public boolean judge(String[] nums, int startIndex, String flag){
        for(int i = startIndex; i < nums.length; i++){
            if(nums[i].equals(flag)){
                return true;
            }
        }
        if(startIndex == nums.length && nums[startIndex - 1].equals("0")){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumOperations_20240717().minimumOperations("25"));
    }
}
