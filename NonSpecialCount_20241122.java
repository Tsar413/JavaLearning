package com.company.javaRelearn;

public class NonSpecialCount_20241122 {
    private static final int[] nums = new int[(int) Math.sqrt(1000000000)];
    private static int index = 0;
    private static int num = 2;
    static {
        while (num * num < 1000000000){
            boolean flag = true;
            for (int i = 2; i < num; i++) {
                if((num % i) == 0){
                    num++;
                    flag = false;
                    break;
                }
            }
            if(flag){
                nums[index] = num * num;
                num++;
                index++;
            }
        }
    }


    public int nonSpecialCount(int l, int r) {
        int num1 = calIndex(l);
        int num2 = calIndex(r);
        if(nums[num1] == l){
            if(nums[num2] == r){
                return r - l - num2 + num1;
            } else {
                return r - l + 1 - num2 + num1;
            }
        } else {
            if(nums[num2] == r){
                return r - l  - num2 + num1;
            } else {
                return r - l + 1 - num2 + num1;
            }
        }
    }

    private int calIndex(int num1){
        int left = 0;
        int right = index - 1;
        while (left < right){
            int mid = left + right >> 1;
            if(nums[mid] < num1){
                left = mid + 1;
            } else if(nums[mid] == num1) {
                return mid;
            } else {
                right = mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(new NonSpecialCount_20241122().nonSpecialCount(1,4));
    }
}
