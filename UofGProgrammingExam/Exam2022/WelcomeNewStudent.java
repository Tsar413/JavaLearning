package com.company.javaRelearn.UofGProgrammingExam.Exam2022;

public class WelcomeNewStudent {
    public static void main(String[] args) {
        int[] a = new int[]{ 25, 89, 95, 60, 45,78};
        int highestResult = findHighestNumber(a);
        System.out.println(highestResult);
        int lowestResult = findLowestNumber(a);
        System.out.println(lowestResult);
    }

    public static int findHighestNumber(int[] a) {
        int result = a[0];
        for (int j : a) {
            if (j > result) {
                result = j;
            }
        }
        return result;
    }

    public static int findLowestNumber(int[] a) {
        int result = a[0];
        for (int j : a) {
            if (j < result) {
                result = j;
            }
        }
        return result;
    }
}
