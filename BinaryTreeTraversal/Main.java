package com.trees.main;

import com.trees.node.TreeNode;

public class Main {

    public static void main(String[] args) {
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
        //post-order traversal
        if(node==null)return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
		System.out.println(node.value);


    }
    public static void inOrderTraversal(TreeNode node){
        //In-order traversal
        if(node==null)return;
        inOrderTraversal(node.left);
		System.out.println(node.value);
        inOrderTraversal(node.right);


    }


}
