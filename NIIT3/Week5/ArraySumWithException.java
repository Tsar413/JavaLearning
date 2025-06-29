package com.company.javaRelearn.NIIT3.Week5;

import java.util.Scanner;

public class ArraySumWithException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // 定义一个存储5个整数的数组
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个整数：");
            try {
                numbers[i] = scanner.nextInt(); // 读取用户输入的整数
            } catch (Exception e) {
                System.out.println("输入错误，请输入整数！");
                scanner.next(); // 清除错误输入，防止死循环
                i--; // 让用户重新输入当前索引的值
            }
        }

        // 计算数组总和
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("数组总和为：" + sum);
        scanner.close();
    }
}
