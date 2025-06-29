package com.company.javaRelearn.NIIT3.Week2;

import java.util.Arrays;

public class Chapter2 {
    public double ex1(double v, double a, double t){
        return v * t + (a * t * t) / 2;
    }

    public double ex2(double r, double h) {
        double pie = 22.0 / 7;
        return pie * r * r * h;
    }

    public double ex3(double c){
        return  c * 9 / 5 + 32;
    }

    public int[] ex4(){
        int[] result = new int[5];
        result[0] = 5 & 9;
//        System.out.println("0" + Integer.toBinaryString(5));
//        System.out.println(Integer.toBinaryString(9));
        result[1] = 5 | 9;
        result[2] = ~5;
        result[3] = ~9;
        result[4] = 5 ^ 9;
        return result;
    }

    public int ex5(){
        return 4 * (4 + 8) / 4;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Chapter2().ex4()));
    }
}
