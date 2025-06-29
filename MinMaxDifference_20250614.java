package com.company.javaRelearn;

public class MinMaxDifference_20250614 {
    public int minMaxDifference(int num) {
        String data = String.valueOf(num);
        StringBuilder stringBuilder1 = new StringBuilder();
        boolean flag = true;
        char change = '0';
        for (char c : data.toCharArray()) {
            if(flag){
                if(c != '9'){
                    change = c;
                    flag = false;
                }
                stringBuilder1.append(9);
            } else {
                if(c == change){
                    stringBuilder1.append(9);
                } else {
                    stringBuilder1.append(c);
                }
            }
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < data.length(); i++) {
            if(i == 0){
                change = data.charAt(i);
                stringBuilder2.append(0);
            } else {
                if(data.charAt(i) == change){
                    stringBuilder2.append(0);
                } else {
                    stringBuilder2.append(data.charAt(i));
                }
            }
        }
        return Integer.parseInt(stringBuilder1.toString()) - Integer.parseInt(stringBuilder2.toString());
    }
}
