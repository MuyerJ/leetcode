package com.muyer.Q100_200;

import com.muyer.util.TreeNode;

import java.util.Stack;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/12 18:38
 */
public class Q101_IsSymmetric {

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.levelBuildTree(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        System.out.println(isSymmetric(treeNode));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        //双指针移动方向相反
        TreeNode l = root;
        TreeNode r = root;
        Stack<TreeNode> lStack = new Stack<TreeNode>();
        Stack<TreeNode> rStack = new Stack<TreeNode>();
        while (!lStack.isEmpty() && !rStack.isEmpty() || l != null && r != null) {
            while (l != null && r != null) {
                lStack.add(l);
                l = l.left;
                rStack.add(r);
                r = r.right;
                if (l != null && r == null || l == null && r != null) {
                    return false;
                }
            }
            l = lStack.pop();
            r = rStack.pop();
            if (l.val != r.val) {
                return false;
            }
            l = l.right;
            r = r.left;
        }
        return true;

    }
}
