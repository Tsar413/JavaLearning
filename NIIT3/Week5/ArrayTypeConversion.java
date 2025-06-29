package com.company.javaRelearn.NIIT3.Week5;

public class ArrayTypeConversion {
    public static void main(String[] args) {
        double[] doubleArray = {3.5, 2.7, 8.9, 1.2}; // 原始double数组
        int[] intArray = new int[doubleArray.length]; // 定义一个int数组

        // 遍历double数组，并将元素转换为int存入新数组
        for (int i = 0; i < doubleArray.length; i++) {
            intArray[i] = (int) doubleArray[i]; // 强制转换
        }

        // 输出转换后的数组
        System.out.print("转换后：");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
    }
}

