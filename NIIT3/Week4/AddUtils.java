package com.company.javaRelearn.NIIT3.Week4;

public class AddUtils {
    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }

    public int add(int... args){
        int result = 0;
        for (int i : args){
            result += i;
        }
        return result;
    }

}
