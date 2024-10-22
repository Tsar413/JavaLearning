package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class Combine_20241021 {
    private List<List<Integer>> result = new ArrayList<List<Integer>>();

    public List<List<Integer>> combine(int n, int k) {
        recursiveCore(null, 1, n, k);
        return result;
    }

    public void recursiveCore(List<Integer> list, int start, int n, int k){
        for (int i = start; i <= n; i++) {
            if(start == 1){
                list = new ArrayList<Integer>();
            }
            if(k == 1){
                list.add(i);
                result.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            } else {
                list.add(i);
                recursiveCore(list, i + 1, n, k - 1);
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Combine_20241021().combine(4,2));
    }
}
