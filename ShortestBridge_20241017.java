package com.company.javaRelearn;

import java.util.*;

public class ShortestBridge_20241017 {
    private Map<Integer, List<Integer>> map1 = new HashMap<Integer, List<Integer>>();
    private Map<Integer, List<Integer>> map2 = new HashMap<Integer, List<Integer>>();
    private int left = 0;
    private int right = 0;
    private int up = 0;
    private int down = 0;
    private int flag = 1;
    private int[][] grid;

    public int shortestBridge(int[][] grid) {
        right = grid[0].length - 1;
        up = grid.length - 1;
        this.grid = grid;
        for (int i = 0; i < this.grid.length; i++) {
            for (int j = 0; j < this.grid[0].length; j++) {
                if(this.grid[i][j] == 1){
                    if(flag == 1){
                        if(i != 0 || j != 0){
                            if(map1.containsKey(i)){
                                map1.get(i).add(j);
                            } else {
                                List<Integer> list = new ArrayList<Integer>();
                                list.add(j);
                                map1.put(i, list);
                            }
                        }
                        dfs(i, j);
                        flag++;
                    } else {
                        if(map2.containsKey(i)){
                            map2.get(i).add(j);
                        } else {
                            List<Integer> list = new ArrayList<Integer>();
                            list.add(j);
                            map2.put(i, list);
                        }
                        dfs(i, j);
                    }
                }
            }
        }
//        System.out.println(map1);
//        System.out.println(map2);
        return 1;
    }

    private boolean dfs(int m, int n){
        if(m < left || m > right || n < down || n > up){
            return false;
        }
        if(grid[m][n] == 0){
            return true;
        }
        if(grid[m][n] == 2){
            return false;
        }
        if(grid[m][n] == 1){
            grid[m][n] = 2;
        }
        boolean flag1 = dfs(m - 1, n);
        boolean flag2 = dfs(m + 1, n);
        boolean flag3 = dfs(m, n - 1);
        boolean flag4 = dfs(m, n + 1);
        if(flag1 || flag2 || flag3 || flag4){
            if(flag == 1){
                if(map1.containsKey(m) && !map1.get(m).contains(n)){
                    map1.get(m).add(n);
                } else if(!map1.containsKey(m)) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(n);
                    map1.put(m, list);
                }
            } else {
                if(map2.containsKey(m) && !map2.get(m).contains(n)){
                    map2.get(m).add(n);
                } else if(!map2.containsKey(m)) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(n);
                    map2.put(m, list);
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 0, 1, 0, 1}, {1, 0, 0, 0, 1}, {1, 1, 1, 1, 1}};
        int[][] grid1 = {{1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 1, 1, 1, 1}};
        System.out.println(new ShortestBridge_20241017().shortestBridge(grid1));
    }
}
