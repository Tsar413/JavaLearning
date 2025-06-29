package com.company.javaRelearn.UofGWeek4;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        int flag = 0;
        int judgeFlag = 0;
        int judgePlayer1 = 0;
        int judgePlayer2 = 0;
        int x = 0;
        int y = 0;
        Character[][] ticTacToeBoard = new Character[3][3];
        for (int i = 0; i < ticTacToeBoard.length; i++) {
            for (int j = 0; j < ticTacToeBoard[0].length; j++) {
                ticTacToeBoard[i][j] = ' ';
            }
        }

        while (judgeFlag < 9) {
            while (judgePlayer1 == 0) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("First Player");
                System.out.println("Input Row");
                x = scanner.nextInt();
                System.out.println("Input Column");
                y = scanner.nextInt();
                if (ticTacToeBoard[x - 1][y - 1] == (' ')){
                    System.out.println("Input success");
                    judgePlayer1 = 1;
                    break;
                } else {
                    System.out.println("Input again");
                }
            }
            ticTacToeBoard[x - 1][y - 1] = 'o';
            judgePlayer1 = 0;
            judgeFlag++;
            for (int i = 0; i < ticTacToeBoard.length; i++) {
                for (int j = 0; j < ticTacToeBoard[0].length; j++) {
                    System.out.print(ticTacToeBoard[i][j] + " ");;
                }
                System.out.println();
            }
            if (judgeFlag >= 9) {
                break;
            }


            while (judgePlayer2 == 0) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Second Player");
                System.out.println("Input Row");
                x = scanner.nextInt();
                System.out.println("Input Column");
                y = scanner.nextInt();
                if (ticTacToeBoard[x - 1][y - 1].equals(' ')){
                    System.out.println("Input success");
                    judgePlayer2 = 1;
                    break;
                } else {
                    System.out.println("Input again");
                }
            }
            ticTacToeBoard[x - 1][y - 1] = 'x';
            judgePlayer2 = 0;
            judgeFlag++;
            for (int i = 0; i < ticTacToeBoard.length; i++) {
                for (int j = 0; j < ticTacToeBoard[0].length; j++) {
                    System.out.print(ticTacToeBoard[i][j] + " ");;
                }
                System.out.println();
            }
            if (judgeFlag >= 9) {
                break;
            }
        }
    }
}
