package com.jeng.datastructure.tree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree<T> {

    private Node<T> root;

    private Comparator<T> comparator;

    private int size;

    public BinarySearchTree(T data) {
        this.root = new Node<>(data);
        size++;
    }

    public BinarySearchTree() {

    }

    // 插入
    public void insert(T value) {
        if (null == root) {
            root = new Node<>(value);
            return;
        }

        Node<T> cur = root;
        while (null != cur) {
            if (comparator.compare(cur.data, value) > 0) {
                if (cur.right == null) {
                    cur.right = new Node<>(value);
                    return;
                }
                cur = cur.right;
            } else {
                if (cur.left == null) {
                    cur.left = new Node<>(value);
                    return;
                }
                cur = cur.left;
            }
        }
    }

    public List<T> inorderTraversal() {
        Stack<Node<T>> stack = new Stack<>();
        List<T> result = new ArrayList<>();

        Node<T> cur = root;
        stack.push(cur);
        while (!stack.isEmpty()) {
            cur = stack.peek();
            while (cur.left != null) {
                stack.push(cur.left);
                cur = cur.left;
            }
            cur = stack.pop();
            // 访问节点
            result.add(cur.data);
            if (cur.right != null) {
                stack.push(cur.right);
            }
        }
    }

    // 查找——按索引
    // 查找——按值
    // 删除——按索引
    // 删除——按值

    private class Node<T> {
        private T data;
        private Node<T> parent;
        private Node<T> left;
        private Node<T> right;

        Node(T data) {
            this.data = data;
        }
    }
}
