package com.company.javaRelearn;

import java.util.*;

public class FindRepeatedDnaSequences_20241204 {
    public List<String> findRepeatedDnaSequences(String s) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        Set<String> set = new HashSet<String>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String temp = s.substring(i, i + 10);
            if(map.containsKey(temp.hashCode())){
                set.add(temp);
            } else {
                map.put(temp.hashCode(), temp);
            }
        }
        return new ArrayList<String>(set);
    }

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if(i != j && nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int getDiff1(int[] cards){
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : cards){
            if(map.containsKey(n)){
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        List<Integer> list = new ArrayList<Integer>(map.keySet());
        for (int n : list){
            if(map.get(n) == 1){
                return n;
            }
        }
        return -1;
    }

    public int getDiff2(int[] cards){
        List<Integer> list = new LinkedList<Integer>();
        for (int n : cards){
            if(list.isEmpty()){
                list.add(n);
            } else {
                if(list.contains(n)){
                    list.remove(list.indexOf(n));
                } else {
                    list.add(n);
                }
            }

        }
        return list.get(0);
    }

    public int getDiff3(int[] cards){
        System.out.println(Arrays.stream(cards).max().getAsInt());
        System.out.println(Arrays.stream(cards).sum());
        return Arrays.stream(cards).reduce(0, (a, b) -> a ^ b);
    }

    public static void main(String[] args) {
        String s = "AAAAAAAAAAA";
        System.out.println(new FindRepeatedDnaSequences_20241204().findRepeatedDnaSequences(s));
        Scanner scanner = new Scanner(System.in);
        String strings = scanner.nextLine();
        System.out.println(strings);
        int[] cards = {1, 1, 2, 2, 3, 3, 4, 5, 5};
        System.out.println(new FindRepeatedDnaSequences_20241204().getDiff3(cards));
    }
}
