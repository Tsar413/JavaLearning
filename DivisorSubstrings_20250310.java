package com.company.javaRelearn;

public class DivisorSubstrings_20250310 {
    public int divisorSubstrings(int num, int k) {
        int index1 = 0;
        int index2 = 0;
        int result = 0;
        String data = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder();
        while (index1 < data.length()){
            if(index1 - index2 + 1 < k){
                stringBuilder.append(data.charAt(index1));
                index1++;
            } else {
                stringBuilder.append(data.charAt(index1));
                int num1 = Integer.parseInt(stringBuilder.toString());
                if(num1 != 0 && num % num1 == 0){
                    result++;
                }
                index1++;
                stringBuilder.deleteCharAt(0);
                index2++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new DivisorSubstrings_20250310().divisorSubstrings(30003, 3));
    }
}
