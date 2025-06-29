package com.company.javaRelearn.NIIT3.Week4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CalBirthday {
    public String calBirthday(){
        LocalDate localDateTime = LocalDate.now().plusDays(1).minusYears(30);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        return localDateTime.format(formatter);
    }

    public static void main(String[] args) {
        CalBirthday calBirthday = new CalBirthday();
        System.out.println(calBirthday.calBirthday());
    }
}
