package com.company.javaRelearn;

public class NumIslands_20241006 {
    private char[][] data;
    private int right = 0;
    private int down = 0;

    public int numIslands(char[][] grid) {
        data = grid;
        down = grid.length - 1;
        right = grid[0].length - 1;
        int result = 0;
        for (int i = 0; i < grid[0].length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[j][i] == '1'){
                    result++;
                    System.out.println(result);
                    changeGrid(j, i);
                }
            }
        }
        return result;
    }

    private void changeGrid(int row, int col){
        if(row > down || col > right || row < 0 || col < 0){
            return;
        }
        if(data[row][col] == '2' || data[row][col] == '0'){
            return;
        }
        if(data[row][col] == '1'){
            data[row][col] = '2';
        }
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        changeGrid(row - 1, col);
        changeGrid(row + 1, col);
        changeGrid(row, col - 1);
        changeGrid(row, col + 1);
    }

    public static void main(String[] args) {
        char[][] grid1 = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        char[][] grid2 = {{'1', '1', '0', '0', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '1', '0', '0'}, {'0', '0', '0', '1', '1'}};
        char[][] grid3 = {{'1', '0', '1', '1', '0', '1', '1'}};
        System.out.println(new NumIslands_20241006().numIslands(grid1));
    }
}
