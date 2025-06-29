package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TotalNQueens_20241113 {
    private int ans = 0;

    public int totalNQueens(int n) {
        dfs(n, 0, 0, 0, 0);
        return this.ans;
    }

    private void dfs(int n, int row, int cols, int pie, int na) {
        if (row == n) {
            this.ans ++;
            return;
        }
        int positions = ((1 << n) - 1) & (~(cols | pie | na));
        while (positions != 0) {
            int p = positions & (-positions);
            positions &= (positions - 1);
            dfs(n, row + 1, cols | p, (pie | p) << 1, (na | p) >> 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(new TotalNQueens_20241113().totalNQueens(4));
    }
}
