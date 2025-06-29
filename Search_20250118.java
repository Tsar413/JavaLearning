package com.company.javaRelearn;

public class Search_20250118 {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + right >> 1;
            if(nums[mid] == target){
                return mid;
            } else {
                if(nums[mid] < target && target <= nums[right]){
                    left = mid + 1;
                } else if (nums[left] <= target && target < nums[mid]) {
                    right = mid;
                } else if ((target < nums[mid] && target < nums[right]) || (target > nums[mid] && target > nums[right])) {
                    left = mid + 1;
                } else if ((target < nums[mid] && target < nums[left]) || (target > nums[mid] && target > nums[left])) {
                    right = mid;
                }
            }
        }
        if(nums[right] == target){
            return right;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,1,2,3,4};
        System.out.println(new Search_20250118().search(nums, 1));
    }
}
