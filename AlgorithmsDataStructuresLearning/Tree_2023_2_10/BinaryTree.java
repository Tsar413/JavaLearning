package com.company.javaRelearn.AlgorithmsDataStructuresLearning.Tree_2023_2_10;

import com.company.javaRelearn.AlgorithmsDataStructuresLearning.LinkedList_2023_2_4.Queue;

public class BinaryTree<K extends Comparable<K>,V> {
    private Node root; //根节点
    private int number; //元素的个数

    public int size() {
        return number;
    }

    //向树中添加节点
    public void put(K key,V value) { //向树中插入一个键值对
        root = put(root, key, value);
    }

    //给指定树x上，添加键一个键值对，并返回添加后的新树
    private Node put(Node x, K key, V value) {
        if (x == null) {
            x = new Node(key, value, null, null);
            number++;
            return x;
        } else {
            int index = key.compareTo((K) x.key);
            if (index == 0) {
                x.value = value;
            } else if (index > 0) {
                //递归右子节点
                x.right = put(x.right, key, value);
            } else {
                //递归左子节点
                x.left = put(x.left, key, value);
            }
            return x;
        }
    }

    //根据key，从树中找出对应的值
    public V get(K key) {
        return get(root, key);
    }

    private V get(Node x, K key) {
        if (x == null) {
            return null;
        } else {
            int index = key.compareTo((K) x.key);
            V result;
            if (index == 0) {
                result = (V) x.value;
            } else if(index > 0) {
                result = get(x.right, key);
            } else {
                result = get(x.left, key);
            }
            return result;
        }
    }

    public void delete(K key) {
        root = delete(root, key);
    }

    private Node delete(Node x, K key) {
        if (x == null) {
            return null;
        } else {
            int index = key.compareTo((K) x.key);
            if (index > 0) {
                //新结点的key大于当前结点的key，继续找当前结点的右子结点
                x.right = delete(x.right,key);
            } else if (index < 0) {
                //新结点的key小于当前结点的key，继续找当前结点的左子结点
                x.left = delete(x.left, key);
            } else {
                //新结点的key等于当前结点的key,当前x就是要删除的结点
                if (x.left == null && x.right == null) {
                    //1.如果当前结点的子树不存在，则直接返回当前结点
                    return x;
                } else if (x.left == null && x.right != null) {
                    //2.如果当前结点的左子树不存在，则直接返回当前结点的右子结点
                    return x.right;
                } else if (x.left != null && x.right == null) {
                    //3.如果当前结点的右子树不存在，则直接返回当前结点的左子结点
                    return x.left;
                } else {
                    //4.当前结点的左右子树都存在
                    Node node = x.right;
                    //4.1找到右子树中最小的结点
                    while (node.left.left != null) {
                        node = node.left;
                    }
                    Node newSmallRootNode = node.left;
                    //4.2删除右子树中最小的结点
                    node.left = null;
                    //4.3 接上各个节点
                    newSmallRootNode.left = x.left;
                    newSmallRootNode.right = x.right;
                    //4.4让被删除结点的父节点指向最小结点
                    x = newSmallRootNode;
                    number--;
                }
            }
        }
        return x;
    }

    //最小的键
    public K min() {
        return (K) min(root).key;
    }

    //最小的节点
    private Node min(Node x) {
        if (x == null) {
            return null;
        } else if (x.left == null) {
            return x;
        } else {
            Node result = x.left;
            while (result.left != null) {
                result = result.left;
            }
            return result;
        }
    }

    //寻找最大的键
    public K max() {
        return (K) max(root).key;
    }

    //最大的节点
    public Node max(Node x) {
        if (x == null) {
            return null;
        } else if (x.right == null) {
            return x;
        } else {
            Node result = x.right;
            while (result.right != null) {
                result = result.right;
            }
            return result;
        }
    }

    //前序遍历
    public Queue<K> preErgodic() {
        Queue<K> queue = new Queue<K>();
        preErgodic(root, queue);
        return queue;
    }

    private void preErgodic(Node x,Queue<K> keys) {
        if (x.left == null && x.right == null) {
            keys.enqueue((K) x.key);
        } else if (x.left == null) {
            preErgodic(x.right, keys);
        } else {
            preErgodic(x.left, keys);
        }
    }

    //中序遍历
    public Queue<K> midErgodic() {
        Queue<K> queue = new Queue<K>();
        midErgodic(root, queue);
        return queue;
    }

    private void midErgodic(Node x,Queue<K> keys) {
        if (x.right == null) {
            midErgodic(x.left, keys);
        } else if (x.left == null && x.right == null) {
            keys.enqueue((K) x.key);
        } else {
            midErgodic(x.right, keys);
        }
    }

    //后续遍历
    public Queue<K> afterErgodic() {
        Queue<K> queue = new Queue<K>();
        afterErgodic(root, queue);
        return queue;
    }

    private void afterErgodic(Node x,Queue<K> keys) {
        if (x.left == null) {
            afterErgodic(x.right, keys);
        } else if (x.left == null && x.right == null) {
            keys.enqueue((K) x.key);
        } else {
            afterErgodic(x.left, keys);
        }
    }

    //层序遍历
    public Queue<K> layerErgodic() {
        Queue<K> keys = new Queue<K>();
        Queue<Node> nodes = new Queue<Node>();
        nodes.enqueue(root);
        while (!nodes.isEmpty()) {
            keys.enqueue((K) nodes.dequeue().key);
            if (nodes.dequeue().left != null) {
                nodes.enqueue(nodes.dequeue().left);
            }
            if (nodes.dequeue().right != null) {
                nodes.enqueue(nodes.dequeue().right);
            }
        }
        return keys;
    }
}
