package com.company.javaRelearn;

import java.util.Arrays;

public class PrimeSubOperation_20240920 {
    public boolean primeSubOperation(int[] nums) {
        int[] data = new int[]{2,3,5,7,11,13,17,19,23,29,31,
                37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,
                103,107,109,113,127,131,137,139,149,151,157,163,
                167,173,179,181,191,193,197,199,211,223,223,229,
                233,239,241,251,257,263,269,271,277,281,283,293,
                307,311,313,317,331,337,347,349,353,359,367,373,
                379,383,389,397,401,409,419,421,431,433,439,443,
                449,457,461,463,467,479,487,491,499,503,507,521,
                523,541,547,563,569,571,577,587,593,599,601,607,
                613,617,619,631,641,643,647,653,659,661,673,677,
                683,691,701,709,719,727,733,739,743,751,757,761,
                769,773,787,797,809,811,821,823,827,829,839,853,
                857,859,863,877,881,883,887,907,911,919,929,937,
                941,947,953,967,971,977,983,991,997};
        int firstLeft = 0;
        int firstRight = data.length - 1;
        while (firstLeft < firstRight){
            int firstMid = firstLeft + firstRight >> 1;
            if(data[firstMid] >= nums[0]){
                firstRight = firstMid;
            } else {
                firstLeft = firstMid + 1;
            }
        }
        if(firstRight == 0){
            nums[0] -= data[firstRight];
        } else {
            nums[0] -= data[firstRight - 1];
        }

        for (int i = 1; i < nums.length; i++) {
            int judge = nums[i] - nums[i - 1];
            if(judge <= 1){
                return false;
            }
            int left = 0;
            int right = data.length - 1;
            while (left < right){
                int mid = left + right >> 1;
                if(data[mid] >= judge){
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            if(right > 0){
                nums[i] -= data[right - 1];
            }

        }
        //System.out.println(Arrays.toString(nums));
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,7,4};
        System.out.println(new PrimeSubOperation_20240920().primeSubOperation(nums));
    }
}
