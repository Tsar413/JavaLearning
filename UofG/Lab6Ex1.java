package com.company.javaRelearn.UofG;

public class Lab6Ex1 {
    public static void multiplicationTables(int multiplicationControl, int itemsNumber) {
        int j = 1; //j的作用在于进行自增，进行输出
        if(multiplicationControl <= 0 || itemsNumber <= 0) {
            System.out.println("Error");
        } else {
            for(int i = 0; i < 10; i++) {
                if(j <= itemsNumber) {
                    System.out.println(j + " * " + multiplicationControl + " = " + j * multiplicationControl + " ");
                    ++j;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        multiplicationTables(8,5);
    }
}
