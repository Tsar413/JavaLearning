package com.company.javaRelearn.AlgorithmsDataStructuresLearning.LinkedList_2023_2_4;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private Node head;
    private int listLength;

    public LinkedList() {
        this.head = new Node(null,null);
        this.listLength = 0;
    }

    public void clear() {
        //清空的方法是让头节点的next指向null，同时让链表的长度变为0
        head.next = null;
        listLength = 0;
    }

    public int length(){
        return listLength;
    }

    public boolean isEmpty(){
        return listLength == 0;
    }

    public T get(int i) {
        //通过i次循环遍历获得结果
        Node n = head.next;
        for (int index = 0; index < i; index++) {
            n = n.next;
        }
        return (T)n.item;
    }

    //向链表中添加元素t
    public void insert(T t){
        //找到最后一个节点
        Node n = head;
        while(n.next!=null){
            n = n.next;
        }
        Node newNode = new Node(t, null);
        n.next = newNode;
        //链表长度+1
        listLength++;
    }

    public void insert(int i,T t) {
        Node pre = head;
        for (int index = 0; index <= i - 1; index++) {
            pre = pre.next;
        }

        //位置i的结点
        Node curr = pre.next;
        //构建新的结点，让新结点指向位置i的结点
        Node newNode = new Node(t,curr);
        //让之前的结点指向新结点
        pre.next = newNode;
        listLength++;
    }

    //删除指定位置i处的元素，并返回被删除的元素
    public T remove(int i) {
        //寻找i之前的元素
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        //当前i位置的结点
        Node curr = pre.next;
        //前一个结点指向下一个结点，删除当前结点
        pre.next = curr.next;

        listLength--;
        return (T) curr.item;
    }

    //查找元素t在链表中第一次出现的位置
    public int indexOf(T t){
        Node n = head;
        for (int i = 0; n.next != null; i++) {
            n = n.next;
            if (n.item.equals(t)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return new LIterator();
    }

    private class LIterator implements Iterator<T>{
        private Node n;
        public LIterator() {
            this.n = head;
        }
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }
        @Override
        public T next() {
            n = n.next;
            return (T) n.item;
        }
    }

    public void reverse() {
        if (listLength == 0){
            //当前是空链表，不需要反转
            return;
        }
        reverse(head.next);
    }

    public Node reverse(Node curr) {
        if (curr.next == null) {
            head.next = curr;
            return curr;
        }
        Node pre = reverse(curr.next);
        pre.next = curr;
        curr.next = null;
        return curr;
    }

}
