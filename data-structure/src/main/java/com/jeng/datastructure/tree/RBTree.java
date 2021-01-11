package com.jeng.datastructure.tree;

import java.util.Comparator;

public class RBTree<T> {

    private TreeNode<T> root;

    private long size;

    private Comparator<T> comparator;


    /**
     * 插入元素
     * @param value
     */
    public void insert(T value){
        TreeNode<T> newNode = new TreeNode<>(value, null, true, null, null);

        // 根节点
        if (null == root) {
            root = newNode;
            balanceInsertion(newNode);
            return;
        } else {
            // 找到位置,插入
            TreeNode<T> cur = root;
            while (null != cur) {
                if (comparator.compare(value, cur.value) < 0) {
                    if (cur.left == null) {
                        cur.left = newNode;
                        newNode.parent = cur;
                        balanceInsertion(newNode);
                        size++;
                        return;
                    } else {
                        cur = cur.left;
                    }
                } else {
                    if (cur.right == null) {
                        cur.right = newNode;
                        newNode.parent = cur;
                        balanceInsertion(newNode);
                        size++;
                        return;
                    } else {
                        cur = cur.right;
                    }
                }
            }
        }
    }

    private void balanceInsertion(TreeNode<T> newNode) {

    }

    /**
     * 删除元素
     * @param value
     */
    public void delete(T value) {

    }

    /**
     * 判断元素是否存在
     * @param value
     * @return
     */
    public boolean exits(T value) {
        return false;
    }

    /**
     * 获取最小值
     * @return
     */
    public T findMin(){
        TreeNode<T> cur = root;
        while (null != cur){

        }
        return null;
    }

    /**
     * 获取最大值
     * @return
     */
    public T findMax(){

        return null;
    }

    private class TreeNode<T>{
        private T value;
        private TreeNode<T> parent;
        private boolean isRed;
        private TreeNode<T> left;
        private TreeNode<T> right;

        public TreeNode(T value, TreeNode<T> parent, boolean isRed, TreeNode<T> left, TreeNode<T> right) {
            this.value = value;
            this.parent = parent;
            this.isRed = isRed;
            this.left = left;
            this.right = right;
        }
    }
}
