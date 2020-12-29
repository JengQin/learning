package com.jeng.leetcode.tree;


import java.util.ArrayList;
import java.util.List;

public class PreorderTraversal {
    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if (null == root) {
            return list;
        }
        // 访问节点
        list.add(root.val);

        // 遍历左子节点和右子节点
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
