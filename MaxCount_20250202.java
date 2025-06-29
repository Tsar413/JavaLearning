package com.company.javaRelearn;

public class MaxCount_20250202 {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length == 0){
            return m * n;
        }
        int flag1 = Integer.MAX_VALUE;
        int flag2 = Integer.MAX_VALUE;
        for (int[] op : ops) {
            flag1 = Math.min(flag1, op[0]);
            flag2 = Math.min(flag2, op[1]);
        }
        return flag1 * flag2;
    }
}
