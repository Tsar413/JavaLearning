package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinSetSize_20240717 {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int n : arr){
            if(map.containsKey(n)){
                int t = map.get(n);
                t++;
                map.put(n, t);
            } else {
                map.put(n, 1);
            }
        }
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        int flag = 0;
        int result = 0;
        int length = arr.length;
        while(flag < length / 2){
            int max = map.get(list.get(0));
            int index = 0;
            for(int i = 0; i < list.size(); i++){
                if(map.get(list.get(i)) > max){
                    max = map.get(list.get(i));
                    index = i;
                }
            }
            flag += max;
            map.put(list.get(index), -1);
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,3,3,3,5,5,5,2,2,7};
        System.out.println(new MinSetSize_20240717().minSetSize(nums));
    }
}
