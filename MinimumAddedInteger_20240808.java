package com.company.javaRelearn;

import java.util.Arrays;

public class MinimumAddedInteger_20240808 {
    public int minimumAddedInteger(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int diff0 = nums2[0] - nums1[0];
        int diff1 = nums2[0] - nums1[1];
        int diff2 = nums2[0] - nums1[2];
        boolean flag0 = judge(nums1, nums2, diff0);
        boolean flag1 = judge(nums1, nums2, diff1);
        boolean flag2 = judge(nums1, nums2, diff2);
        if(flag0 && !flag1 && !flag2){
            return diff0;
        } else if(!flag0 && flag1 && !flag2){
            return diff1;
        } else if(!flag0 && !flag1 && flag2){
            return diff2;
        } else if(flag0 && flag1 && !flag2){
            return Math.min(diff0, diff1);
        } else if(!flag0 && flag1 && flag2){
            return Math.min(diff1, diff2);
        } else if(flag0 && !flag1 && flag2){
            return Math.min(diff0, diff2);
        } else {
            return Math.min(diff0, Math.min(diff1, diff2));
        }
    }

    private boolean judge(int[] nums1, int[] nums2, int diff){
        int[] temp = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            temp[i] = nums1[i] + diff;
        }
        int index1 = 0;
        int index2 = 0;
        while(index1 < temp.length){
            if(index2 == nums2.length){
                break;
            }
            if(temp[index1] == nums2[index2]){
                index2++;
            }
            index1++;
        }
        return index2 == nums2.length;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{2,5,6,7,8,10};
        int[] nums2 = new int[]{3,4,5,8};
        int[] nums3 = new int[]{3,5,5,3};
        int[] nums4 = new int[]{7,7};
        System.out.println(new MinimumAddedInteger_20240808().minimumAddedInteger(nums3, nums4));
    }
}
