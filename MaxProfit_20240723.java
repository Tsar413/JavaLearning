package com.company.javaRelearn;

import java.util.Arrays;
import java.util.Comparator;

public class MaxProfit_20240723 {
    public int maxProfit(int[] inventory, int orders) {
        Integer[] temp = new Integer[inventory.length];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = inventory[i];
        }
        Arrays.sort(temp, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < temp.length; i++) {
            inventory[i] = temp[i];
            System.out.println(inventory[i]);
        }
        int index = 1;
        int count = 0;



        return 0;
    }

    public static void main(String[] args) {
        int[] inventory = new int[]{5, 1, 4, 2, 8};
        System.out.println(new MaxProfit_20240723().maxProfit(inventory, 2));
    }
}
