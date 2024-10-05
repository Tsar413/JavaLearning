package com.company.javaRelearn;

public class MinimumTime_20241005 {
    public long minimumTime(int[] time, int totalTrips) {
        long min = Long.MAX_VALUE;
        for (int t : time){
            min = Math.min(min, t);
        }
        long left = min - 1;
        long right = min * totalTrips;
        while (left < right){
            long mid = left + right >> 1;
            if(check(time, totalTrips, mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    private boolean check(int[] time, int totalTrips, long mid){
        int flag = 0;
        for (int t : time){
            flag += mid / t;
        }
        if(flag >= totalTrips){
            return true;
        }
        return false;
    }
}
