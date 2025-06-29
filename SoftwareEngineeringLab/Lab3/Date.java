package com.company.javaRelearn.SoftwareEngineeringLab.Lab3;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
    private int day, month, year;

    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    public Date(int d_day, int d_month, int d_year) {
        day = d_day;
        month = d_month;
        year = d_year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }


    public	void print(PrintStream ps, Date d_date)	{
        ps.print(String.format("first date: %02d/%02d/%4d", day, month, year));
        ps.print(String.format("   second date: %02d/%02d/%4d", d_date.day, d_date.month, d_date.year));
        ps.print(String.format("   difference in years: %d", this.diffInYears(d_date)));
    }


	/* optionally you can write a simple code like this,
	   which is OK for me, since I am more interested in seeing
	   if you apply the coding practices covered in lectures

	public int diffInYears(Date date) {
		return(date.year - this.year);
	}
	 */

    public int diffInYears1(com.company.javaRelearn.SoftwareEngineeringLab.Lab1.Date date) throws ParseException {
        String s1 = this.getDay() + "-" + this.getMonth() + "-" + this.getYear();
        String s2 = date.getDay() + "-" + date.getMonth() + "-" + date.getYear();
        java.util.Date date1 = format.parse(s1);
        java.util.Date date2 = format.parse(s2);
        System.out.println(date1.getTime());
        System.out.println(date2.getTime());
        long difms = Math.abs(date1.getTime() - date2.getTime());
        long result = difms/1000/3600/24/365;
        return (int)result;
    }


    public int diffInYears(Date date) {
        Date date1 = this;
        Date date2 = date;

        if (date.getYear() - this.getYear() < 0) {
            date1 = date;
            date2 = this;
        }

        int date_month = date2.getMonth();
        int date_year = date2.getYear();

        // If difference between "day" values of two dates is negative
        // reduce "date_month" by 1
        if(date2.getDay() - date1.getDay() < 0)
            date_month--;


        // If difference between "month" values of two dates is negative
        // reduce "date_year"by 1
        if(date_month - date1.getMonth() < 0)
            date_year--;


        return (date_year - date1.getYear());
    }
}
