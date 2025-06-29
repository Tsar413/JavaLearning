package com.company.javaRelearn.UofG;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lab6Ex5 {
    public static void reverseDivision(double a, double b) {
        for (int i = 0; i <= a; i++) {
            if((b * (i + 1)) > a ) {
                BigDecimal p1 = new BigDecimal(Double.toString(a));
                BigDecimal p2 = new BigDecimal(Double.toString(b * i));
                System.out.println("Times is " + i + " remainder is " + p1.subtract(p2).setScale(1, RoundingMode.HALF_UP));
                break;
            }
        }
    }

    public static void main(String[] args) {
        reverseDivision(6.2,1.6);
    }
}
