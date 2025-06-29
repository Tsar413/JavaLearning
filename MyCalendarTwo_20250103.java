package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class MyCalendarTwo_20250103 {
    static class MyCalendarTwo {
        private List<int[]> oneList;
        private List<int[]> twoList;

        public MyCalendarTwo() {
            this.oneList = new ArrayList<int[]>();
            this.twoList = new ArrayList<int[]>();
        }

        public boolean book(int startTime, int endTime) {
            if(oneList.isEmpty()){
                oneList.add(new int[]{startTime, endTime});
                return true;
            }
            if(!twoList.isEmpty()){
                for (int i = 0; i < twoList.size(); i++) {
                    int[] temp = twoList.get(i);
                    if((temp[0] <= startTime && startTime < temp[1]) ||
                            (temp[0] < endTime && endTime <= temp[1]) ||
                            (startTime <= temp[0] && temp[1] <= endTime)){
                        return false;
                    }
                }
            }
            List<Integer> list1 = new ArrayList<Integer>();
            for (int i = 0; i < oneList.size(); i++) {
                int[] temp = oneList.get(i);
                if((temp[0] <= startTime && startTime < temp[1]) ||
                        (temp[0] < endTime && endTime <= temp[1]) ||
                        (startTime <= temp[0] && temp[1] <= endTime)){
                    list1.add(i);
                }
            }
            for (int i = 0; i < list1.size(); i++) {
                int[] temp = oneList.get(list1.get(i));
                if(temp[0] <= startTime && startTime < temp[1] && temp[1] <= endTime){
                    twoList.add(new int[]{startTime, temp[1]});
                } else if(startTime < temp[0] && temp[0] < endTime && endTime <= temp[1]){
                    twoList.add(new int[]{temp[0], endTime});
                } else if(temp[0] <= startTime && endTime <= temp[1]){
                    twoList.add(new int[]{startTime, endTime});
                } else if (startTime < temp[0] && temp[1] < endTime) {
                    twoList.add(new int[]{temp[0], temp[1]});
                }
            }
            oneList.add(new int[]{startTime, endTime});
            return true;
        }
    }

    public static void main(String[] args) {
        MyCalendarTwo myCalendarTwo = new MyCalendarTwo();
        System.out.println(myCalendarTwo.book(12,26));
        System.out.println(myCalendarTwo.book(70,85));
        System.out.println(myCalendarTwo.book(55,67));
        System.out.println(myCalendarTwo.book(2,13));
        System.out.println(myCalendarTwo.book(91,100));
        System.out.println(myCalendarTwo.book(13,26));
        System.out.println(myCalendarTwo.book(41,55));
        System.out.println(myCalendarTwo.book(50,68));
        System.out.println(myCalendarTwo.book(95,100));
        System.out.println(myCalendarTwo.book(27,43));
        System.out.println(myCalendarTwo.book(80,95));
        System.out.println(myCalendarTwo.book(61,77));
    }
}
