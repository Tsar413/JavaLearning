package com.company.javaRelearn;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder_20241218 {
    static class MedianFinder {
        private PriorityQueue<Integer> queue1;
        private PriorityQueue<Integer> queue2;
        private int length;


        public MedianFinder() {
            this.queue1 = new PriorityQueue<>(new Comparator<Integer>() {
                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2 - o1;
                }
            });
            this.queue2 = new PriorityQueue<>();
            this.length = 0;
        }

        public void addNum(int num) {
            if(length == 0){
                queue1.offer(num);
                length++;
            } else {
                if(length % 2 == 1){
                    int t = queue1.poll();
                    if(t <= num){
                        queue1.offer(t);
                        queue2.offer(num);
                    } else {
                        queue1.offer(num);
                        queue2.offer(t);
                    }
                    length++;
                } else {
                    int t1 = queue1.poll();
                    int t2 = queue2.poll();
                    if(t2 <= num){
                        queue1.offer(t1);
                        queue2.offer(num);
                        queue1.offer(t2);
                    } else {
                        queue1.offer(t1);
                        queue2.offer(t2);
                        queue1.offer(num);
                    }
                    length++;
                }
            }
        }

        public double findMedian() {
            if(length % 2 == 1){
                return queue1.peek();
            } else {
                return (queue1.peek() * 1.0 + queue2.peek()) / 2;
            }
        }
    }

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(40);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(12);
        System.out.println(medianFinder.findMedian());
        medianFinder.addNum(16);
        System.out.println(medianFinder.findMedian());
    }
}
