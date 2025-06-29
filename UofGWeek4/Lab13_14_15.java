package com.company.javaRelearn.UofGWeek4;

import java.util.Arrays;
import java.util.Random;

public class Lab13_14_15 {
    public static Integer findFirstReference(int[] arraysToTest, int n) {
        int result = -1;
        for (int i = 0; i < arraysToTest.length; i++) {
            if (arraysToTest[i] == n) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static Integer findFinalReference(int[] arraysToTest, int n) {
        int result = -1;
        for (int i = arraysToTest.length - 1; i >= 0; i--) {
            if (arraysToTest[i] == n) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static Integer[] findAllReference(int[] arraysToTest, int n) {
        Integer[] results = new Integer[arraysToTest.length];
        Arrays.fill(results, -1);

        for (int i = arraysToTest.length - 1; i >= 0; i--) {
            if (arraysToTest[i] == n) {
                results[i] = i;
            }
        }
        return results;
    }

    public static void main(String[] args) {
        int labResult3;
        int labResult4;
        Integer[] labResult5;
        int[] arraysInt = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            arraysInt[i] = rand.nextInt(10);
        }
        for (int i : arraysInt)
            System.out.print(i + ", ");
        System.out.println();
        labResult3 = findFirstReference(arraysInt, 5);
        labResult4 = findFinalReference(arraysInt, 5);
        System.out.println("LabResult3: " + labResult3);
        System.out.println("LabResult4: " + labResult4);
        labResult5 = findAllReference(arraysInt,5);
        System.out.println("LabResult5: ");
        for(int i : labResult5) {
            System.out.print(i + ", ");
        }
    }
}
