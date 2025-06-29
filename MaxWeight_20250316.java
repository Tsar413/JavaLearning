package com.company.javaRelearn;

import java.util.Arrays;

public class MaxWeight_20250316 {
    public long maxWeight(int[] pizzas) {
        int index = pizzas.length - 1;
        Arrays.sort(pizzas);
        long result = 0;
        int n = pizzas.length / 4;
        int odd = 0;
        int even = 0;
        if(n % 2 == 1){
            odd = n / 2 + 1;
            even = n / 2;
        } else {
            odd = n / 2;
            even = n / 2;
        }
        for (int i = 0; i < odd; i++) {
            result += pizzas[index];
            index--;
        }
        for (int i = 0; i < even; i++) {
            result += pizzas[index - 1];
            index -= 2;
        }
        return result;
    }
}
