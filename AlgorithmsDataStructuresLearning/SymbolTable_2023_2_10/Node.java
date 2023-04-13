package com.company.javaRelearn.AlgorithmsDataStructuresLearning.SymbolTable_2023_2_10;

public class Node<K,V> {
    public K key;
    public V value;
    public Node next;

    public Node(K key, V value, Node next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }
}
