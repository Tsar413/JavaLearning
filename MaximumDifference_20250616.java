package com.company.javaRelearn;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaximumDifference_20250616 {
    public int maximumDifference(int[] nums) {
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[j] > nums[i]){
                    result = Math.max(result, nums[j] - nums[i]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num < 2){
            String word = scanner.nextLine();
            int[] nums = Arrays.stream(Arrays.stream(word.trim().split(" ")).mapToInt(Integer::parseInt).toArray()).toArray();
            System.out.println(new MaximumDifference_20250616().maximumDifference(nums));
            num++;
            List<Integer> list = Arrays.stream(word.trim().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
            System.out.println(list);
        }
    }
}
