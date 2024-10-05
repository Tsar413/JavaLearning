package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class RotateRight_20241003 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    private List<Integer> list = new ArrayList<Integer>();

    private int index = 0;
    private int count = 0;

    public ListNode rotateRight(ListNode head, int k) {
        makeList(head);
        int length = list.size();
        if (length < k) {
            index = list.size() - k % length;
            return makeLists();
        } else if(length == k){
            return head;
        } else {
            index = list.size() - k;
            return makeLists();
        }
    }

    private ListNode makeLists() {
        if(count == list.size() - 1){
            return new ListNode(list.get(index), null);
        }
        ListNode node = new ListNode();
        node.val = list.get(index);
        count++;
        index++;
        if(index == list.size()){
            index = 0;
        }
        node.next = makeLists();
        return node;
    }

    private void makeList(ListNode node) {
        list.add(node.val);
        if (node.next != null) {
            makeList(node.next);
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2, null);
        ListNode node2 = new ListNode(1, node1);
        ListNode node3 = new ListNode(0, node2);
        System.out.println(new RotateRight_20241003().rotateRight(node3, 4));
    }
}
