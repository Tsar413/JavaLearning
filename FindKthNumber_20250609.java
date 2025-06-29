package com.company.javaRelearn;

public class FindKthNumber_20250609 {
    public int findKthNumber(int n, int k) {
        String s = String.valueOf(n);
        int length = s.length();
        if(length == 1){
            return k;
        }
        int oneSum = 0;
        for (int i = 0; i < length; i++) {
            oneSum += (int) Math.pow(10, i);
        }
        int m = n % ((int) Math.pow(10, length - 1));
        int secondSum = 0;
        for (int i = 0; i < length - 1; i++) {
            secondSum += (int) Math.pow(10, i);
        }
        secondSum += m;

        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        int num = 1;
        while (count != k){
            if(count + oneSum < k){
                count += oneSum;
                num++;
            } else if(count + oneSum > k) {
                if(count + secondSum > k ){
                    stringBuilder.append(num);
                } else {
                    stringBuilder.append(num - 1);
                }

                num = 0;
                oneSum -= (int) Math.pow(10, length - 1);
                length--;
            } else {
                stringBuilder.append(num);
                break;
            }
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static void main(String[] args) {
        System.out.println(new FindKthNumber_20250609().findKthNumber(13, 2));
    }
}
