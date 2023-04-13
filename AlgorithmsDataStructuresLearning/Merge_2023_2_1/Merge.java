package com.company.javaRelearn.AlgorithmsDataStructuresLearning.Merge_2023_2_1;

import java.util.Arrays;

public class Merge {
    public static int[] divide(int[] array) {
        int[] result = new int[array.length];
        int[] temp1 = new int[array.length / 2];
        int[] temp2 = new int[array.length - (array.length) / 2];

        System.arraycopy(array, 0, temp1, 0, array.length / 2);
        System.arraycopy(array, array.length - (array.length) / 2, temp2,
                0, array.length - (array.length) / 2 );

        if (temp1.length > 1 && temp2.length > 1) {
            temp1 = divide(temp1);
            temp2 = divide(temp2);
        }
        result = sort(temp1, temp2);
        return result;
    }

    public static int[] sort(int[] a, int[] b) {
        int[] result = new int[(a.length + b.length)];
        int i = 0;
        int j = 0;
        int temp = 0;
        while (temp < (a.length + b.length)) {
            if (i < a.length && j < b.length) {
                if (a[i] <= b[j]) {
                    result[temp] = a[i];
                    i++;
                } else {
                    result[temp] = b[j];
                    j++;
                }
            } else {
                if (i == a.length) {
                    result[temp] = b[j];
                    j++;
                } else {
                    result[temp] = a[i];
                    i++;
                }
            }
            temp++;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {8,4,5,7,1,3,6,2};

        System.out.println(Arrays.toString(divide(a)));
    }
}
