package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.List;

public class IsSubPath_20241230 {
    private static class ListNode {
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

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    private List<List<Integer>> list1 = new ArrayList<List<Integer>>();

    private List<Integer> list2 = new ArrayList<Integer>();

    public boolean isSubPath(ListNode head, TreeNode root) {
        recursiveCore1(root, new ArrayList<Integer>());
        recursiveCore2(head);
        System.out.println(list1);
        System.out.println(list2);
        for (List<Integer> list : list1){
            for (int i = 0; i <= list.size() - list2.size(); i++) {
                List<Integer> list3 = list.subList(i, i + list2.size());
                if(list2.equals(list3)){
                    return true;
                }
            }
        }
        return false;
    }

    private void recursiveCore1(TreeNode node, List<Integer> list){
        if(node.left == null && node.right == null){
            list.add(node.val);
            list1.add(list);
        } else if(node.left != null && node.right == null){
            list.add(node.val);
            recursiveCore1(node.left, new ArrayList<Integer>(list));
        } else if(node.left == null && node.right != null){
            list.add(node.val);
            recursiveCore1(node.right, new ArrayList<Integer>(list));
        } else if(node.left != null && node.right != null) {
            list.add(node.val);
            recursiveCore1(node.left, new ArrayList<Integer>(list));
            recursiveCore1(node.right, new ArrayList<Integer>(list));
        }
    }

    private void recursiveCore2(ListNode node){
        if(node.next == null){
            list2.add(node.val);
        } else {
            list2.add(node.val);
            recursiveCore2(node.next);
        }
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1, null, null);
        TreeNode node2 = new TreeNode(3, null, null);
        TreeNode node3 = new TreeNode(8, node1, node2);
        TreeNode node4 = new TreeNode(6, null, null);
        TreeNode node5 = new TreeNode(2, node4, node3);
        TreeNode node6 = new TreeNode(4, node5, null);
        TreeNode node7 = new TreeNode(1, null, null);
        TreeNode node8 = new TreeNode(2, node7, null);
        TreeNode node9 = new TreeNode(4, null, node8);
        TreeNode node10 = new TreeNode(1, node9, node6);

        ListNode node11 = new ListNode(6, null);
        ListNode node12 = new ListNode(2, node11);
        ListNode node13 = new ListNode(4, node12);
        ListNode node14 = new ListNode(1, node13);

        TreeNode node15 = new TreeNode(2, null, null);
        TreeNode node16 = new TreeNode(1, node15, null);
        TreeNode node17 = new TreeNode(4, node16, null);
        TreeNode node18 = new TreeNode(4, null, null);
        TreeNode node19 = new TreeNode(4, node17, node18);

        ListNode node20 = new ListNode(2, null);
        ListNode node21 = new ListNode(4, node20);

        TreeNode node22 = new TreeNode(9, null, null);
        TreeNode node23 = new TreeNode(10, node22, null);
        TreeNode node24 = new TreeNode(1, null, null);
        TreeNode node25 = new TreeNode(1, node23, node24);
        TreeNode node26 = new TreeNode(1, null, node25);

        ListNode node27 = new ListNode(10, null);
        ListNode node28 = new ListNode(1, node27);

        TreeNode node29 = new TreeNode(1, null, null);
        TreeNode node30 = new TreeNode(2, null, node29);
        TreeNode node31 = new TreeNode(2, null, node30);
        TreeNode node32 = new TreeNode(2, null, node31);

        ListNode node33 = new ListNode(1, null);
        ListNode node34 = new ListNode(2, node33);
        ListNode node35 = new ListNode(2, node34);

        //System.out.println(new IsSubPath_20241230().isSubPath(node14, node10));
        //System.out.println(new IsSubPath_20241230().isSubPath(node21, node19));
        //System.out.println(new IsSubPath_20241230().isSubPath(node28, node26));
        System.out.println(new IsSubPath_20241230().isSubPath(node35, node32));
    }
}
