package com.muyer.tree;

import com.muyer.node.TreeNode;

/**
 * Description: 
 * date: 2022/8/13 12:31
 * @author YeJiang
 * @version
 */
public class LeastAncestor {

    public static void main(String[] args) {
        //    1
        //   2 3
        //  4 5
        TreeNode treeNode = TreeNode.levelBuildTree(new Integer[]{1, 2, 3, 4, 5});
        System.out.println(getLeastAncestor(treeNode, treeNode.left.left, treeNode.right).val);
        System.out.println(getLeastAncestor(treeNode, treeNode.left.left, treeNode.left).val);
        System.out.println(getLeastAncestor(treeNode, treeNode.left.left, treeNode.left.right).val);
    }

    //给定两个二叉树的节点node1和node2，找到他们最低的公共祖先
    public static TreeNode getLeastAncestor(TreeNode root, TreeNode node1, TreeNode node2) {
        if (root == null || root == node1 || root == node2) {
            return root;
        }
        TreeNode left = getLeastAncestor(root.left, node1, node2);
        TreeNode right = getLeastAncestor(root.right, node1, node2);
        if (left != null && right != null) {
            return root;
        }
        return left != null ? left : right;
    }
}
