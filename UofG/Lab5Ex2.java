package com.company.javaRelearn.UofG;

import java.util.Scanner;

public class Lab5Ex2 {
    public static Double compCircumference(double r) {
        return 2 * Math.PI * r;
    }

    public static Double compArea(double r) {
        return Math.PI * r * r;
    }

    public static void summariseCircle(double r) {
        System.out.println("Circle's circumference is " + compCircumference(r) +
                ", Circle's area is " + compArea(r));
    }

    public static Double[] summariseCircle1(double r) {
        Double[] doubles = new Double[2];
        doubles[0] = compCircumference(r);
        doubles[1] = compArea(r);
        return doubles;
    }

    public static void main(String[] args) {
        System.out.println("Input the radius.");
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double area = compArea(r);
        System.out.println(area);
        summariseCircle(r); //直接调用，无返回要求
        for (Double circleSituation : summariseCircle1(r)) //返回
            System.out.println(circleSituation);
        System.out.println("Input the radius.");
        r = scanner.nextDouble();
        area = compArea(r);
        System.out.println(area);
        summariseCircle(r);
        for (Double circleSituation : summariseCircle1(r))
            System.out.println(circleSituation);

    }
}
