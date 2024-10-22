package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseKGroup_20241014 {
    private List<Integer> list = new ArrayList<>();
    private int index = 0;

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = head;
        List<Integer> tempList = new ArrayList<Integer>();
        int count = 0;
        while (node != null){
            tempList.add(node.val);
            node = node.next;
            count++;
            if(count == k){
                Collections.reverse(tempList);
                list.addAll(tempList);
                count = 0;
                tempList.clear();
            }
        }
        if(tempList.size() > 0){
            list.addAll(tempList);
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
}
