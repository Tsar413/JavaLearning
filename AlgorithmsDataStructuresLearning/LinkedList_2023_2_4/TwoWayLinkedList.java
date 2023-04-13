package com.company.javaRelearn.AlgorithmsDataStructuresLearning.LinkedList_2023_2_4;

import java.util.Iterator;

public class TwoWayLinkedList<T> implements Iterable<T> {
    private Node head;
    private Node last;

    private int listLength;

    public TwoWayLinkedList() {
        this.head = new Node(null,null,null);
        this.last = null;
        listLength = 0;
    }

    public void clear() {
        head.next = null;
        last = null;
        listLength = 0;
    }

    public boolean isEmpty() {
        return listLength == 0;
    }

    public int length() {
        return listLength;
    }

    public T get(int i) {
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return (T) n.item;
    }

    public void insert(T t) {
        if (last == null) {
            last = new Node(t,head,null);
            head.next = last;
        } else {
            Node oldLast = last;
            Node node = new Node(t,oldLast,null);
            oldLast.next = node;
            last = node;
        }
        listLength++;
    }

    public void insert(int i,T t) {
        Node node = head;
        for (int index = 0; index < i; index++) {
            node = node.next;
        }
        Node temp = node.next;
        Node newNode = new Node(t,node,temp);
        temp.pre = newNode;
        node.next = newNode;
        listLength++;
    }

    public int indexOf(T t) {
        Node node = head;
        for (int i = 0; node.next != null ; i++) {
            node = node.next;
            if (node.item.equals(t)) {
                return i;
            }
        }
        return -1;
    }

    public T remove(int i){
        Node node = head;
        for (int index = 0; index < i; index++) {
            node = node.next;
        }
        Node temp = node.next;
        Node tempNext = temp.next;

        node.next = tempNext;
        tempNext.pre = node;

        listLength--;
        return (T) temp.item;
    }

    public T getFirst() {
        if (isEmpty()) {
            return null;
        } else {
            return (T) head.next.item;
        }
    }

    public T getLast() {
        if (isEmpty()) {
            return null;
        } else {
            return (T) last.item;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }

    private class TIterator implements Iterator{
        private Node n = head;
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }
        @Override
        public Object next() {
            n = n.next;
            return n.item;
        }
    }
}
