package com.company.javaRelearn.NIIT3.WeekClass2;

import java.math.BigDecimal;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        double a = 1.2;
        double b = 1.23;
        System.out.println(a + b);

        Integer i = null;

        Integer i1 = Integer.valueOf("123"); //String转Integer
        int i2 = Integer.parseInt("123"); //String转int
        String binaryString = Integer.toBinaryString(12); // 整数转二进制
        System.out.println(binaryString);

        final double PI = 3.14;

        char c1 = 'a';
        String s1 = "abc";

        int a1 = 0xEE; //十六进制0x
        int a2 = 07; //八进制0

        CalScore calScore = new CalScore();
//        calScore.writeScore();
        int score = calScore.getScore(3);
//        System.out.println(calScore.getNewId(6));

        CalScore calScore1 = new CalScore(3);
        System.out.println(calScore1.getScore(1));

        int a3 = 1;
        int b3 = a3++;
        System.out.println(a3 + " " + b3);

//        Scanner scanner = new Scanner(System.in);
//        String s2 = scanner.next();
//        System.out.println(s2);
//        Scanner scanner1 = new Scanner(System.in);
//        String s3 = scanner1.nextLine();
//        System.out.println(s3);

        int number = 10;
        if(number > 0 && number % 2 == 0){
            System.out.println("正偶数");
        } else if(number > 0 && number % 2 != 0) {
            System.out.println("正奇数");
        } else if(number <= 0 && number % 2 == 0){
            System.out.println("非正偶数");
        } else if(number <= 0 && number % 2 != 0) {
            System.out.println("负奇数");
        }

        //请完成一段选择语句 判断学生的分数 90分以上为A+或A-，其中95以上为A+,90以上为A-（if嵌套），80以上为B，70以下为C
        //要求用户输入成绩
//        int score1 = 0;
//        Scanner scanner2 = new Scanner(System.in);
//        score1 = scanner2.nextInt();
//        if(score1 >= 90){
//            if(score1 >= 95){
//                System.out.println("A+");
//            } else {
//                System.out.println("A-");
//            }
//        } else if (score1 >= 80) {
//            System.out.println("B");
//        } else {
//            System.out.println("C");
//        }

        // 控制台输入数字 判断数字是否是1或2，如果是1或2则输出在范围内，否则输出不在范围内 switch-case完成
        int temp = 3;
        switch (temp){
            case 1:
                System.out.println("在范围内"); break;
            case 2:
                System.out.println("在范围内"); break;
            default:
                System.out.println("不在范围内");
        }


    }
}

class WhileLoop{
    public void whileLoop(){
        int flag = 0;
        while (flag < 5){
            System.out.println("Hello World");
            flag++;
        }
    }

    // 使用while循环，打印1-20的奇数
    public void getOdd(){
        int flag = 1;
        while (flag <= 20){
            if(flag % 2 == 1){
                System.out.println(flag);
            }
            flag++;
        }
    }

    public void judge(){
        int n = 0;
        while (++n < 5){}
        System.out.println(n);
    }


//    public void getOddError(){ //错误方法
//        int flag = 1;
//        while (flag <= 20 && flag % 2 == 1){
//            System.out.println(flag);
//            flag++;
//        }
//    }



    public static void main(String[] args) {
        new WhileLoop().judge();
    }
}

class CalScore{
    private int score;

    public CalScore() {
    }

    public CalScore(int score) {
        this.score = score;
    }

    public void writeScore(){
        Scanner scanner = new Scanner(System.in);
        score = scanner.nextInt();
    }

    public int getScore(int score1){
        System.out.println(score1);
        return score + score1;
    }

    // 编写一个方法名为getNewId, 对输入的Id进行处理，如果Id为空则返回1，否则返回Id+1
    public Integer getNewId(Integer id){
        if(id == null){
            return 1;
        } else {
            return id + 1;
        }
    }
}








