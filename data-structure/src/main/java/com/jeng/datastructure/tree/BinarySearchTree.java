package com.jeng.datastructure.tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree<T> {

    private Node<T> root;

    private Comparator<T> comparator;

    private int size;

    public BinarySearchTree(T data, Comparator<T> comparator) {
        this.root = new Node<>(data);
        this.comparator = comparator;
        size++;
    }

    public BinarySearchTree(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    /**
     * 插入
     * @param value
     */
    public void insert(T value) {
        if (null == root) {
            root = new Node<>(value);
            return;
        }

        Node<T> cur = root;
        while (null != cur) {
            if (comparator.compare(value, cur.data) > 0) {
                if (cur.right == null) {
                    cur.right = new Node<>(value);
                    size++;
                    return;
                }
                cur = cur.right;
            } else {
                if (cur.left == null) {
                    cur.left = new Node<>(value);
                    size++;
                    return;
                }
                cur = cur.left;
            }
        }
    }

    /**
     * 中序遍历
     *
     * @return
     */
    public List<T> inorderTraversal() {
        Stack<Node<T>> stack = new Stack<>();
        List<T> result = new ArrayList<>();

        Node<T> cur = root;
        while (cur !=null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            // 访问节点
            result.add(cur.data);

            cur = cur.right;
        }
        return result;
    }

    /**
     * 使用递归进行中序遍历
     *
     * @return
     */
    public List<T> inorderTraversalByRecursion() {
        List<T> result = new ArrayList<>();
        inorderRecursion(root, result);
        return result;
    }

    private void inorderRecursion(Node<T> root, List<T> result) {
        if (null == root) {
            return;
        }
        inorderRecursion(root.left, result);
        result.add(root.data);
        inorderRecursion(root.right, result);
    }

    // 查找——按索引
    // 查找——按值
    // 删除——按索引
    // 删除——按值

    public void setComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public Node<T> getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    private class Node<T> {
        private T data;
        private Node<T> parent;
        private Node<T> left;
        private Node<T> right;

        Node(T data) {
            this.data = data;
        }
    }


    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1>o2 ? 1 : o1.equals(o2) ? 0 : -1;
            }
        });
        bst.insert(3);
        bst.insert(2);
        bst.insert(1);
        bst.insert(4);
        bst.insert(46);
        bst.insert(23);
        bst.insert(10);
        bst.insert(55);

        List<Integer> result1 = bst.inorderTraversal();
        List<Integer> result2 = bst.inorderTraversalByRecursion();
        System.out.println(result1);
        System.out.println(result2);
    }
}
