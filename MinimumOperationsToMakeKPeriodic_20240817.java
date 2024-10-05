package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumOperationsToMakeKPeriodic_20240817 {
    public int minimumOperationsToMakeKPeriodic(String word, int k) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < word.length(); i += k) {
            String subString = word.substring(i, i + k);
            if(map.containsKey(subString)){
                int t = map.get(subString);
                t++;
                map.put(subString, t);
            } else {
                map.put(subString, 1);
            }
        }
        List<String> keyList = new ArrayList<String>(map.keySet());
        int result = 0;
        int longSize = 0;
        for (int i = 0; i < keyList.size(); i++) {
            String key = keyList.get(i);
            int value = map.get(key);
            if(value > longSize){
                result += longSize;
                longSize = value;
            } else {
                result += value;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumOperationsToMakeKPeriodic_20240817().
                minimumOperationsToMakeKPeriodic("leetcoleet", 2));
    }
}
