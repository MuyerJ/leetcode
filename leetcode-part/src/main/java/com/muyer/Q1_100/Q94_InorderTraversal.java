package com.muyer.Q1_100;

import com.muyer.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Description: 
 * date: 2022/8/11 23:20
 * @author YeJiang
 * @version
 */
public class Q94_InorderTraversal {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.buildTree();

        List<Integer> list = inorderTraversal(treeNode);

        for (Integer e : list) {
            System.out.println(e);
        }
    }

    /**
     * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
     * @param root
     * @return
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.poll();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
}
