package com.company.javaRelearn;

public class IsSubtree_20240804 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        return recursiveCore(root, subRoot);
    }

    private boolean recursiveCore(TreeNode root, TreeNode subRoot){
        if(root.val == subRoot.val){
            boolean flag = judge(root, subRoot);
            if(flag){
                return true;
            }
        } else {
            if(root.left == null && root.right == null){
                return false;
            } else if(root.left != null && root.right == null){
                return recursiveCore(root.left, subRoot);
            } else if(root.left == null && root.right != null){
                return recursiveCore(root.right, subRoot);
            } else if(root.left != null && root.right != null){
                return recursiveCore(root.left, subRoot) || judge(root.right, subRoot);
            }
        }
        return false;
    }

    private boolean judge(TreeNode root, TreeNode subRoot){
        if(root.val != subRoot.val){
            return false;
        }
        if((root.left == null && root.right == null && subRoot.left == null && subRoot.right == null) ||
                (root.left != null && root.right == null && subRoot.left != null && subRoot.right == null) ||
                (root.left == null && root.right != null && subRoot.left == null && subRoot.right != null) ||
                (root.left != null && root.right != null && subRoot.left != null && subRoot.right != null)){
            if(root.left == null && root.right == null){
                return true;
            } else if(root.left != null && root.right == null){
                return judge(root.left, subRoot.left);
            } else if(root.left == null && root.right != null){
                return judge(root.right, subRoot.right);
            } else if(root.left != null && root.right != null){
                return judge(root.left, subRoot.left) && judge(root.right, subRoot.right);
            }
        }
        return false;
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

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1, null, null);
        TreeNode node6 = new TreeNode(0, null, null);
        TreeNode node2 = new TreeNode(2, node6, null);
        TreeNode node3 = new TreeNode(4, node1, node2);
        TreeNode node4 = new TreeNode(5, null, null);
        TreeNode node5 = new TreeNode(3, node3, node4);
        TreeNode node7 = new TreeNode(2, null, null);
        TreeNode node8 = new TreeNode(4, node1, node7);

        TreeNode node9 = new TreeNode(1, null, null);
        TreeNode node10 = new TreeNode(1, node9, null);
        System.out.println(new IsSubtree_20240804().isSubtree(node10, node9));
    }
}
