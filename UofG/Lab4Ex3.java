package com.company.javaRelearn.UofG;

public class Lab4Ex3 {
    public static Integer changeMonthsToNumbers(String month) {
        int monthAfterChange = 0;
        String[] months = new String[12];
        months[0] = "JAN";
        months[1] = "FEB";
        months[2] = "MAR";
        months[3] = "APR";
        months[4] = "MAY";
        months[5] = "JUN";
        months[6] = "JUL";
        months[7] = "AUG";
        months[8] = "SEP";
        months[9] = "OCT";
        months[10] = "NOV";
        months[11] = "DEC";

        for(int i = 0; i < months.length; i++) {
            if (months[i].equalsIgnoreCase(month)) {
                monthAfterChange = i;
            }
        }

//        System.out.println(monthAfterChange);
        return monthAfterChange;
    }

    public static Integer judgeMonthProperties (int month) {
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                return 0; //31天的情况
            case 4, 6, 9, 11:
                return 1; //30天的情况
            default:
                return 2; //特殊的2月
        }
    }

    public static Integer judgeLeapYear(String month, int year) { //判断2月情况
        if(year % 4 == 0 && year / 100 != 0 || year % 400 == 0) {
            return 29;
        } else {
            return 28;
        }
    }

    public static void main(String[] args) {
        int monthInNumbers;
        int year = 2020;
        String monthForJudge = "jAn";
        monthInNumbers = changeMonthsToNumbers(monthForJudge) + 1; //将字符转为数字，防止意外输入

        if(judgeMonthProperties(monthInNumbers) == 0) {
            System.out.println("There are 31 days in the month.");
        } else if(judgeMonthProperties(monthInNumbers) == 1) {
            System.out.println("There are 30 days in the month.");
        } else {
            int day = 0;
            day = judgeLeapYear(monthForJudge,year);
            System.out.println("There are " + day + " days in the month.");
        }
    }
}
