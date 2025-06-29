package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindClosestElements_20241217 {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int index = binarySearch(arr, x);
        List<Integer> result = new ArrayList<Integer>();
        if(arr[index] == x){
            result.add(arr[index]);
            k--;
            int left = index - 1;
            int right = index + 1;
            while (k > 0){
                if(left < 0){
                    result.add(arr[right]);
                    right++;
                    k--;
                } else if(right > arr.length - 1){
                    result.add(arr[left]);
                    left--;
                    k--;
                } else {
                    if(Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)){
                        result.add(arr[left]);
                        left--;
                        k--;
                    } else {
                        result.add(arr[right]);
                        right++;
                        k--;
                    }
                }
            }
        } else {
            int left = index - 1;
            int right = index;
            while (k > 0){
                if(left < 0){
                    result.add(arr[right]);
                    right++;
                    k--;
                } else if(right > arr.length - 1){
                    result.add(arr[left]);
                    left--;
                    k--;
                } else {
                    if(Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)){
                        result.add(arr[left]);
                        left--;
                        k--;
                    } else {
                        result.add(arr[right]);
                        right++;
                        k--;
                    }
                }
            }
        }
        Collections.sort(result);
        return result;
    }

    private int binarySearch(int[] arr, int x){
        int left = 0;
        int right = arr.length - 1;
        while (left < right){
            int mid = left + right >> 1;
            if(arr[mid] < x){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right;
    }
}
