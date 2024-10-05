package com.company.javaRelearn;

public class MaximumRobots_20240913 {
    public int maximumRobots(int[] chargeTimes, int[] runningCosts, long budget) {
        int left = 0;
        int right = 0;
        long cost = 0L;
        int k = 0;
        int result = 0;
        int maxIndex = 0;
        int max = 0;
        while (right < runningCosts.length){
            if(cost == 0){
                cost += chargeTimes[maxIndex];
            }
            if(chargeTimes[right] >= chargeTimes[maxIndex]){
                cost -= chargeTimes[maxIndex];
                maxIndex = right;
                cost += chargeTimes[maxIndex];
            }
            k++;
            cost += k * runningCosts[right];
            right++;
            while (cost > budget){
                cost -= (left + 1) * runningCosts[left];
                k--;
                if(maxIndex == left){
                    cost -= chargeTimes[maxIndex];
                    if(right == runningCosts.length){
                        for (int i = left; i < right ; i++) {
                            if(chargeTimes[i] >= max){
                                maxIndex = i;
                                max = chargeTimes[i];
                            }
                        }
                    } else {
                        for (int i = left; i < right ; i++) {
                            if(chargeTimes[i] >= max){
                                maxIndex = i;
                                max = chargeTimes[i];
                            }
                        }
                    }
                    if(k > 0){
                        cost += chargeTimes[maxIndex];
                    }

                }
                left++;
            }
            result = Math.max(k, result);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] chargeTimes = {11,12,19};
        int[] runningCosts = {10,8,7};
        System.out.println(new MaximumRobots_20240913().maximumRobots(chargeTimes, runningCosts, 19));
    }
}
