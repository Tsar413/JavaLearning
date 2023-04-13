package com.company.javaRelearn.AlgorithmsDataStructuresLearning.SymbolTable_2023_2_10;

public class SymbolTable<K,V> {
    public Node head;
    public int tableLength;

    public SymbolTable() {
        this.head = new Node(null,null,null);
        this.tableLength = 0;
    }

    public int size(){
        return tableLength;
    }

    public void put(K key, V value) {
        int n = -1;
        Node node = head;

        for (int i = 0; node.next != null ; i++) {
            node = node.next;
            if (node.key.equals(key)) {
                n = i;
                node.value = value;
                break;
            }
        }

        if (n == -1) {
            Node newNode = new Node(key, value, null);
            node.next = newNode;
            tableLength++;
        }
    }

    public void delete(K key) {
        Node node = head;

        while (node.next != null) {
            if (node.next.key.equals(key)) {
                node.next = node.next.next;
                tableLength--;
                break;
            }
            node = node.next;
        }

    }

    public V get(K key) {
        Node node = head;

        while (node.next != null) {
            node = node.next;
            if (node.key.equals(key)) {
                return (V) node.value;
            }
        }
        return null;
    }
}
