package com.jeng.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (null == root) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int currentLevelSize = queue.size();
            List<Integer> currentValues = new ArrayList<>();
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode treeNode = queue.poll();
                currentValues.add(treeNode.val);
                if (null != treeNode.left) {
                    queue.offer(treeNode.left);
                }
                if (null != treeNode.right) {
                    queue.offer(treeNode.right);
                }
            }
            result.add(currentValues);
        }
        return result;
    }

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
}
