package com.company.javaRelearn;

import java.util.*;

public class EdgeScore_20240921 {
    public int edgeScore(int[] edges) {
        Map<Integer, Long> map = new HashMap<Integer, Long>();
        for (int i = 0; i < edges.length; i++) {
            if(map.containsKey(edges[i])){
                long t = map.get(edges[i]);
                t += i;
                map.put(edges[i], t);
            } else {
                map.put(edges[i], (long) i);
            }
        }
        long[][] temp = new long[map.size()][2];
        List<Integer> keyList = new ArrayList<Integer>(map.keySet());
        for (int i = 0; i < keyList.size(); i++) {
            temp[i][0] = keyList.get(i);
            temp[i][1] = map.get(keyList.get(i));
        }
        Arrays.sort(temp, new Comparator<long[]>() {
            @Override
            public int compare(long[] o1, long[] o2) {
                if(o1[1] == o2[1]){
                    return (int) (o1[0] - o2[0]);
                }
                return (int) (o2[1] - o1[1]);
            }
        });
        return (int) temp[0][0];
    }

    public static void main(String[] args) {
        int[] edges = {1,0,1,1,1,1,1,1,1,1,1,1};
        System.out.println(new EdgeScore_20240921().edgeScore(edges));
    }
}
