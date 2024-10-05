package com.company.javaRelearn;

import java.util.*;

public class NumberOfPoints_20240915 {
    public int numberOfPoints(List<List<Integer>> nums) {
        Collections.sort(nums, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if(o1.get(0).equals(o2.get(0))){
                    return o2.get(1) - o1.get(1);
                }
                return o1.get(0) - o2.get(0);
            }
        });
        System.out.println(nums);
        List<List<Integer>> temp = new ArrayList<List<Integer>>();
        int index = 0;
        for (int i = 0; i < nums.size(); i++) {
            if(i == 0){
                temp.add(nums.get(0));
            } else {
                if(nums.get(i).get(0) > temp.get(index).get(0)){
                    if(nums.get(i).get(0) > temp.get(index).get(1)){
                        temp.add(nums.get(i));
                        index++;
                    } else {
                        if(nums.get(i).get(1) > temp.get(index).get(1)){
                            temp.get(index).set(1, nums.get(i).get(1));
                        }

                    }
                }
            }
        }
        int result = 0;
        for (int i = 0; i < temp.size(); i++) {
            result += (temp.get(i).get(1) - temp.get(i).get(0) + 1);
        }
        System.out.println(temp);
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3,6);
        List<Integer> list2 = Arrays.asList(1,5);
//        List<Integer> list5 = Arrays.asList(1,7);
//        List<Integer> list6 = Arrays.asList(1,3);
        List<Integer> list3 = Arrays.asList(4,7);
        List<List<Integer>> list4 = new ArrayList<List<Integer>>();
        list4.add(list1);
        list4.add(list2);
        list4.add(list3);
//        list4.add(list5);
//        list4.add(list6);
        System.out.println(new NumberOfPoints_20240915().numberOfPoints(list4));
    }
}
