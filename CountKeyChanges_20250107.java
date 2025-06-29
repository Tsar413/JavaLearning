package com.company.javaRelearn;

public class CountKeyChanges_20250107 {
    public int countKeyChanges(String s) {
        int result = 0;
        for (int i = 1; i < s.length(); i++) {
            int t = s.charAt(i) - s.charAt(i - 1);
            if(Math.abs(t) != 32 && Math.abs(t) != 0){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new CountKeyChanges_20250107().countKeyChanges("aAbBcC"));
    }
}
