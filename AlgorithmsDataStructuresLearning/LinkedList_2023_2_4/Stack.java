package com.company.javaRelearn.AlgorithmsDataStructuresLearning.LinkedList_2023_2_4;

import java.util.Iterator;

public class Stack<T> implements Iterable<T> {
    private Node head;
    private int stackLength;

    public Stack() {
        head = new Node(null,null);
        stackLength = 0;
    }

    //判断当前栈中元素个数是否为0
    public boolean isEmpty(){
        return stackLength == 0;
    }


    public void push(T t) {
        Node oldNode = head.next;
        Node newNode = new Node(t,oldNode);
        head.next = newNode;
        stackLength++;
    }

    public T pop() {
        Node pushNode = head.next;
        Node node = pushNode.next;
        head.next = node;
        stackLength--;
        return (T) pushNode.item;
    }

    //获取栈中元素的个数
    public int size(){
        return stackLength;
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator<T> {
        private Node n = head;

        @Override
        public boolean hasNext() {
            return n.next != null;
        }

        @Override
        public T next() {
            Node node = n.next;
            n = n.next;
            return (T) node.item;
        }
    }
}
