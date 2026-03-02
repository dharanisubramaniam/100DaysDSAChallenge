package com.trees.main;

import com.trees.node.TreeNode;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TreeNode root=new TreeNode(10);
        root.right= new TreeNode(20);
        root.left= new TreeNode(5);


    }

    public static void preOrderTraversal(TreeNode node){
        //pre-order traversal
        if(node==null)return;
        System.out.println(node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);


    }
    public static void postOrderTraversal(TreeNode node){
        //pre-order traversal
        if(node==null)return;
        System.out.println(node.value);
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);


    }
    public static void inOrderTraversal(TreeNode node){
        //pre-order traversal
        if(node==null)return;
        System.out.println(node.value);
        inOrderTraversal(node.left);
        inOrderTraversal(node.right);


    }


}
