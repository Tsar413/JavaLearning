package com.company.javaRelearn;

import java.util.Arrays;

public class MaxDistance_20250214 {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        if(m == 2){
            return position[position.length - 1] - position[0];
        }
        int left = 1;
        int right = position[position.length - 1] - position[0];
        while (left <= right){
            int mid = left + right >> 1;
            if(check(position, m, mid)){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }

    public boolean check(int[] position, int m, int k){
        int cnt = 1;
        int x = position[0];
        for(int p : position){
            if(p - x >= k){
                cnt++;
                x = p;
            }
        }
        return cnt >= m;
    }
}
