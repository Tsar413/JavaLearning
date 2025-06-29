package com.company.javaRelearn.AlgorithmsDataStructuresLearning.RedBlackTree;

public class Node<K, V> {
    public Node left;
    public Node right;
    public K key;
    public V value;
    public boolean color;

    public Node(Node left, Node right, K key, V value, boolean color) {
        this.left = left;
        this.right = right;
        this.key = key;
        this.value = value;
        this.color = color;
    }
}
