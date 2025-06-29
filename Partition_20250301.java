package com.company.javaRelearn;

import java.util.*;

public class Partition_20250301 {
    private List<List<String>> result = new ArrayList<List<String>>();

    public List<List<String>> partition(String s) {
        dfs(s, 0, new ArrayList<String>());
        return result;
    }

    private void dfs(String s, int start, List<String> list){
        List<String> list1 = new ArrayList<String>(list);
        if(start == s.length()){
            if(judge(list1)){
                result.add(list1);
            }
        } else {
            for (int i = start; i < s.length(); i++) {
                list1.add(s.substring(start, i + 1));
                dfs(s, i + 1, list1);
                list1.remove(list1.size() - 1);
            }
        }
    }

    private boolean judge(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            String subString = list.get(i);
            int left = 0;
            int right = subString.length() - 1;
            while (left < right){
                if(subString.charAt(left) != subString.charAt(right)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}
