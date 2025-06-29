package com.company.javaRelearn.AlgorithmsDataStructuresLab.Lab2;

public class E {
    public static void main(String[] args) {
        int n = 243;
        int mod = 0;
        String result = "";
        while (n > 0) {
            mod = n % 2;
            result += mod;
            n /= 2;
        }

        System.out.println(result);
    }
}
