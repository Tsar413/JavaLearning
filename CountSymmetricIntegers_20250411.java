package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class CountSymmetricIntegers_20250411 {
    private static List<Integer> list = new ArrayList<Integer>();

    static {
        list.add(11);
        list.add(22);
        list.add(33);
        list.add(44);
        list.add(55);
        list.add(66);
        list.add(77);
        list.add(88);
        list.add(99);
        for (int i = 1000; i <= 9999; i++) {
            int a = i / 1000;
            int b = (i - a * 1000) / 100;
            int c = (i - a * 1000 - b * 100) / 10;
            int d = i - a * 1000 - b * 100 - c * 10;
            if(a + b == c + d){
                list.add(i);
            }
        }
    }

    public int countSymmetricIntegers(int low, int high) {
        int index1 = binaryCount(high);
        int index2 = binaryCount(low);
        System.out.println(index1);
        System.out.println(index2);
        if(list.get(index1) == high && list.get(index2) == low){
            return index1 - index2 + 1;
        }
        if(list.get(index1) > high){
            index1--;
        }
        if(list.get(index2) > low){
            index2--;
        }
        if(index1 >= 0 && index2 >= 0 && (list.get(index1) == high || list.get(index2) == low) && index1 == index2){
            return 1;
        }
        return index1 - index2;
    }

    private int binaryCount(int data){
        int left = 0;
        int right = list.size() - 1;
        while (left < right){
            int mid = left + right >> 1;
            if(data < list.get(mid)){
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        int i1 = new CountSymmetricIntegers_20250411().countSymmetricIntegers(1, 100);
        // int i2 = new CountSymmetricIntegers_20250411().countSymmetricIntegers(1, 100);
        System.out.println(i1);
    }
}
