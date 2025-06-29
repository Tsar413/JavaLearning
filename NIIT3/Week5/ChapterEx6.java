package com.company.javaRelearn.NIIT3.Week5;

import java.util.Scanner;

public class ChapterEx6 {
    public double divide(int a, int b){
        if(b == 0) throw new RuntimeException("除数不能为0");
        return a * 1.0 / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入姓名");
        String name = scanner.nextLine();
        System.out.println("输入联系信息");
        String telephone = scanner.nextLine();
        System.out.println("输入年龄");
        int i = scanner.nextInt();
        if(i < 20 || i > 55) throw new RuntimeException("不在范围内");
    }
}
