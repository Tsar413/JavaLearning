package com.company.javaRelearn;

import java.util.*;

public class MyCalendar_20250102 {
    static class MyCalendar {
        private List<int[]> list;

        public MyCalendar() {
            list = new ArrayList<int[]>();
        }

        public boolean book(int startTime, int endTime) {
            if(list.isEmpty()){
                list.add(new int[]{startTime, endTime});
                return true;
            }
            int left = 0;
            int right = list.size();
            while (left < right){
                int mid = left + right >> 1;
                if((list.get(mid)[0] <= startTime && startTime < list.get(mid)[1]) ||
                        (list.get(mid)[0] < endTime && endTime <= list.get(mid)[1]) ||
                        (startTime <= list.get(mid)[0] && list.get(mid)[1] <= endTime)){
                    return false;
                } else {
                    if(endTime <= list.get(mid)[0]){
                        right = mid;
                    } else {
                        left = mid + 1;
                    }
                }
            }
            list.add(new int[]{startTime, endTime});
            Collections.sort(list, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[0] - o2[0];
                }
            });
            return true;
        }
    }

    public static void main(String[] args) {
        MyCalendar myCalendar = new MyCalendar();
        System.out.println(myCalendar.book(20,29));
        System.out.println(myCalendar.book(44,50));
        System.out.println(myCalendar.book(1,7));
        System.out.println(myCalendar.book(14,20));
        System.out.println(myCalendar.book(36,42));
        System.out.println(myCalendar.book(12,20));
//        System.out.println(myCalendar.book(19,25));
//        System.out.println(myCalendar.book(3,8));
//        System.out.println(myCalendar.book(8,13));
//        System.out.println(myCalendar.book(18,27));
    }
}
