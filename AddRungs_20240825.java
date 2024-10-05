package com.company.javaRelearn;

public class AddRungs_20240825 {
    public int addRungs(int[] rungs, int dist) {
        int result = 0;

        if(rungs[0] > dist){
            if(rungs[0] % dist == 0){
                result += (rungs[0] / dist) - 1;
            } else {
                result += (rungs[0] / dist);
            }
        }
        for (int i = 1; i < rungs.length; i++) {
            int diff = rungs[i] - rungs[i - 1];
            if(diff > dist){
                if(diff % dist == 0){
                    result += (diff / dist) - 1;
                } else {
                    result += (diff / dist);
                }

            }
        }
        return result;
    }
}
