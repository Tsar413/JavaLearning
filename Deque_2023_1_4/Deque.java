package com.company.javaRelearn.Deque_2023_1_4;

import java.util.LinkedList;

public class Deque<T> {
    private LinkedList<T> deque = new LinkedList<T>();
    public void addFirst(T e) {
        deque.addLast(e);
    }
    public void addLast(T e) {
        deque.addLast(e);
    }
    public T getFirst() {
        return deque.getFirst();
    }
    public T getLast() {
        return deque.getLast();
    }
    public T removeFirst() {
        return deque.removeFirst();
    }
    public T removeLast() {
        return deque.removeLast();
    }
    public int size() {
        return deque.size();
    }

    @Override
    public String toString() {
        return deque.toString();
    }
}
