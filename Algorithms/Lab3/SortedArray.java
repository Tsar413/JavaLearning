package com.company.javaRelearn.Algorithms.Lab3;

public class SortedArray {
    public static void sortedArray1(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        int[] i = {1,5,3,2,4};
        sortedArray1(i);
    }
}
