package com.company.javaRelearn;

import java.util.*;

public class SmallestTrimmedNumbers_20250425 {
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String[] data = new String[nums.length];
            for (int j = 0; j < data.length; j++) {
                data[j] = nums[j].substring(nums[j].length() - queries[i][1]);
            }
            int[] sorted = sortNumbersMap(data);
            result[i] = sorted[queries[i][0] - 1];
        }
        return result;
    }

    private int[] sortNumbersMap(String[] nums){
        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < nums.length; i++) {
            map.put(i, nums[i]);
        }
        List<Map.Entry<Integer, String>> list = new ArrayList<Map.Entry<Integer, String>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                String s1 = o1.getValue();
                String s2 = o2.getValue();
                boolean flag1 = false;
                boolean flag2 = false;
                for (int i = 0; i < s1.length(); i++) {
                    if(s1.charAt(i) != '0'){
                        s1 = s1.substring(i);
                        flag1 = true;
                        break;
                    }
                }
                for (int i = 0; i < s2.length(); i++) {
                    if(s2.charAt(i) != '0'){
                        s2 = s2.substring(i);
                        flag2 = true;
                        break;
                    }
                }
                if(!flag1){
                    s1 = "0";
                }
                if(!flag2){
                    s2 = "0";
                }
                if(s1.length() != s2.length()){
                    return s1.length() - s2.length();
                }
                for (int i = 0; i < s1.length(); i++) {
                    if(s1.charAt(i) != s2.charAt(i)){
                        return s1.charAt(i) - s2.charAt(i);
                    }
                }
                return 0;
            }
        });
        // System.out.println(list);
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }

    // 改Map sort
    private String[] sortNumbers(String[] nums){
        Arrays.sort(nums, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                for (int i = 0; i < o1.length(); i++) {
                    if(o1.charAt(i) != '0'){
                        o1 = o1.substring(i);
                        break;
                    }
                }
                for (int i = 0; i < o2.length(); i++) {
                    if(o2.charAt(i) != '0'){
                        o2 = o2.substring(i);
                        break;
                    }
                }
                if(o1.length() != o2.length()){
                    return o1.length() - o2.length();
                }
                for (int i = 0; i < o1.length(); i++) {
                    if(o1.charAt(i) != o2.charAt(i)){
                        return o1.charAt(i) - o2.charAt(i);
                    }
                }
                return 0;
            }
        });
        return nums;
    }

    public static void main(String[] args) {
        String[] nums = {"102", "473", "251", "814","09","2347","901983","007","012"};
        String[] nums1 = {
                "1885733869149805818178160081429234705422406",
                "7162080372660753559514087070011908843163708","5857413365354550309707767654136858873324500"};
        int[][] queries = {{2,2}};
        System.out.println(Arrays.toString(new SmallestTrimmedNumbers_20250425().smallestTrimmedNumbers(nums1, queries)));
    }
}
