package com.company.javaRelearn;

import java.util.*;

public class FrequencySort_20250629 {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int n : nums){
            if(map.containsKey(n)){
                int t = map.get(n);
                t++;
                map.put(n, t);
            } else {
                map.put(n, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                if(Objects.equals(o1.getValue(), o2.getValue())){
                    return o2.getKey() - o1.getKey();
                }
                return o1.getValue() - o2.getValue();
            }
        });
        int[] result = new int[nums.length];
        int index = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            int t = 0;
            while (t < entry.getValue()){
                result[index] = entry.getKey();
                t++;
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 2, 5, 9, 9};
        System.out.println(Arrays.toString(new FrequencySort_20250629().frequencySort(nums)));
    }
}
