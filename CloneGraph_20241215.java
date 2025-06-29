package com.company.javaRelearn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CloneGraph_20241215 {
    private Map<Integer, Node> map = new HashMap<Integer, Node>();

    public Node cloneGraph(Node node) {

        return recursiveCore(node);
    }

    private Node recursiveCore(Node node){
        if(node == null){
            return null;
        }
        if(map.containsKey(node.val)){
            return map.get(node.val);
        }
        Node node1 = new Node();
        node1.val = node.val;
        map.put(node.val, node1);
        for (Node n : node.neighbors){
            node1.neighbors.add(recursiveCore(n));
        }
        map.put(node.val, node1);
        return node1;
    }

    static class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }
}
