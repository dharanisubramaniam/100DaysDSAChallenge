package com.trees.main;

import com.trees.node.TreeNode;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left=new TreeNode(3);
        root.right.right = new TreeNode(6);
        long max=Long.MAX_VALUE;
        long min = Long.MIN_VALUE;
        boolean isBt = validateBinaryTreeTwo(root,min,max);
        System.out.println("Output:"+isBt);


    }



    //my version-validate binary tree
    public static boolean validateBinaryTree(TreeNode root,Long min,Long max) {
       if (root == null) return true;
       boolean isValid=true;
       if(root.value>=min && root.value<=max){
           System.out.println("value of node:"+root.value);

                validateBinaryTree(root.left,Math.min(min,root.value),root.value);
                validateBinaryTree(root.right,root.value,Math.max(max,root.value));

        }else{
           System.out.println("inside else:"+root.value);
           isValid=false;
        }
        return isValid;

    }
   //efficient version
    public static boolean validateBinaryTreeTwo(TreeNode root,Long min,Long max) {
        if (root == null) return true;
        if(root.value<=min || root.value>=max){
           return false;
        }
        return validateBinaryTree(root.left,min,root.value)&&validateBinaryTree(root.right,root.value,max);
    }


}
