package com.company.javaRelearn;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive_20240928 {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int n : nums){
            set.add(n);
        }
        int[] temp = new int[set.size()];
        int index = 0;
        for (int n : set){
            temp[index] = n;
            index++;
        }
        Arrays.sort(temp);
        int result = 1;
        int t = 1;
        for (int i = 1; i < temp.length; i++) {
            if(temp[i] - temp[i - 1] == 1){
                t++;
            } else {
                result = Math.max(result, t);
                t = 1;
            }
        }
        result = Math.max(result, t);
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        System.out.println(new LongestConsecutive_20240928().longestConsecutive(nums));
    }
}
