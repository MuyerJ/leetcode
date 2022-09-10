package com.muyer.Q600_700;

import com.muyer.util.TreeNode;

/**
 * Description: 
 * date: 2022/9/10 10:28
 * @author YeJiang
 * @version
 */
public class Q669_修剪二叉搜索树 {
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        if (root.val < low) {
            return root.right != null ?
                    trimBST(root.right, low, high) :
                    null;
        }
        if (root.val > high) {
            return root.left != null ?
                    trimBST(root.left, low, high) :
                    null;
        }
        root.left = trimBST(root.left, low, high);
        root.right = trimBST(root.right, low, high);
        return root;
    }
}
