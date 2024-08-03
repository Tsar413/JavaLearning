package com.company.javaRelearn;

import java.util.Arrays;
import java.util.List;

public class CountBeautifulPairs_20240620 {
    public int countBeautifulPairs(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                int highLength = String.valueOf(nums[i]).length() - 1;
                int highestBit = (int) (nums[i] / Math.pow(10, highLength));
                int lastBit = nums[j] % 10;
                if(checkGcd(highestBit, lastBit)){
                    result++;
                }
            }
        }
        return result;
    }

    public boolean checkGcd(int a, int b){
        List<Integer> list1 = Arrays.asList(2, 4, 6, 8);
        List<Integer> list2 = Arrays.asList(3, 6, 9);
        List<Integer> list3 = Arrays.asList(5);
        List<Integer> list4 = Arrays.asList(9);
        if(a == b && a != 1 && b != 1){
            return false;
        } else if(a == b && a == 1 && b == 1){
            return true;
        } else if(a == 1 || b == 1){
            return true;
        } else {
            if((list1.contains(a) && list1.contains(b)) || (list2.contains(a) && list2.contains(b)) || (list3.contains(a) && list3.contains(b)) || (list4.contains(a) && list4.contains(b))){
                return false;
            } else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 4};
        System.out.println(new CountBeautifulPairs_20240620().countBeautifulPairs(nums));
    }
}
