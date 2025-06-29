package com.company.javaRelearn.Teaching2DArrays_20241025;

public class Array2D {
    public static void main(String[] args) {
        String[][] board = new String[4][4];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = "-";
            }
        }
//        board[1][3] = "Q";
        board[0][2] = "Q";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        for (String[] strings : board) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(strings[j] + " ");
            }
            System.out.println();
        }
    }
}
