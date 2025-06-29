package com.company.javaRelearn.UofGProgrammingExam.Exam2021;

public class Conversion {
    public static double convertTimeToSeconds(String time) {
        double result = 0;
        String[] temps = time.split(":");
        result = Double.parseDouble(temps[0]) * 60 + Double.parseDouble(temps[1]);
        return result;
    }
    public static String convertSecondsToTime(double time) {
        String result = "";
        result = "0" + (time / 60) + ":" + (time % 60);
        return result;
    }
}
