package com.company.javaRelearn;

public class MinEnd_20240822 {
    public long minEnd(int n, int x) {
        n--;
        String data = Integer.toBinaryString(x);
        String change = Integer.toBinaryString(n);
        String[] array = data.split("");
        int index = change.length() - 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if(array[i].equals("0")){
                array[i] = String.valueOf(change.charAt(index));
                index--;
            }
            if(index < 0){
                break;
            }
        }
        String result = "";
        if(index >= 0){
            result += change.substring(0, index + 1);
        }
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return Long.parseLong(result, 2);
    }

    public static void main(String[] args) {
        System.out.println(new MinEnd_20240822().minEnd(2, 2));
    }
}
