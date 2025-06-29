package com.company.javaRelearn;

import java.util.Arrays;

public class Merge_20241103 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[nums1.length];
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < temp.length; i++) {
            if(index1 < m || index2 < n){
                if(index1 < m && index2 < n){
                    if(nums1[index1] < nums2[index2]){
                        temp[i] = nums1[index1];
                        index1++;
                    } else {
                        temp[i] = nums2[index2];
                        index2++;
                    }
                } else {
                    if(index1 >= m){
                        temp[i] = nums2[index2];
                        index2++;
                    } else {
                        temp[i] = nums1[index1];
                        index1++;
                    }
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            nums1[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        new Merge_20241103().merge(nums1,3,nums2,3);
    }
}
