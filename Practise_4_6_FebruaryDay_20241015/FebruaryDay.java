package com.company.javaRelearn.Practise_4_6_FebruaryDay_20241015;

public class FebruaryDay {
    public String judgeFebruaryDay(String year){
        int year1 = Integer.parseInt(year);
        if((year1 % 4 == 0 && year1 % 10 != 0) || year1 % 400 == 0){
            return year + "Feb is" + 29;
        }
        return year + "Feb is" + 28;
    }
}
