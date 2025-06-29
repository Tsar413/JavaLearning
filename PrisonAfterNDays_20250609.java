package com.company.javaRelearn;

public class PrisonAfterNDays_20250609 {
    public int[] prisonAfterNDays(int[] cells, int n) {
        while (n > 0){
            int[] cellsAfter = new int[8];
            cellsAfter[0] = 0;
            cellsAfter[7] = 0;
            for (int i = 1; i <= 6; i++) {
                if(cells[i - 1] == cells[i + 1]){
                    cellsAfter[i] = 1;
                } else {
                    cellsAfter[i] = 0;
                }
            }
            cells = cellsAfter;
            n--;
        }
        return cells;
    }
}
