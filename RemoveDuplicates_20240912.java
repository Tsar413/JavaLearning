package com.company.javaRelearn;

public class RemoveDuplicates_20240912 {
    public int removeDuplicates(int[] nums) {
        int index1 = -1;
        int flag = nums[0];
        int count = 1;
        boolean flag1 = true;
        for (int i = 1; i < nums.length; i++) {
            if(flag == nums[i]){
                if(count < 2){
                    count++;
                    if(index1 != -1){
                        nums[index1] = nums[i];
                        index1++;
                    }
                } else {
                    if(flag1){
                        if(index1 == -1){
                            index1 = i;
                        }
                        flag1 = false;
                    }
                }
            } else {
                count = 1;
                flag = nums[i];
                flag1 = true;
                if(index1 != -1){
                    nums[index1] = nums[i];
                    index1++;
                }
            }

        }
        return index1;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(new RemoveDuplicates_20240912().removeDuplicates(nums));
    }
}
