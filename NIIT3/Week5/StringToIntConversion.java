package com.company.javaRelearn.NIIT3.Week5;

import java.util.Scanner;

public class StringToIntConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("请输入一个整数：");
            String input = scanner.nextLine(); // 读取用户输入的字符串

            try {
                number = Integer.parseInt(input); // 尝试转换为整数
                validInput = true; // 如果成功，则退出循环
            } catch (NumberFormatException e) {
                System.out.println("输入错误，请输入整数！");
            }
        }

        System.out.println(number + " 的平方是 " + (number * number));
        scanner.close();
    }
}

