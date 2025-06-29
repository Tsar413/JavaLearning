package com.company.javaRelearn;

public class MinimumPartition_20250221 {
    public int minimumPartition(String s, int k) {
        int index2 = 0;
        int result = 0;
        String subString = "";
        int temp = 0;
        for (int i = 1; i < s.length(); i++) {
            subString = s.substring(index2, i);
            temp = Integer.parseInt(subString);
            if(temp > k){
                subString = s.substring(index2, i - 1);
                if(subString.isEmpty()){
                    return -1;
                }
                temp = Integer.parseInt(subString);
                if(temp > k && subString.length() == 1){
                    return -1;
                } else {
                    index2 = i - 1;
                    result++;
                }
            }
        }
        subString = s.substring(index2);
        temp = Integer.parseInt(subString);
        if(temp <= k){
            result++;
        } else {
            if(subString.length() == 1){
                return -1;
            } else {
                for (int i = 0; i < subString.length(); i++) {
                    if ((int) subString.charAt(i) - '0' > k) {
                        return -1;
                    }
                }
                result += subString.length();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new MinimumPartition_20250221().minimumPartition("456192", 6));
    }
}
