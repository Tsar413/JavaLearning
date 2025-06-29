package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class GetKth_20241222 {
    private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    public int getKth(int lo, int hi, int k) {
        for (int i = lo; i <= hi; i++) {
            int n = recursiveCore(i, 0);
            map.put(i, n);
        }
        int[][] judge = new int[hi - lo + 1][2];
        int t = lo;
        for (int i = 0; i < judge.length; i++) {
            judge[i][0] = map.get(t);
            judge[i][1] = t;
            t++;
        }
        Arrays.sort(judge, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]){
                    return o1[1] - o2[1];
                }
                return o1[0] - o2[0];
            }
        });
        return judge[k - 1][1];
    }

    private int recursiveCore(int target, int step){
        if(target == 1){
            return step;
        }
        if(map.containsKey(target)){
            return step + map.get(target);
        }
        if(target % 2 == 0){
            int t = recursiveCore(target / 2, step + 1);
            map.put(target, t - step);
            return t;
        } else {
            int t = recursiveCore(target * 3 + 1, step + 1);
            map.put(target, t - step);
            return t;
        }
    }

    public static void main(String[] args) {
//        System.out.println(new GetKth_20241222().getKth(12,15,2));
//        System.out.println(map);
//        System.out.println(new GetKth_20241222().getKth(7,11,4));
//        System.out.println(map);
        System.out.println(new GetKth_20241222().getKth(1,1,1));

    }
}
