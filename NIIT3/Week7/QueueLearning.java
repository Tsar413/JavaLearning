package com.company.javaRelearn.NIIT3.Week7;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class CommonQueueLearning{
    public <T> void queueFunctions(T t1, T t2, T t3){
        Queue<T> queue = new LinkedList<T>();
        queue.offer(t1);
        queue.offer(t2);
        queue.offer(t3); //通过offer方法向队列中添加
        System.out.println(queue); //输出queue中的元素
        System.out.println(queue.peek()); //输出队列顶端的元素，不出队
        System.out.println(queue.poll()); //出队的同时输出队列顶端的元素
        System.out.println(queue); //输出queue的元素
    }

    public static void main(String[] args) {
        CommonQueueLearning commonQueueLearning = new CommonQueueLearning();
        commonQueueLearning.queueFunctions(1, 3, 2);
    }
}

class DifferentQueues{
    public <T> void differentQueues(Queue<T> queue, T... args){
        for (T t : args){
            queue.offer(t);
        }
        while (!queue.isEmpty()){
            System.out.print(queue.poll() + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        Queue<Integer> queue1 = new LinkedList<Integer>();
        Queue<Integer> queue2 = new PriorityQueue<Integer>();
        Queue<Integer> queue3 = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        new DifferentQueues().differentQueues(queue1, 1,9,3,7,5);
        new DifferentQueues().differentQueues(queue2, 1,9,3,7,5);
        new DifferentQueues().differentQueues(queue3, 1,9,3,7,5);
    }


}

public class QueueLearning {
}
