package com.trees.node;

public class TreeNode {
    public long value;
    public TreeNode right;
    public TreeNode left;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode(int value, TreeNode right, TreeNode left) {
        this.value = value;
        this.right = right;
        this.left = left;
    }



}
