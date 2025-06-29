package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MedianSlidingWindow_20241208 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        int index1 = 0;
        int index2 = 0;
        List<Integer> list = new LinkedList<Integer>();
        while (index1 - index2 < k){
            list.add(nums[index1]);
            index1++;
        }
        Collections.sort(list);
        int index3 = 0;
        double[] result = new double[nums.length - k + 1];
        if(k % 2 == 0){
            result[index3] = (list.get(k / 2) * 1.0 + list.get(k / 2 - 1)) / 2;
        } else {
            result[index3] = list.get(k / 2);
        }
        index3++;
        while (index3 < result.length){
            list.remove(list.indexOf(nums[index2]));
            int temp = binarySearch(list, nums[index1]);
            list.add(temp, nums[index1]);
            if(k % 2 == 0){
                result[index3] = (list.get(k / 2) * 1.0 + list.get(k / 2 - 1)) / 2;
            } else {
                result[index3] = list.get(k / 2);
            }
            index1++;
            index2++;
            index3++;
        }
        return result;
    }

    private int binarySearch(List<Integer> list, int n){
        int left = 0;
        int right = list.size();
        while (left < right){
            int mid = left + right >> 1;
            if(list.get(mid) < n){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        System.out.println(Arrays.toString(new MedianSlidingWindow_20241208().medianSlidingWindow(nums, 3)));
    }
}
