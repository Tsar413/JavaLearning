package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MinimumMoney_20250125 {
    public long minimumMoney(int[][] transactions) {
        List<int[]> list = new ArrayList<int[]>();
        int cost2 = 0;
        for (int i = 0; i < transactions.length; i++) {
            if(transactions[i][0] < transactions[i][1]){
                cost2 = Math.max(cost2, transactions[i][0]);
            } else {
                list.add(transactions[i]);
            }
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        long cost1 = 0;
        for (int i = 0; i < list.size(); i++) {
            int[] t = list.get(i);
            if(i == 0){
                cost1 += t[0];
            } else {
                int[] t1 = list.get(i - 1);
                cost1 += (t[0] - t1[1]);
            }
        }
        int get1 = 0;
        if(!list.isEmpty()){
            get1 = list.get(list.size() - 1)[1];
        }
        if(get1 < cost2){
            cost1 = cost1 + cost2 - get1;
        }
        return cost1;
    }
}
