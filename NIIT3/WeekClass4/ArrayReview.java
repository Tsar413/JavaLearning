package com.company.javaRelearn.NIIT3.WeekClass4;

public class ArrayReview {
    public void arrayReview(){
        int[][] array = new int[2][5];
        int index = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = index;
                index++;
            }
        }
        for (int[] array1 : array){
            for (int n : array1){
                System.out.print(n + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void arrayReview1(){
        int[] array = {11, 12, 13, 14, 15, 16};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        new ArrayReview().arrayReview1();
    }
}
