package com.company.javaRelearn.SoftwareEngineeringLab.Lab2;

import java.io.PrintStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Person {
    private String name;
    private Date dob;
    SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");

    public Person() {}

    public Person(String name, Date dob) {
        this.name = name;
        this.dob = dob;
    }

    public String print(PrintStream ps)	{
        ps.print(String.format("%s: born on %02d/%02d/%4d \n", name, dob.getDay(), dob.getMonth(), dob.getYear()));
        return String.valueOf(ps);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() throws ParseException {
        Calendar calendar = Calendar.getInstance();
        Date date1 = new Date(calendar.get(Calendar.DATE),calendar.get(Calendar.MONTH) + 1,calendar.get(Calendar.YEAR));
        return dob.diffInYears(date1);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", dob=" + String.format("%02d-%02d-%4d", dob.getDay(), dob.getMonth(), dob.getYear()) +
                '}';
    }
}
