package com.company.javaRelearn;

public class NumberOfPairs_20241010 {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int result = 0;
        for (int j : nums1) {
            for (int value : nums2) {
                if (j >= (value * k)) {
                    if (j % (value * k) == 0) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}
