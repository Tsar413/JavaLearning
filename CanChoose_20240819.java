package com.company.javaRelearn;

public class CanChoose_20240819 {
    public boolean canChoose(int[][] groups, int[] nums) {
        int index1 = 0;
        int index2 = 0;
        int groupNum = 0;
        int judge = 0;
        while (index1 < nums.length){
            int flag = nums[index1];
            if(groups[groupNum][index2] == flag){
                if(index2 < groups[groupNum].length){
                    index2++;
                }
                if(index2 == groups[groupNum].length){
                    judge++;
                    index2 = 0;
                    groupNum++;
                }
            }
            if(groupNum == groups.length){
                return true;
            }
            index1++;
        }
        if(judge == groups.length){
            return true;
        }
        return false;
    }
}
