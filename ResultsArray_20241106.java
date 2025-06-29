package com.company.javaRelearn;

import java.util.*;

public class ResultsArray_20241106 {
    public int[] resultsArray(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<Integer>();
        List<Integer> resultList = new ArrayList<Integer>();
        for (int i = 1; i < nums.length; i++) {
            if(!queue.isEmpty() && i - k + 1 > queue.peek()){
                queue.poll();
            }
            if(nums[i] - nums[i - 1] == 1){
                if(i - k + 1 >= 0){
                    if(queue.isEmpty()){
                        resultList.add(nums[i]);
                    } else {
                        resultList.add(-1);
                    }
                }
            } else {
                queue.add(i - 1);
                if(i - k + 1 >= 0){
                    resultList.add(-1);
                }
            }
        }
//        System.out.println(resultList);
        int[] result = new int[resultList.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,30,31,32};
        System.out.println(Arrays.toString(new ResultsArray_20241106().resultsArray(nums, 3)));
    }
}
