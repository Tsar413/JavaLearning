package com.company.javaRelearn.AlgorithmsDataStructuresLearning.LinkedList_2023_2_4;

public class Node<T> {
    public T item;
    public Node next;
    public Node pre;

    public Node(T item, Node next) {
        this.item = item;
        this.next = next;
    }

    public Node(T item,Node pre, Node next) {
        this.item = item;
        this.pre = pre;
        this.next = next;
    }
}
