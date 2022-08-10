package com.muyer.tree;

import com.muyer.node.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/9 12:57
 */
public class InOrderTraversal {

    public static void main(String[] args) {
        /**
         *
         *       r1
         *     r2   r3
         *   r4    r5
         */
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r3.left = r5;

        inOrder1(r1);
        System.out.println("==========================");
        inOrder2(r1);

    }

    public static void inOrder1(TreeNode root) {
        if (root == null) {
            return;
        }
        //中序遍历左子树
        inOrder1(root.left);

        System.out.println(root.val);

        //中序遍历右子树
        inOrder1(root.right);
    }


    public static void inOrder2(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<TreeNode>();
        //根节点不为null 或 栈不为null
        while (root != null || !stack.isEmpty()) {
            //左子树入栈
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            //栈顶是最左节点
            root = stack.pop();
            System.out.println(root.val);
            root = root.right;
        }
    }
}
