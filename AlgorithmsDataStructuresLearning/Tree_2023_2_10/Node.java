package com.company.javaRelearn.AlgorithmsDataStructuresLearning.Tree_2023_2_10;

public class Node<K,V> {
    public K key;
    public V value;
    public Node left;
    public Node right;

    public Node(K key, V value, Node left, Node right) {
        this.key = key;
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
