package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class Test_20240608 {
    List<Integer> list = new ArrayList<Integer>();
    int storage = 0;

    public int maxOperations(int[] nums) {
        if(nums.length == 2){
            return 1;
        }
        int t1 = nums[0] + nums[1];
        int t2 = nums[0] + nums[nums.length - 1];
        int t3 = nums[nums.length - 2] + nums[nums.length - 1];
        recursiveCore(nums, t1);
        recursiveCore(nums, t2);
        recursiveCore(nums, t3);
        int max = 0;
        for(int n : list){
            max = Math.max(max, n);
        }
        return max;
    }

    public void recursiveCore(int[] nums, int flag){
        if(nums.length > 1){
            int t1 = nums[0] + nums[1];
            int t2 = nums[0] + nums[nums.length - 1];
            int t3 = nums[nums.length - 2] + nums[nums.length - 1];
            boolean judge1 = true;
            boolean judge2 = true;
            boolean judge3 = true;
            if(t1 == flag){
                storage++;
                if(nums.length == 2){
                    recursiveCore(new int[0], flag);
                } else {
                    int[] tempArray = new int[nums.length - 2];
                    System.arraycopy(nums, 2, tempArray, 0, tempArray.length);
                    recursiveCore(tempArray, flag);
                }
                storage--;
            } else {
                judge1 = false;
            }
            if(t2 == flag){
                storage++;
                if(nums.length == 2){
                    recursiveCore(new int[0], flag);
                } else {
                    int[] tempArray = new int[nums.length - 2];
                    System.arraycopy(nums, 1, tempArray, 0, tempArray.length);
                    recursiveCore(tempArray, flag);
                }
                storage--;
            } else {
                judge2 = false;
            }
            if(t3 == flag){
                storage++;
                if(nums.length == 2){
                    recursiveCore(new int[0], flag);
                } else {
                    int[] tempArray = new int[nums.length - 2];
                    System.arraycopy(nums, 0, tempArray, 0, tempArray.length);
                    recursiveCore(tempArray, flag);
                }
                storage--;
            } else {
                judge3 = false;
            }
            if(!judge1 && !judge2 && !judge3){
                list.add(storage);
            }
        } else {
            list.add(storage);
            storage--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,9,7,3,2,7,4,12,2,6};
        System.out.println(new Test_20240608().maxOperations(nums));
    }
}
