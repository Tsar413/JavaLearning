package com.company.javaRelearn;

public class ConvertDateToBinary_20250101 {
    public String convertDateToBinary(String date) {
        String result = "";
        result += Integer.toBinaryString(Integer.parseInt(date.substring(0,4)));
        result += "-";
        result += Integer.toBinaryString(Integer.parseInt(date.substring(5,7)));
        result += "-";
        result += Integer.toBinaryString(Integer.parseInt(date.substring(8)));
        return result;
    }
}
