package com.company.javaRelearn.AlgorithmsDataStructuresLearning.Bubble_2023_1_31;

public class Bubble {
    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i -1; j++) {
                if (greater(a[j],a[j+1])) {
                    exch(a, j, j+1);
                }
            }
        }
    }

    public static boolean greater(Comparable v, Comparable w) {
        int i = v.compareTo(w);
        return i > 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] a = {6,5,2,3,1,4};
        sort(a);

        for (Integer i : a) {
            System.out.print(i + " ");
        }
    }
}
