package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class StableMountains_20241219 {
    public List<Integer> stableMountains(int[] height, int threshold) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i < height.length; i++) {
            if(height[i - 1] > threshold){
                list.add(i);
            }
        }
        return list;
    }
}
