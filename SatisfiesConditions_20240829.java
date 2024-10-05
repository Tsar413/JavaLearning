package com.company.javaRelearn;

public class SatisfiesConditions_20240829 {
    public boolean satisfiesConditions(int[][] grid) {
        for (int i = 0; i < grid[0].length - 1; i++) {
            for (int j = 0; j < grid.length; j++) {
                if(grid[j][i] == grid[j][i + 1]){
                    return false;
                }
            }
        }
        for (int i = 0; i < grid.length - 1; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != grid[i + 1][j]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] grid = {{1}, {2}, {3}};
        System.out.println(new SatisfiesConditions_20240829().satisfiesConditions(grid));

    }
}
