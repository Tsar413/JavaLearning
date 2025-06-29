package com.company.javaRelearn;

public class FindBall_20250215 {
    public int[] findBall(int[][] grid) {
        int[] result = new int[grid[0].length];
        for (int i = 0; i < grid[0].length; i++) {
            result[i] = dfs(grid, 0, i, true);
        }
        return result;
    }

    private int dfs(int[][] grid, int i, int j, boolean flag){
        int width = grid[0].length - 1;
        int height = grid.length - 1;
        if(i == height && !flag){
            return j;
        }
        if(flag){
            int t = grid[i][j];
            if(t == 1){
                if(j == width || grid[i][j + 1] == -1){
                    return -1;
                } else {
                    return dfs(grid, i, j + 1, false);
                }
            } else {
                if(j == 0 || grid[i][j - 1] == 1){
                    return -1;
                } else {
                    return dfs(grid, i, j - 1, false);
                }
            }
        } else {
            return dfs(grid, i + 1, j, true);
        }
    }
}
