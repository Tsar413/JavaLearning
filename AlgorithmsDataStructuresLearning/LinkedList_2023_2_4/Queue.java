package com.company.javaRelearn.AlgorithmsDataStructuresLearning.LinkedList_2023_2_4;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
    private Node head;
    private Node last;
    private int queueLength;

    public Queue() {
        head = new Node(null,null);
        last = null;
        queueLength = 0;
    }

    public boolean isEmpty() {
        return queueLength == 0;
    }

    public int size() {
        return queueLength;
    }

    //向队列中插入元素t
    public void enqueue(T t){
        if (last==null){
            last = new Node(t,null);
            head.next=last;
        }else{
            Node oldLast = last;
            last = new Node(t,null);
            oldLast.next=last;
        }
        //个数+1
        queueLength++;
    }


    //取出元素
    public T dequeue() {
        if (isEmpty()){
            return null;
        }
        Node oldFirst = head.next;
        head.next = oldFirst.next;
        queueLength--;
        if (isEmpty()){
            last=null;
        }
        return (T)oldFirst.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }
    private class QIterator implements Iterator<T>{
        private Node n = head;
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }
        @Override
        public T next() {
            Node node = n.next;
            n = n.next;
            return (T) node.item;
        }
    }

}
