package com.company.javaRelearn;

public class NumRookCaptures_20241206 {
    public int numRookCaptures(char[][] board) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == 'R'){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        int result = 0;
        for (int i = x; i < 8; i++) {
            if(board[i][y] == 'B'){
                break;
            }
            if(board[i][y] == 'p'){
                result++;
                break;
            }
        }
        for (int i = x; i >= 0; i--) {
            if(board[i][y] == 'B'){
                break;
            }
            if(board[i][y] == 'p'){
                result++;
                break;
            }
        }
        for (int i = y; i < 8; i++) {
            if(board[x][i] == 'B'){
                break;
            }
            if(board[x][i] == 'p'){
                result++;
                break;
            }
        }
        for (int i = y; i >= 0; i--) {
            if(board[x][i] == 'B'){
                break;
            }
            if(board[x][i] == 'p'){
                result++;
                break;
            }
        }
        return result;
    }
}
