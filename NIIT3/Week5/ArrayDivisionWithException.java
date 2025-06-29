package com.company.javaRelearn.NIIT3.Week5;

public class ArrayDivisionWithException {
    public static void main(String[] args) {
        int[] numerators = {10, 20, 30, 40, 50}; // 分子数组
        int[] denominators = {2, 0, 5, 0, 10};  // 分母数组

        for (int i = 0; i < numerators.length; i++) {
            try {
                int result = numerators[i] / denominators[i]; // 可能抛出 ArithmeticException
                System.out.println(numerators[i] + " / " + denominators[i] + " = " + result);
            } catch (ArithmeticException e) {
                System.out.println("第 " + (i + 1) + " 个除数不能为 0！");
            }
        }
    }
}

