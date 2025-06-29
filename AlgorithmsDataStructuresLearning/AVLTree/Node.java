package com.company.javaRelearn.AlgorithmsDataStructuresLearning.AVLTree;

public class Node<K, V> {
    public Node left;
    public Node right;
    public K key;
    public V value;

    public Node(Node left, Node right, K key, V value) {
        this.left = left;
        this.right = right;
        this.key = key;
        this.value = value;
    }
}
