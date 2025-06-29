package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;

public class CountDays_20250313 {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o2[1] - o1[1];
                }
                return o1[0] - o2[0];
            }
        });
        int start = meetings[0][0];
        int end = meetings[0][1];
        for (int i = 1; i < meetings.length; i++) {
            if(start <= meetings[i][0] && meetings[i][1] <= end){
                continue;
            } else if(start <= meetings[i][0] && meetings[i][0] < end && end < meetings[i][1]) {
                end = meetings[i][1];
            } else if(end < meetings[i][0]){
                days -= (end - start + 1);
                start = meetings[i][0];
                end = meetings[i][1];
            }
        }
        days -= (end - start + 1);
        return days;
    }

    public static void main(String[] args) {
        int[][] meetings = {{6,11},{7,13},{8,9},{5,8},{3,13},{11,13},{1,3},{5,10},{8,13},{3,9}};
        System.out.println(new CountDays_20250313().countDays(10, meetings));
    }
}
