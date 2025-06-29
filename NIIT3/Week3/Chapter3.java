package com.company.javaRelearn.NIIT3.Week3;

import java.util.Scanner;

public class Chapter3 {
    public void Ex2(){
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public boolean Ex3(){
        char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        Scanner scanner = new Scanner(System.in);
        char c = scanner.next().charAt(0);
        for (char v : vowels){
            if(v == c){
                return true;
            }
        }
        return false;
    }

    public void Ex4(){
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 1; i <= t; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    count++;
                }
                if(count > 2){
                    break;
                }
            }
            if(count == 2){
                System.out.print(i + "为素数");
            }
        }
    }

    public void Ex5(int a, int b){
        if(b == 0){
            throw new RuntimeException("除数为0");
        }
        if(a % b == 0){
            System.out.println("可以被整除");
        } else {
            System.out.println("不可以被整除");
        }
    }

    public void Ex6(){
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + " * 5 = " + i * 5);
        }
    }

    public static void main(String[] args) {
        new Chapter3().Ex2();
        new Chapter3().Ex4();
        // System.out.println(new Chapter3().Ex3());
        new Chapter3().Ex5(2,1);
    }
}
