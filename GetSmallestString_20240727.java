package com.company.javaRelearn;

public class GetSmallestString_20240727 {
    public String getSmallestString(String s, int k) {
        String result = "";
        boolean flag = false;
        for (int i = 0; i < s.length(); i++) {
            if(!flag){
                char word1 = s.charAt(i);
                char word2 = 'a';
                int diff = Math.min((int) word1 - (int) word2, (int) word2 - (int) word1 + 26);
                if(diff <= k){
                    k -= diff;
                    result += "a";
                } else {
                    flag = true;
                    result += (char) ((int) word1 - k);
                }
            } else {
                result += s.substring(i);
                break;
            }
        }
        return result;
    }
}
