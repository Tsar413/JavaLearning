package com.company.javaRelearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class QueueDemo_2022_8_11 {
    public static void printQ(Queue queue) {
        while (queue.peek() != null) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Random rnd = new Random(47);
        for(int i = 0; i < 10; i++) {
            queue.offer(rnd.nextInt(i + 10));
        }
        printQ(queue);
        Queue<Character> qc = new LinkedList<Character>();
        for(char c : "Brontosaurus".toCharArray()) {
            qc.offer(c);
        }
        printQ(qc);
    }
}
