package com.company.javaRelearn;

import java.util.*;

public class FindMaximumElegance_20240613 {
    public long findMaximumElegance(int[][] items, int k) {
        Arrays.sort(items, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return Integer.compare(b[0], a[0]);
            }
        });
        long result1 = categoryFirst(items, k);
        long result2 = profitFirst(items, k);
        return Math.max(result1, result2);
    }

    public long categoryFirst(int[][] items, int k){
        long result = 0;
        List<Integer> indexList = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < items.length; i++) {
            if(set.add(items[i][1])){
                indexList.add(i);
                result += items[i][0];
                if(set.size() == k){
                    result += set.size() * set.size();
                    break;
                }
            }
        }
        if(set.size() < k){
            int length = set.size();
            result += length * length;
            for (int i = 0; i < items.length; i++) {
                if(!indexList.contains(i)){
                    result += items[i][0];
                    length++;
                }
                if(length == k){
                    break;
                }
            }
        }
        return result;
    }

    public long profitFirst(int[][] items, int k){
        long result = 0L;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < k; i++){
            result += items[i][0];
            set.add(items[i][1]);
        }
        result += set.size() * set.size();
        return result;
    }

    public static void main(String[] args) {
        int[][] nums = {{1,8},{25,10},{16,1},{47,4},{29,7},{47,10},{45,7},{21,3},{6,9},{27,1},{49,4}};
        System.out.println(new FindMaximumElegance_20240613().findMaximumElegance(nums, 6));
    }
}
