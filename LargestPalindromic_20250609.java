package com.company.javaRelearn;

import java.util.*;

public class LargestPalindromic_20250609 {
    public String largestPalindromic(String num) {
        Map<Character, Integer> map = new TreeMap<Character, Integer>(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2.compareTo(o1);
            }
        });
        for (char c : num.toCharArray()) {
            if(map.containsKey(c)){
                int t = map.get(c);
                t++;
                map.put(c, t);
            } else {
                map.put(c, 1);
            }
        }
        List<Character> list = new ArrayList<Character>(map.keySet());
        StringBuilder stringBuilderTemp = new StringBuilder();
        boolean flag = true;
        for (char c : list) {
            int count = map.get(c);
            if(count != 1){
                int addCountHalf = count / 2;
                stringBuilderTemp.append(String.valueOf(c).repeat(Math.max(0, addCountHalf)));
                count -= addCountHalf * 2;
                if(count == 0){
                    map.remove(c);
                } else {
                    map.put(c, count);
                }
            }
        }
        StringBuilder result = new StringBuilder(stringBuilderTemp);
        if(!map.isEmpty()){
            result.append(map.entrySet().iterator().next().getKey());
        }
        result.append(stringBuilderTemp.reverse());
        return result.toString().replaceAll("0*$", "").replaceAll("^(0+)", "");
    }

    public static void main(String[] args) {
        System.out.println(new LargestPalindromic_20250609().largestPalindromic("00001105"));
    }
}
