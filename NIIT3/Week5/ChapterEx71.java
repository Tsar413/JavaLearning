package com.company.javaRelearn.NIIT3.Week5;

import java.lang.Math;
import java.util.Random;

class CalMaxMin{
    private int[] array;
    private int index;

    public CalMaxMin(int length){
        this.array = new int[length];
        index = 0;
    }

    class RandomNums{
        private Random random;

        public RandomNums(){
            this.random = new Random();
        }

        public int getNum(){
            return random.nextInt();
        }
    }

    public void generateArray(){
        RandomNums randomNums = new RandomNums();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNums.getNum();
        }
    }

    public int[] getMaxMin(){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : array){
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return new int[]{max, min};
    }
}

public class ChapterEx71 {
    public static void main(String[] args) {
        CalMaxMin calMaxMin = new CalMaxMin(20);
        calMaxMin.generateArray();
        int[] result = calMaxMin.getMaxMin();
        System.out.println("最大值: " + result[0]);
        System.out.println("最小值: " + result[1]);
    }
}
