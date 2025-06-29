package com.company.javaRelearn.NIIT3.Week5;

import java.util.Scanner;

public class DoubleToIntConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一个小数：");
        double num = scanner.nextDouble(); // 读取小数
        int convertedNum = (int) num; // 强制转换为整数

        System.out.println("转换前：" + num);
        System.out.println("转换后：" + convertedNum); // 观察转换后的小数部分是否被舍去

        scanner.close();
    }
}

