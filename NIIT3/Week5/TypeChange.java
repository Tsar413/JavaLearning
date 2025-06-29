package com.company.javaRelearn.NIIT3.Week5;

import java.util.Scanner;

class Father{
    public void output(){
        System.out.println("这是父类");
    }
}

class Son extends Father {
    @Override
    public void output() {
        System.out.println("这是子类");
    }
}

public class TypeChange {
    public static void main(String[] args) {
        Father father1 = new Father();
        Father father2 = new Son();
        Son son1 = new Son();
//        Son son2 = (Son) new Father();
        Son son3 = (Son) father2;
        father1.output();
        father2.output();
        son1.output();
        son3.output();


        int a = 1;
        long l = a;
        float f = l;
        double d = f;

        long l1 = 1L;
        int a1 = (int) l1;

        float f1 = (float) 2.0d;

        int a2 = 2;
        float f2 = a2 + (float) 10.0;

        System.out.println(charToInt('3'));

        int a3 = 1;
        a3 = (int) (a3 + 1L);

        System.out.println(getUserId());
    }

    public double getDoubleDivide(int a, int b){
        if(b == 0){
            return 0;
        }
        return a * 1.0 / b;
    }

    public static int charToInt(char c){
        return c - '0';
    }

    public static int getUserId(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            String numString = scanner.next();
            if(numString.length() == 4){
                try {
                    return Integer.parseInt(numString);
                } catch (Exception e){
                    System.out.println("不能转换");
                }
            } else {
                System.out.println("长度必须为4");
            }
        }
    }
}
