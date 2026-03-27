package com.trees;

import com.trees.node.TreeNode;

class LeetcodeSolution {
    public boolean isValidBST(TreeNode root) {
        // We start the range at absolute infinity using Longs
        // to handle the Integer.MIN/MAX edge cases.
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        // Base Case: An empty tree is a valid BST.
        if (node == null) {
            return true;
        }

        // The Guard Rail: Check if the current node violates the law.
        // We use OR (||) because if either rule is broken, the tree is invalid.
        if (node.value <= min || node.value >= max) {
            return false;
        }

        // The Recursive Handshake:
        // Left child: Must be > min, but < current node's value.
        // Right child: Must be > current node's value, but < max.
        return validate(node.left, min, node.value) &&
                validate(node.right, node.value, max);
    }
}
