package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class DeleteDuplicates_20241011 {
    private List<Integer> list = new ArrayList<Integer>();
    private int index = 0;

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        int flag1 = -101;
        boolean flag2 = false;
        while (node != null){
            if(node.val == flag1 && !flag2){
                list.remove(list.size() - 1);
                flag2 = true;
            } else if(node.val == flag1 && flag2){

            } else {
                list.add(node.val);
                flag1 = node.val;
                flag2 = false;
            }
            node = node.next;
        }
        if(list.isEmpty()){
            return null;
        }
        return makeLists();
    }

    private ListNode makeLists(){
        if(index == list.size() - 1){
            return new ListNode(list.get(index), null);
        }
        ListNode node = new ListNode(list.get(index), null);
        index++;
        node.next = makeLists();
        return node;
    }

    public static void main(String[] args) {
        ListNode node7 = new ListNode(5, null);
        ListNode node6 = new ListNode(4, node7);
        ListNode node5 = new ListNode(4, node6);
        ListNode node4 = new ListNode(3, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode node8 = new ListNode(1, null);
        ListNode node9 = new ListNode(1, node8);

        System.out.println(new DeleteDuplicates_20241011().deleteDuplicates(node9));
    }
}
