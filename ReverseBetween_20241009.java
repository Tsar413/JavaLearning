package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class ReverseBetween_20241009 {
    private List<Integer> list1 = new ArrayList<Integer>();
    private List<Integer> list2 = new ArrayList<Integer>();
    private List<Integer> list3 = new ArrayList<Integer>();
    private int index1 = 0;
    private int index2 = 0;
    private int index3 = 0;

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = head;
        for (int i = 1; i < left; i++) {
            list1.add(node.val);
            node = node.next;
        }
        for (int i = 0; i <= (right - left); i++) {
            list2.add(node.val);
            node = node.next;
        }
        index2 = list2.size() - 1;
        if(node != null){
            while (node.next != null){
                list3.add(node.val);
                node = node.next;
            }
            list3.add(node.val);
        }


        return makeLists();
    }

    private ListNode makeLists(){
        ListNode node = new ListNode();
        if(index1 < list1.size()){
            node.val = list1.get(index1);
            index1++;
            node.next = makeLists();
        } else if(index2 >= 0){
            node.val = list2.get(index2);
            index2--;
            if(list3.size() == 0 && index2 < 0){
                return node;
            }
            node.next = makeLists();
        } else if(index3 < list3.size()){
            node.val = list3.get(index3);
            index3++;
            if(index3 == list3.size()){
                return node;
            }
            node.next = makeLists();
        }
        return node;
    }

    public static void main(String[] args) {
        ListNode node5 = new ListNode(5, null);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node7 = new ListNode(5, null);
        ListNode node6 = new ListNode(3, node7);

        System.out.println(new ReverseBetween_20241009().reverseBetween(node6, 1, 2));
    }
}
