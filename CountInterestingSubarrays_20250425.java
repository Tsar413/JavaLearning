package com.company.javaRelearn;

import java.util.List;

public class CountInterestingSubarrays_20250425 {
    public long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int n = nums.size();
        int[] sums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sums[i + 1] = sums[i] + (nums.get(i) % modulo == k ? 1 : 0);
        }


        long result = 0;
        int[] cnt = new int[Math.min(nums.size() + 1, modulo)];
        for (int s : sums) {
            if (s >= k) {
                result += cnt[(s - k) % modulo];
            }
            cnt[s % modulo]++;
        }
        return result;
    }
}
