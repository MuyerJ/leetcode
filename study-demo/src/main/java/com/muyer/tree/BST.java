package com.muyer.tree;

import com.muyer.node.TreeNode;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/11 18:21
 */
public class BST {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.buildTree();
        System.out.println(isBalanced(treeNode));
    }

    public static boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        ReturnData data = check(root);
        return data.balance;
    }

    public static ReturnData check(TreeNode root){
        if(root == null){
            return new ReturnData(0,true);
        }
        ReturnData leftData = check(root.left);
        ReturnData rightData = check(root.right);
        return new ReturnData(
                Math.max(leftData.height,rightData.height)+1,
                Math.abs(leftData.height-rightData.height)<=1 && leftData.balance && rightData.balance
        );
    }

    static class ReturnData{
        public int height;
        public boolean balance;
        public ReturnData(int height,boolean balance){
            this.height = height;
            this.balance = balance;
        }
    }
}
