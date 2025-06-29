package com.company.javaRelearn.AlgorithmsDataStructuresLearning.RedBlackTree;

public class RedBlackTree<K extends Comparable<K>, V> {
    //根节点
    private Node root;
    //记录树中元素的个数
    private int N;
    //红色链接
    private static final boolean RED = true;
    //黑色链接
    private static final boolean BLACK = false;

    /**
     * 判断当前节点的父指向链接是否为红色
     *
     * @param x
     * @return
     */

    private boolean isRed(Node x) {
        //空结点默认是黑色链接
        if (x == null) {
            return false;
        }
        return x.color == RED;
    }

    /**
     * 左旋转
     *
     * @param h
     * @return
     */
    private Node rotateLeft(Node h) {
        Node rightL = h.right;
        Node rightLL = rightL.left;
        h.right = rightLL;
        rightL.left = h;
        rightL.color = h.color;
        h.color = RED;
        return rightL;
    }

    /**
     * 左旋转
     *
     * @param h
     * @return
     */
    private Node rotateRight(Node h) {
        Node leftL = h.left;
        Node leftLL = leftL.right;
        h.left = leftLL;
        leftL.right = h;
        //让当前结点h的color值称为左子结点的color值
        leftL.color = h.color;
        //让当前结点h的color变为RED
        h.color = RED;
        return leftL;
    }

    /**
     * 颜色反转,相当于完成拆分4-节点
     *
     * @param h
     */
    private void flipColors(Node h) {
        //当前结点的color属性值变为RED；
        h.color = RED;
        //当前结点的左右子结点的color属性值都变为黑色
        h.left.color = BLACK;
        h.right.color = BLACK;
    }


    /**
     * 在整个树上完成插入操作
     *
     * @param key
     * @param val
     */
    public void put(K key, V val) {
        put(root, key, val);
        root.color = BLACK;
    }

    /**
     * 在指定树中，完成插入操作,并返回添加元素后新的树
     *
     * @param h
     * @param key
     * @param val
     */
    private Node put(Node h, K key, V val) {
        if (h == null) {
            N++;
            return new Node(null, null, key, val, RED);
        }
        int n = key.compareTo((K) h.key);
        if (n == 0) {
            h.value = val;
        } else if (n > 0) {
            h.right = put(h.right, key, val);
        } else {
            h.left = put(h.left, key, val);
        }
        if (isRed(h.right) && !isRed(h.left)) {
            rotateLeft(h);
        }
        if (isRed(h.left) && isRed(h.left.left)) {
            rotateRight(h);
        }
        if (isRed(h.right) && isRed(h.left)) {
            flipColors(h);
        }
        return h;
    }

    //根据key，从树中找出对应的值
    public V get(K key) {
        return get(root, key);
    }

    //从指定的树x中，查找key对应的值
    public V get(Node x, K key) {
        int n = key.compareTo((K) x.key);
        V result;
        if (n == 0) {
            result = (V) x.value;
        } else if (n > 0) {
            result = get(x.right, key);
        } else {
            result = get(x.left, key);
        }
        return result;
    }
}
