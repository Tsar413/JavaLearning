package com.company.javaRelearn;

public class MinChanges_20241102 {
    public int minChanges(int n, int k) {
        String nString = Integer.toBinaryString(n);
        String kString = Integer.toBinaryString(k);
        if(kString.length() > nString.length()){
            return -1;
        }
        String tKString = "";
        for (int i = 0; i < nString.length() - kString.length(); i++) {
            tKString += "0";
        }
        tKString += kString;
        int result = 0;
        for (int i = 0; i < nString.length(); i++) {
            if(nString.charAt(i) == '1' && tKString.charAt(i) == '0'){
                result++;
            } else if(nString.charAt(i) == '0' && tKString.charAt(i) == '1'){
                return -1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MinChanges_20241102().minChanges(13,4));
    }
}
