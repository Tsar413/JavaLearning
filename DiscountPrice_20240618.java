package com.company.javaRelearn;

public class DiscountPrice_20240618 {
    public String discountPrices(String sentence, int discount) {
        String[] data = sentence.split(" ");
        for(int i = 0; i < data.length; i++){
            int num = judge(data[i]);
            if(num != -1){
                double price = num * (1 - (double) discount / 100);
                String change = "$" + price;
                data[i] = change;
            }
        }
        String result = "";
        for(int i = 0; i < data.length - 1; i++){
            result += data[i];
            result += " ";
        }
        result += data[data.length - 1];
        return result;
    }

    public int judge(String word){
        if(word.charAt(0) != '$' || word.length() <= 1){
            return -1;
        }
        String num = "";
        for(int i = 1; i < word.length(); i++){
            if(Character.isDigit(word.charAt(i))){
                num += word.charAt(i);
            } else {
                return -1;
            }
        }
        return Integer.parseInt(num);
    }
}
