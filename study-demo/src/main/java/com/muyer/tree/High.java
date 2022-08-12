package com.muyer.tree;

import com.muyer.node.TreeNode;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/12 17:22
 */
public class High {
    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.buildTree();
        System.out.println(getHigh1(treeNode));
    }

    public static int getHigh1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = getHigh1(root.left);
        int rh = getHigh1(root.right);
        return Math.max(lh, rh) + 1;
    }

}
