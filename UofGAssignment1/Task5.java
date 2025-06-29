package com.company.javaRelearn.UofGAssignment1;

import java.util.Scanner;

public class Task5 {
    public static void task5(int rows, int columns) {
        int row = 0; //行
        int column = 0; //列

        if(rows < 5 || rows > 10 || columns < 5 || columns > 10) {
            System.out.println("Quantity Error");
            return;
        } else {
            row = rows;
            column = columns;
        }

        int mineX1 = 4;
        int mineY1 = 2;

        int mineX2 = 2;
        int mineY2 = 6;

        int mineX3 = 8;
        int mineY3 = 1;

        String output = "";
        for(int i = 1; i <= 3; i++) { //3步
            if(i == 1) {
                output += String.format("%5s", "|");
//                output += "    |";
                for(int c = 1; c <= column; c++){ //定列
                    output += String.format("%3s", c);
                }
                output += "\n";
            }else if(i == 2) {
                output += String.format("%5s", "|");
//                output += " -  |";
                for(int c = 1; c <= column; c++){
                    output += String.format("%3s", "-");
                }
                output += "\n";
            } else {
                for(int j = 1; j <= row; j++ ) {
                    output += String.format("%2s",j);
                    output += String.format("%3s","|");
                    for (int k = 1; k <= column; k++) {
                        if(j == mineY1 && k == mineX1) { //横坐标2，纵坐标6
                            output += String.format("%3s","x");
                        } else if(j == mineY2 && k == mineX2) { //横坐标4，纵坐标2
                            output += String.format("%3s","x");
                        } else if(j == mineY3 && k == mineX3) { //横坐标8，纵坐标1
                            output += String.format("%3s","x");
                        } else {
                            output += String.format("%3s","o");
                        }
//                        output.append(String.format("%3s","o"));
                    }
                    output += "\n";
                }
            }
        }

//        int mineX1 = 4;
//        int mineY1 = 2;
//        int mine1 = ((column+2)*(mineY1+1) + (mineX1+1)) * 3;
//
//        int mineX2 = 2;
//        int mineY2 = 6;
//        int mine2 = ((column+2)*(mineY2+1) + (mineX2+1)) * 3;
//
//        int mineX3 = 8;
//        int mineY3 = 1;
//        int mine3 = ((column+2)*(mineY3+1) + (mineX3+1)) * 3;
//
//        //算法为column row x为横坐标 y为纵坐标
//        //[(column+2)*(y+1) + (x+1)] * 3 + 1
//        output.replace(mine1 + 1,mine1 + 2,"x");
//        output.replace(mine2 + 1,mine2 + 2,"x");
//        output.replace(mine3 + 1,mine3 + 2,"x");
        System.out.println(output);
    }

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input the row's number");
//        int rows = scanner.nextInt();
//        System.out.println("Input the column's number");
//        int columns = scanner.nextInt();
//        task5(rows, columns);
        task5(6,10);
    }
}
