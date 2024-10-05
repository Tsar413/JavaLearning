package com.company.javaRelearn;

import java.util.Arrays;
import java.util.PriorityQueue;

class SeatManager {
    private PriorityQueue<Integer> queue;

    public SeatManager(int n) {
        this.queue = new PriorityQueue<Integer>();
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
    }

    public int reserve() {
        return queue.poll();
    }

    public void unreserve(int seatNumber) {
        queue.add(seatNumber);
    }
}

public class SeatManager_20240930 {
}
