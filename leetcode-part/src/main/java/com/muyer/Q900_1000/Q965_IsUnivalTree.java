package com.muyer.Q900_1000;

import com.muyer.util.TreeNode;

import java.util.LinkedList;

/**
 * Description: 
 * date: 2022/8/11 23:30
 * @author YeJiang
 * @version
 */
public class Q965_IsUnivalTree {
    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        System.out.println(isUnivalTree(root));
    }


    /**
     * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
     * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
     * @param root
     * @return
     */
    public static boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }

        boolean firstFlag = true;
        int value = 0;

        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.poll();
            if (firstFlag) {
                value = cur.val;
                firstFlag = false;
            }
            if (value != cur.val) {
                return false;
            }

            cur = cur.right;
        }

        return true;
    }
}
