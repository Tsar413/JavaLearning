package com.company.javaRelearn;

public class CanMakeSquare_20240831 {
    public boolean canMakeSquare(char[][] grid) {
        boolean flag1 = judge(grid[0][0], grid[0][1], grid[1][0], grid[1][1]);
        boolean flag2 = judge(grid[0][1], grid[0][2], grid[1][1], grid[1][2]);
        boolean flag3 = judge(grid[1][0], grid[1][1], grid[2][0], grid[2][1]);
        boolean flag4 = judge(grid[1][1], grid[1][2], grid[2][1], grid[2][2]);
        return flag1 || flag2 || flag3 || flag4;
    }

    private boolean judge(char grid1, char grid2, char grid3, char grid4){
        int b = 0;
        int w = 0;
        if(grid1 == 'B'){
            b++;
        } else {
            w++;
        }
        if(grid2 == 'B'){
            b++;
        } else {
            w++;
        }
        if(grid3 == 'B'){
            b++;
        } else {
            w++;
        }
        if(grid4 == 'B'){
            b++;
        } else {
            w++;
        }
        if(w == b){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] grid = {{'B', 'W', 'B'}, {'W', 'B', 'W'}, {'B', 'W', 'B'}};
        System.out.println(new CanMakeSquare_20240831().canMakeSquare(grid));
    }
}
