package com.company.javaRelearn;

import java.util.*;

public class CountLargestGroup_20250423 {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int num = i;
            if(String.valueOf(num).length() == 4){
                sum += num / 1000;
                num %= 1000;
                sum += num / 100;
                num %= 100;
                sum += num / 10;
                num %= 10;
                sum += num;
            } else if(String.valueOf(num).length() == 3){
                sum += num / 100;
                num %= 100;
                sum += num / 10;
                num %= 10;
                sum += num;
            } else if(String.valueOf(num).length() == 2){
                sum += num / 10;
                num %= 10;
                sum += num;
            } else {
                sum += num;
            }
            if(map.containsKey(sum)){
                int t = map.get(sum);
                t++;
                map.put(sum, t);
            } else {
                map.put(sum, 1);
            }
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return Integer.compare(o2.getValue(), o1.getValue());
            }
        });
        int result = 0;
        int flag = list.get(0).getValue();
        for (Map.Entry<Integer, Integer> entry : list) {
            if(flag == entry.getValue()){
                result++;
            } else {
                break;
            }
        }
        return result;
    }
}
