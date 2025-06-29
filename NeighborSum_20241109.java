package com.company.javaRelearn;

public class NeighborSum_20241109 {
    class NeighborSum {
        private int[][] grid;

        public NeighborSum(int[][] grid) {
            this.grid = grid;
        }

        public int adjacentSum(int value) {
            int[] location = getLocation(this.grid, value);
            int down = this.grid.length - 1;
            int right = this.grid[0].length - 1;
            assert location != null;
            if(location[0] == down){
                if(location[1] == right){
                    return this.grid[down - 1][right] + this.grid[down][right - 1];
                } else if(location[1] == 0){
                    return this.grid[down - 1][0] + this.grid[down][1];
                } else {
                    return this.grid[down][location[1] - 1] +
                            this.grid[down][location[1] + 1] +
                            this.grid[down - 1][location[1]];
                }
            } else if(location[0] == 0){
                if(location[1] == right){
                    return this.grid[1][right] + this.grid[0][right - 1];
                } else if(location[1] == 0){
                    return this.grid[1][0] + this.grid[0][1];
                } else {
                    return this.grid[0][location[1] - 1] +
                            this.grid[0][location[1] + 1] +
                            this.grid[1][location[1]];
                }
            } else if(location[1] == right){
                return this.grid[location[0] - 1][right] +
                        this.grid[location[0] + 1][right] +
                        this.grid[location[0]][right - 1];
            } else if(location[1] == 0){
                return this.grid[location[0] - 1][0] +
                        this.grid[location[0] + 1][0] +
                        this.grid[location[0]][1];
            } else {
                return this.grid[location[0] - 1][location[1]] +
                        this.grid[location[0] + 1][location[1]] +
                        this.grid[location[0]][location[1] - 1] +
                        this.grid[location[0]][location[1] + 1];
            }
        }

        public int diagonalSum(int value) {
            int[] location = getLocation(this.grid, value);
            int down = this.grid.length - 1;
            int right = this.grid[0].length - 1;
            assert location != null;
            if(location[0] == down){
                if(location[1] == right){
                    return this.grid[down - 1][right - 1];
                } else if(location[1] == 0){
                    return this.grid[down - 1][1];
                } else {
                    return this.grid[down - 1][location[1] - 1] +
                            this.grid[down - 1][location[1] + 1];
                }
            } else if(location[0] == 0){
                if(location[1] == right){
                    return this.grid[1][right - 1];
                } else if(location[1] == 0){
                    return this.grid[1][1];
                } else {
                    return this.grid[1][location[1] - 1] +
                            this.grid[1][location[1] + 1];
                }
            } else if(location[1] == right){
                return this.grid[location[0] - 1][right - 1] +
                        this.grid[location[0] + 1][right - 1];
            } else if(location[1] == 0){
                return this.grid[location[0] - 1][1] +
                        this.grid[location[0] + 1][1];
            } else {
                return this.grid[location[0] - 1][location[1] - 1] +
                        this.grid[location[0] + 1][location[1] + 1] +
                        this.grid[location[0] + 1][location[1] - 1] +
                        this.grid[location[0] - 1][location[1] + 1];
            }
        }

        private int[] getLocation(int[][] grid, int value){
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if(grid[i][j] == value){
                        return new int[]{i, j};
                    }
                }
            }
            return null;
        }
    }
}
