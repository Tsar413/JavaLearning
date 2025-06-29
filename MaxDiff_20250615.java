package com.company.javaRelearn;

public class MaxDiff_20250615 {
    public int maxDiff(int num) {

        return getMaxNumber(String.valueOf(num)) - getMinNumber(String.valueOf(num));
    }

    private int getMaxNumber(String num){
        boolean flag = true;
        char change = '0';
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num.length(); i++) {
            if(flag){
                if(num.charAt(i) != '9'){
                    change = num.charAt(i);
                    flag = false;
                }
                stringBuilder.append(9);
            } else {
                if(num.charAt(i) == change){
                    stringBuilder.append(9);
                } else {
                    stringBuilder.append(num.charAt(i));
                }
            }
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    private int getMinNumber(String num){
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = true;
        char change = '0';
        int changed = 0;
        for (int i = 0; i < num.length(); i++) {
            if(i == 0){
                if(num.charAt(0) != '1'){
                    change = num.charAt(i);
                    changed = 1;
                    flag = false;
                }
                stringBuilder.append('1');
            } else {
                if(!flag){
                    if(num.charAt(i) == change){
                        stringBuilder.append(changed);
                    } else {
                        stringBuilder.append(num.charAt(i));
                    }
                } else {
                    if(num.charAt(i) != '0'){
                        change = num.charAt(i);
                        changed = 0;
                        flag = false;
                    }
                    stringBuilder.append(0);
                }
            }
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
