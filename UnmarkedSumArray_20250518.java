package com.company.javaRelearn;

import java.util.*;


public class UnmarkedSumArray_20250518 {
    /**
     * @author Tsar413
     * @return long[]
     */
    public long[] unmarkedSumArray(int[] nums, int[][] queries) {
        List<int[]> list = new ArrayList<int[]>();
        Set<Integer> set = new HashSet<Integer>();
        long sum = 0;
        for (int i = 0; i < nums.length; i++) {
            list.add(new int[]{i, nums[i]});
            sum += nums[i];
        }
        Collections.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (int[] array : list){
            System.out.print("{" + array[0] + ":" + array[1] + "} ");
        }
        System.out.println();
        long[] result = new long[queries.length];
        int index = 0;
        for (int i = 0; i < queries.length; i++) {
            if(!set.contains(queries[i][0])){
                sum -= nums[queries[i][0]];
                set.add(queries[i][0]);
            }
            int temp = 0;
            while (temp < queries[i][1]){
                if(index >= list.size()){
                    sum = 0;
                    break;
                } else {
                    int[] array = list.get(index);
                    if(!set.contains(array[0])){
                        sum -= array[1];
                        set.add(array[0]);
                        temp++;
                    }
                    index++;
                }
            }
            result[i] = sum;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 2, 3, 1};
        int[][] queries = {{1, 2}, {3, 3}, {4, 2}};
        System.out.println(Arrays.toString(new UnmarkedSumArray_20250518().unmarkedSumArray(nums, queries)));
    }
}
