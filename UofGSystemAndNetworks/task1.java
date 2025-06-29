package com.company.javaRelearn.UofGSystemAndNetworks;

public class task1 {
    public static void main(String[] args) {
        int[] x;
        int possum = 0;
        int negcount = 0;
        int oddcount = 0;
        int oddcount1 = 0;
        boolean overflow = false;

        x = new int[]{3, -6, 27, 101, 50, 0, -20, -21, 19, 6, 4, -10};

        for (int n : x) {
            if (n > 0) {
                possum += n;
                if (possum < 0) {
                    overflow = true;
                }
            }
            if (n < 0) {
                negcount++;
            }
            if (n % 2 != 0) {
                oddcount++;
            }
            if ((n & 1) != 0) {
                oddcount1++;
            }
        }

        //Java int 2147483646
        System.out.println(possum + " " + negcount + " " + oddcount + " " + overflow + " " + oddcount1);
    }
}
