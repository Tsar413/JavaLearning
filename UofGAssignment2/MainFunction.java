package com.company.javaRelearn.UofGAssignment2;

import java.util.Scanner;

public class MainFunction {
    public static void main(String[] args) {
        //Initialising the board, ships and players
        Board player1HitBoard = new Board(10,10);
        player1HitBoard.fillBoard();
        Board player1ShipBoard = new Board(10,10);
        player1ShipBoard.createRandomShip(6);
        Board player2HitBoard = new Board(10,10);
        player2HitBoard.fillBoard();
        Board player2ShipBoard = new Board(10,10);
        player2ShipBoard.createRandomShip(6);
        Players players1 = new Players("AA",player1HitBoard);
        Players players2 = new Players("BB",player2HitBoard);

        boolean flag = true;

        /*
        * Use two-dimensional arrays for location storage, initialise all to 0 and the location entered
        * by the user becomes 1. If there is a duplicate, the user loses the turn.
        * */
        Integer[][] judgeString = new Integer[10][10];
        for (int i = 0; i < judgeString.length; i++) {
            for (int j = 0; j < judgeString[0].length; j++) {
                judgeString[i][j] = 0;
            }
        }

        Integer[][] judgeString1 = new Integer[10][10];
        for (int i = 0; i < judgeString1.length; i++) {
            for (int j = 0; j < judgeString1[0].length; j++) {
                judgeString1[i][j] = 0;
            }
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input column and row number without repetition");
            int col1 = scanner.nextInt();
            int row1 = scanner.nextInt();

            if (judgeString[col1][row1] == 0) {
                judgeString[col1][row1] = 1;
                flag = players1.takeTurn(col1,row1, player1ShipBoard, player2ShipBoard);
                System.out.println(players1);
            } else {
                System.out.println("Error Input. Lose turn.");
            }

            //Determining winners and losers, comparing mark sizes between players
            if (flag) {
                if (players1.getMark() > players2.getMark()) {
                    System.out.println("Player1 win");
                    System.out.println("Player1 sinks " + players1.getMark() + " ships");
                    System.out.println("Player1 remains " + (player1ShipBoard.getBattleshipNumber() - players2.getMark()) + " ships");
                    System.out.println("Player2 sinks " + players2.getMark() + " ships");
                    System.out.println("Player2 remains " + (player2ShipBoard.getBattleshipNumber() - players1.getMark()) + " ships");
                } else if (players1.getMark().equals(players2.getMark())) {
                    System.out.println("Match");
                } else {
                    System.out.println("Player2 win");
                }

                break;
            }

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Input column and row number without repetition");
            int col2 = scanner1.nextInt();
            int row2 = scanner1.nextInt();
            if (judgeString1[col2][row2] == 0) {
                judgeString1[col2][row2] = 1;
                flag = players2.takeTurn(col2,row2, player2ShipBoard, player1ShipBoard);
                System.out.println(players2);
            } else {
                System.out.println("Error Input. Lose turn.");
            }

            //Determining winners and losers, comparing mark sizes between players
            if (flag) {
                if (players1.getMark() < players2.getMark()) {
                    System.out.println("Player2 win");
                    System.out.println("Player1 sinks " + players1.getMark() + " ships");
                    System.out.println("Player1 remains " + (player1ShipBoard.getBattleshipNumber() - players2.getMark()) + " ships");
                    System.out.println("Player2 sinks " + players2.getMark() + " ships");
                    System.out.println("Player2 remains " + (player2ShipBoard.getBattleshipNumber() - players1.getMark()) + " ships");
                } else if (players1.getMark().equals(players2.getMark())) {
                    System.out.println("Match");
                } else {
                    System.out.println("Player1 win");
                }
                break;
            }
        }

    }
}
