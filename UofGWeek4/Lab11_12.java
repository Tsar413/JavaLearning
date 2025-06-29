package com.company.javaRelearn.UofGWeek4;

import java.util.Random;

public class Lab11_12 {
    public static double calRandomArrays(double[] calculateArrays) {
        double avg = 0;
        double sum = 0;
        for (double d : calculateArrays)
        {
            sum += d;
        }
        avg = sum/(calculateArrays.length);
        return avg;
    }

    public static void main(String[] args) {
        double avg;
        double[] randomArrays = new double[100];
        Random rand = new Random();
        for (int i = 0; i < randomArrays.length; i++) {
            randomArrays[i] = rand.nextDouble();
        }
        avg = calRandomArrays(randomArrays);
        System.out.println(avg);
    }
}
