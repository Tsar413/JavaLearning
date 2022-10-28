package com.company.javaRelearn;

public class CalMaxArray_2022_9_22 {
    public static int[] calMaxArray(int[] array) {
        int[] maxIndex = new int[array.length];
        int max = array[0];
        int maxIndexNumber = 0;
        for(int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                maxIndex[maxIndexNumber] = i;
            }
        }
        for(int temp : maxIndex) {
            System.out.println(temp);
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arrayForTest = new int[] {2,5,3,4,1};
        calMaxArray(arrayForTest);
    }
}
