package com.company.javaRelearn.AlgorithmsDataStructuresLearning.AVLTree;

public class AVLTree<K extends Comparable<K>, V> {
    //根节点
    private Node root;
    //记录树中元素的个数
    private int N;

    /**
     * 左旋转
     *
     * @param h
     * @return
     */
    private Node rotateLeft(Node h) {
        Node rightL = h.left;
        Node rightLLeftLL = rightL.left;
        rightL.left = h;
        h.right = rightLLeftLL;
        return rightL;
    }

    /**
     * 右旋转
     *
     * @param h
     * @return
     */
    private Node rotateRight(Node h) {
        Node leftL = h.left;
        Node leftLRightLL = leftL.right;
        leftL.right = h;
        h.left = leftLRightLL;
        return leftL;
    }

    /**
     * 左右旋转
     *
     * @param h
     * @return
     */
    private Node rotateLeftRight(Node h) {
        h.left = rotateLeft(h.left);
        return rotateRight(h);
    }

    /**
     * 右左旋转
     *
     * @param h
     * @return
     */
    private Node rotateRightLeft(Node h) {
        h.right = rotateRight(h.right);
        return rotateLeft(h);
    }
}
