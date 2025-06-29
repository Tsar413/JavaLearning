package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IncreasingTriplet_20241202 {
    public boolean increasingTriplet(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums){
            if(map.isEmpty()){
                map.put(n, 1);
            } else {
                List<Integer> list = new ArrayList<Integer>(map.keySet());
                for (int n1 : list){
                    if(n1 < n){
                        if(map.get(n1) == 2){
                            return true;
                        } else {
                            int t = map.get(n1);
                            t++;
                            map.put(n, t);
                        }
                    }
                }
                if(!map.containsKey(n)){
                    map.put(n, 1);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0, 4, 2, 1, 0, -1, -3};
        System.out.println(new IncreasingTriplet_20241202().increasingTriplet(nums));
    }
}
