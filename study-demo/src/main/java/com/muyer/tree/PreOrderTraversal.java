package com.muyer.tree;

import com.muyer.node.TreeNode;

import java.util.*;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/9 12:57
 */
public class PreOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        preOrder1(root);
        System.out.println("===========");
        preOrder2(root);

    }

    public static void preOrder1(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        //先打印
        System.out.println(treeNode.val);
        //遍历左子树
        preOrder1(treeNode.left);
        //遍历右子树
        preOrder1(treeNode.right);
    }

    /**
     * 向左遍历 一直入栈，直到没有左，出栈
     * 把最左的右孩子继续重复
     *
     *
     * @param treeNode
     */
    public static void preOrder2(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        List<TreeNode> list = new ArrayList<TreeNode>();
        TreeNode cur = treeNode;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                list.add(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
        for (TreeNode node : list) {
            System.out.println(node.val);
        }
    }
}
