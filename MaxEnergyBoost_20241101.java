package com.company.javaRelearn;

import java.util.Arrays;

public class MaxEnergyBoost_20241101 {
    public long maxEnergyBoost(int[] energyDrinkA, int[] energyDrinkB) {
        long result = 0;
        int index = 0;
        boolean flag = true;
        while (index < energyDrinkA.length - 1){
            if(index == 0){
                if(energyDrinkA[0] + energyDrinkA[1] > energyDrinkB[0] + energyDrinkB[1]){
                    result += energyDrinkA[0];
                } else {
                    result += energyDrinkB[0];
                    flag = false;
                }
                index++;
            } else {
                if(flag){
                    if(energyDrinkA[index] + energyDrinkA[index + 1] >= energyDrinkB[index + 1]){
                        result += energyDrinkA[index];
                        flag = true;
                        index++;
                    } else {
                        result += energyDrinkB[index + 1];
                        flag = false;
                        index += 2;
                    }
                } else {
                    if(energyDrinkA[index + 1] > energyDrinkB[index] + energyDrinkB[index + 1]){
                        result += energyDrinkA[index + 1];
                        flag = true;
                        index += 2;
                    } else {
                        result += energyDrinkB[index];
                        flag = false;
                        index++;
                    }
                }
            }
        }
        if(index == energyDrinkA.length - 1 && flag){
            result += energyDrinkA[index];
        } else if(index == energyDrinkA.length - 1 && !flag){
            result += energyDrinkB[index];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] energyDrinkA = {1, 3, 1};
        int[] energyDrinkB = {3, 1, 1};
        System.out.println(new MaxEnergyBoost_20241101().maxEnergyBoost(energyDrinkA,energyDrinkB));
    }
}
