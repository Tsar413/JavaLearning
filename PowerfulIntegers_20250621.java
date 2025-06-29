package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PowerfulIntegers_20250621 {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer> nums1 = new ArrayList<Integer>();
        List<Integer> nums2 = new ArrayList<Integer>();
        int value1 = 1;
        int value2 = 1;
        for (int i = 0; i < 20; i++) {
            nums1.add(value1);
            value1 *= x;
            nums2.add(value2);
            value2 *= y;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums1.size(); i++) {
            for (int j = 0; j < nums2.size(); j++) {
                if(nums1.get(i) + nums2.get(j) <= bound && nums1.get(i) + nums2.get(j) > 0){
                    set.add(nums1.get(i) + nums2.get(j));
                } else {
                    break;
                }
            }
        }
        return new ArrayList<Integer>(set);
    }
}
