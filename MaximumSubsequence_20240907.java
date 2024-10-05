package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class MaximumSubsequence_20240907 {
    public long maximumSubsequenceCount(String text, String pattern) {
        String data = "";
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == pattern.charAt(0) || text.charAt(i) == pattern.charAt(1)){
                data += text.charAt(i);
            }
        }
        System.out.println(data);
        int pattern1 = 0;
        int pattern2 = 0;
        List<Integer> list1 = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<Integer>();
        for (int i = 0; i < data.length(); i++) {
            if(i == 0 && data.charAt(i) == pattern.charAt(1)){
                list1.add(0);
                pattern2++;
            } else {
                if(data.charAt(i) == pattern.charAt(0)){
                    pattern1++;
                    if(pattern2 != 0){
                        list2.add(pattern2);
                        pattern2 = 0;
                    }
                } else {
                    pattern2++;
                    if(pattern1 != 0){
                        list1.add(pattern1);
                        pattern1 = 0;
                    }
                }
            }
        }
        if(pattern1 != 0){
            list1.add(pattern1);
        }
        if(pattern2 != 0){
            list2.add(pattern2);
        }
        System.out.println(list1);
        System.out.println(list2);
        long result1 = 0L;
        long result2 = 0L;
        if(list1.size() > list2.size()){
            int temp1 = 0;
            long result = 0;
            int sum1 = 0;
            for (int i = 0; i < list1.size() - 1; i++) {
                temp1 = list1.get(i);
                sum1 += list1.get(i);
                int temp2 = 0;
                for (int j = i; j < list2.size(); j++) {
                    temp2 += list2.get(j);
                }
                result += temp1 * temp2;
            }
            int sum2 = 0;
            for (int j = 0; j < list2.size(); j++) {
                sum2 += list2.get(j);
            }
            result1 = result + sum2;
            result2 = result + sum1;
            result2 += list1.get(list1.size() - 1);
            return Math.max(result1, result2);
        } else {
            int temp1 = 0;
            long result = 0;
            int sum1 = 0;
            for (int i = 0; i < list1.size(); i++) {
                temp1 = list1.get(i);
                sum1 += list1.get(i);
                int temp2 = 0;
                for (int j = i; j < list2.size(); j++) {
                    temp2 += list2.get(j);
                }
                result += temp1 * temp2;
            }
            int sum2 = 0;
            for (int j = 0; j < list2.size(); j++) {
                sum2 += list2.get(j);
            }
            result1 = result + sum2;
            result2 = result + sum1;
            return Math.max(result1, result2);
        }
    }

    public static void main(String[] args) {
        String text = "cabdcdbc";
        String pattern = "ac";
        System.out.println(new MaximumSubsequence_20240907().maximumSubsequenceCount(text, pattern));
    }
}
