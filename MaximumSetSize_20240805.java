package com.company.javaRelearn;

import java.util.*;

public class MaximumSetSize_20240805 {
    public int maximumSetSize(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        int n = nums1.length;
        int n1 = 0;
        int n2 = 0;
        for (int n11 : nums1){
            boolean flag = set1.add(n11);
            if(!flag){
                n1++;
            }
        }
        for (int n22 : nums2){
            boolean flag = set2.add(n22);
            if(!flag){
                n2++;
            }
        }
        int nFlag1 = n - n1;
        int nFlag2 = n - n2;
        if(nFlag1 <= n / 2 && nFlag2 <= n / 2){
            Set<Integer> resSet = new HashSet<Integer>();
            resSet.addAll(set1);
            resSet.addAll(set2);
            return resSet.size();
        }
        Set<Integer> retainSet = new HashSet<Integer>();
        retainSet.addAll(set1);
        retainSet.retainAll(set2);
        int n3 = retainSet.size();
        if(nFlag1 <= n / 2 && nFlag2 > n / 2){
            nFlag2 -= n3;
            if(nFlag2 <= n / 2){
                return nFlag1 + nFlag2;
            } else {
                return nFlag1 + n / 2;
            }
        } else if(nFlag1 > n / 2 && nFlag2 <= n / 2){
            nFlag1 -= n3;
            if(nFlag1 <= n / 2){
                return nFlag1 + nFlag2;
            } else {
                return nFlag2 + n / 2;
            }
        } else {
            List<Integer> list1 = new ArrayList<Integer>(set1);
            List<Integer> list2 = new ArrayList<Integer>(set2);
            int left1 = nFlag1 - n / 2;
            int left2 = nFlag2 - n / 2;
            for (int i = 0; i < left1; i++) {
                list1.remove(i);
            }
            int length = list2.size();
            for (int i = length - 1; i >= length - left2; i--) {
                list2.remove(i);
            }
            Set<Integer> resSet = new HashSet<Integer>();
            resSet.addAll(list1);
            resSet.addAll(list2);
            return resSet.size();
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{8, 9};
        int[] nums2 = new int[]{4, 3};
        System.out.println(new MaximumSetSize_20240805().maximumSetSize(nums1, nums2));
    }
}
