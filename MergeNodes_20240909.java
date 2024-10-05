package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeNodes_20240909 {
    List<Integer> list = new ArrayList<Integer>();
    int index = 1;

    public ListNode mergeNodes(ListNode head) {
        int temp = 0;
        while (head.next != null){
            if(head.val != 0){
                temp += head.val;
            } else {
                list.add(temp);
                temp = 0;
            }
            head = head.next;
        }
        list.add(temp);
        System.out.println(list);
        return makeNewList();
    }

    public ListNode makeNewList(){
        if(index == list.size() - 1){
            return new ListNode(list.get(index), null);
        }
        ListNode node = new ListNode();
        node.val = list.get(index);
        index++;
        node.next = makeNewList();
        return node;
    }

    public static void main(String[] args) {
        ListNode node8 = new ListNode(0, null);
        ListNode node7 = new ListNode(2, node8);
        ListNode node6 = new ListNode(5, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(0, node5);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(3, node3);
        ListNode node1 = new ListNode(0, node2);
        MergeNodes_20240909 m = new MergeNodes_20240909();
        m.mergeNodes(node1);
    }
}
