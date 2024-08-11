package com.company.javaRelearn;

import java.util.Arrays;

public class MaxUncrossedLines_20240811 {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int result = 0;
        int[] point = new int[nums1.length];
        int startIndex = 0;
        while (startIndex < nums1.length){
            int index1 = startIndex;
            int index2= 0;
            int temp = 0;
            int t2 = 0;
            while (index1 < nums1.length){
                while (index2 < nums2.length){
                    if(index1 >= nums1.length){
                        break;
                    }
                    if(nums1[index1] == nums2[index2]){
                        t2 = index2 + 1;
                        index1++;
                        index2++;
                        temp++;
                    } else {
                        index2++;
                    }
                }
                index2 = t2;
                index1++;
            }
            point[startIndex] = temp;
            result = Math.max(result, temp);
            startIndex++;
        }
        System.out.println(Arrays.toString(point));
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{3,1,4,1,1,3,5,1,2,2};
        int[] nums2 = new int[]{4,1,5,2,1,1,1,5,3,1,1,1,2,3,1,4,3,5,5,3,1,2,3,2,4,1,1,1,5,3};
        System.out.println(new MaxUncrossedLines_20240811().maxUncrossedLines(nums1, nums2));
    }
}
