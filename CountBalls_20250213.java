package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;

public class CountBalls_20250213 {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = lowLimit; i <= highLimit; i++) {
            int sum = 0;
            int t = i;
            while (t > 0){
                sum += (t % 10);
                t /= 10;
            }
            if(map.containsKey(sum)){
                int i1 = map.get(sum);
                i1++;
                map.put(sum, i1);
            } else {
                map.put(sum, 1);
            }
        }
        int result = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            result = Math.max(result, entry.getValue());
        }
        return result;
    }
}
