package com.muyer.tree;

import com.muyer.node.ListNode;
import com.muyer.node.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/9 12:57
 */
public class InOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        inOrder1(root);
        System.out.println("==========================");
        inOrder2(root);

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
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
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

    //中序遍历
    public static void inOrder3(TreeNode root) {
        if (root == null) {
            return;
        }
        LinkedList<ListNode> stack = new LinkedList<ListNode>();

    }
}
