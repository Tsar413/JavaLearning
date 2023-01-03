package com.company.javaRelearn;

import com.company.javaRelearn.Generator_2022_9_25.Generator;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueBehavior_2023_1_3 {
    private static int count = 10;
    static <T> void test(Queue<T> queue, Generator<T> gen) {
        for (int i = 0; i < count; i++) {
            queue.offer(gen.next());
        }
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }
    static class Gen implements Generator<Integer> {
        Integer[] i = {1,2,3,4,5,6,7,8,9,10};
        int t;
        @Override
        public Integer next() {
            return i[t++];
        }
    }

    public static void main(String[] args) {
        test(new LinkedList<Integer>(),new Gen());
        test(new PriorityQueue<Integer>(),new Gen());
        test(new ArrayBlockingQueue<Integer>(count),new Gen());
        test(new ConcurrentLinkedDeque<Integer>(),new Gen());
        test(new LinkedBlockingDeque<Integer>(), new Gen());
        test(new PriorityBlockingQueue<Integer>(),new Gen());
    }
}
