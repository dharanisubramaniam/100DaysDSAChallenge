package com.trees.main;

import com.trees.node.TreeNode;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        List<List<Integer>> list = levelOrderTraversalTwo(root);
        System.out.println(list);


    }

    //my intial version- whwre the list is flat without inner loop
    public static List<List<Integer>> levelOrderTraversal(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();

        if (root == null) return finalList;
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode temp = null;

        //System.out.println("queue:"+queue);
        queue.add(root);
        System.out.println("queue:" + queue);
        while (!queue.isEmpty()) {
            temp = queue.poll();
            List<Integer> list = new ArrayList<>();
            list.add(temp.value);
            System.out.println("list:" + list);
            finalList.add(list);
            if (temp.left != null || temp.right != null) {
                queue.add(temp.left);
                System.out.println("queue after left:" + queue);
                queue.add(temp.right);
                System.out.println("queue after right:" + queue);
            }

        }


        return finalList;
    }

    //efficient version with inner loop using queue.size()
    public static List<List<Integer>> levelOrderTraversalTwo(TreeNode root) {
        List<List<Integer>> finalList = new ArrayList<>();

        if (root == null) return finalList;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size(); // 1. SNAPSHOT: How many are on this level?
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) { // 2. INNER LOOP: Only process this level
                TreeNode temp = queue.poll();
                list.add(temp.value);

                // 3. ADD CHILDREN: They wait in the queue for the NEXT level
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }

            finalList.add(list); // 4. ADD THE WHOLE FLOOR AT ONCE

        }
        return finalList;

    }
}
