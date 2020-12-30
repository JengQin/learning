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
        Node<T> newNode = new Node<>(value);
        if (null == root) {
            root = newNode;
            return;
        }

        Node<T> cur = root;
        while (null != cur) {
            if (comparator.compare(value, cur.data) > 0) {
                if (cur.right == null) {
                    newNode.parent = cur;
                    cur.right = newNode;
                    size++;
                    return;
                }
                cur = cur.right;
            } else {
                if (cur.left == null) {
                    newNode.parent = cur;
                    cur.left = newNode;
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
     * 按值查找
     *
     * */
    public  Node<T> find(T val){
        Node<T> cur = root;
        while (null != cur) {
            if (cur.data.equals(val)) {
                return cur;
            } else if (comparator.compare(val, cur.data) > 0) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        return null;
    }

    public T findMin(){
        Node<T> cur = root;
        while (null != cur.left) {
            cur = cur.left;
        }
        return cur.data;
    }

    public T findMax() {
        Node<T> cur = root;
        while (null != cur.right) {
            cur = cur.right;
        }
        return cur.data;
    }

    /**
     * 1.要删除的t节点下没有其他子节点（即要删除的是叶子节点）
     * 2.要删除的t节点下有一个子节点——将t的父节点和子节点对接（左or右）
     * 3.要删除的t节点下由两个子节点——将t的父节点和右节点对接（左or右），将t的左子树对接到右子树最小节点的左子节点
     * */
    public boolean delete(T val) {
        Node<T> cur = root;
        // 查找节点 —— Node<T> tNode = find(val);
        while (cur != null) {
            if (cur.data.equals(val)) {
                break;
            } else if (comparator.compare(val, cur.data) > 0) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        // 判断是否存在
        if (null == cur) {
            return false;
        }

        Node<T> p = cur.parent;
        // 要删除的叶子节点
        if (cur.left == null && cur.right == null) {
            if (null == p) {// 跟节点
                root = null;
            } else if (cur == p.left) {
                p.left = null;
            } else if (cur == p.right) {
                p.right = null;
            }
        } else if (cur.left != null && cur.right != null) {
            Node<T> minNode = cur.right;
            while (minNode.left != null) {
                minNode = minNode.left;
            }
            minNode.left = cur.left;
            cur.left.parent = minNode;

            if (p == null) {// 根节点
                root = cur.right;
            } else if (cur == p.left) {
                p.left = cur.right;
            } else if (cur == p.right) {
                p.right = cur.right;
            }
            cur.right.parent = p;
        } else {
            if (cur.left != null) {
                if (p == null) {// 根节点
                    root = cur.left;
                } else if (cur == p.left) {
                    p.left = cur.left;
                } else if (cur == p.right) {
                    p.right = cur.left;
                }
                cur.left.parent = p;
            } else {
                if (p == null) {// 根节点
                    root = cur.right;
                } else if (cur == p.left) {
                    p.left = cur.right;
                } else if (cur == p.right) {
                    p.right = cur.right;
                }
                cur.right.parent = p;
            }
        }
        size--;
        return true;
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

    public void setComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public Node<T> getRoot() {
        return root;
    }

    public int getSize() {
        return size;
    }

    private static class Node<T> {
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
        bst.insert(4);
        bst.insert(46);
        bst.insert(23);
        bst.insert(10);
        bst.insert(55);

        List<Integer> result1 = bst.inorderTraversal();
        System.out.println(result1);

        Node<Integer> targetNode =  bst.find(4);
        System.out.println(targetNode.data);

        System.out.println("min=" + bst.findMin());
        System.out.println("max=" + bst.findMax());
        System.out.println(bst.root.data);

        bst.delete(2);
        List<Integer> result2 = bst.inorderTraversal();
        System.out.println(result2);

    }
}
