package com.company.javaRelearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Statistics_2022_8_10 {
    public static void main(String[] args) {
        Random rnd = new Random();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < 10000; i++) {
            int r = rnd.nextInt(20);
            Integer freq = map.get(r);
            map.put(r, freq == null ? 0 : freq + 1 );
        }
        System.out.println(map);
    }
}
