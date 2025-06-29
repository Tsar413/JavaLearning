package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SmallestRange_20241124 {
    public int[] smallestRange(List<List<Integer>> nums) {
        int length = 0;
        for (List<Integer> num : nums) {
            length += num.size();
        }
        int[][] data = new int[length][2];
        int index = 0;
        for (int i = 0; i < nums.size(); i++) {
            for (int j = 0; j < nums.get(i).size(); j++) {
                data[index][0] = nums.get(i).get(j);
                data[index][1] = i;
                index++;
            }
        }
        Arrays.sort(data, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        System.out.println(Arrays.deepToString(data));
        int[] judge = new int[nums.size()];
        int index1 = 0;
        int index2 = 0;
        int[] result = new int[2];
        boolean flag2 = true;
        while (index1 <= data.length){
            boolean flag = true;
            for (int i = 0; i < judge.length; i++) {
                if(judge[i] < 1){
                    flag = false;
                    break;
                }
            }
            if(!flag){
                if(index1 == data.length){
                    break;
                }
                judge[data[index1][1]]++;
                index1++;
            } else {
                if(flag2){
                    result[0] = data[index2][0];
                    result[1] = data[index1 - 1][0];
                    judge[data[index2][1]]--;
                    index2++;
                    flag2 = false;
                } else {
                    if(result[1] - result[0] > data[index1 - 1][0] - data[index2][0]){
                        result[0] = data[index2][0];
                        result[1] = data[index1 - 1][0];
                    }
                    judge[data[index2][1]]--;
                    index2++;
                }
            }
        }
        if(flag2){
            result[0] = data[index2][0];
            result[1] = data[index1 - 1][0];
        }
        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> nums = Arrays.asList(Arrays.asList(4, 10, 15, 24, 26), Arrays.asList(0, 9, 12, 20), Arrays.asList(5, 18, 22, 30));
        List<List<Integer>> nums1 = Arrays.asList(Arrays.asList(1,3,5,7,9,10), Arrays.asList(2,4,6,8,10));
        System.out.println(Arrays.toString(new SmallestRange_20241124().smallestRange(nums1)));
    }
}
