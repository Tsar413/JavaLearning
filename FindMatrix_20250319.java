package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class FindMatrix_20250319 {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int n : nums){
            if(result.isEmpty()){
                List<Integer> list1 = new ArrayList<Integer>();
                list1.add(n);
                result.add(list1);
            } else {
                boolean flag = false;
                for (List<Integer> list2 : result){
                    if(!list2.contains(n)){
                        list2.add(n);
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    List<Integer> list3 = new ArrayList<Integer>();
                    list3.add(n);
                    result.add(list3);
                }
            }
        }
        return result;
    }
}
