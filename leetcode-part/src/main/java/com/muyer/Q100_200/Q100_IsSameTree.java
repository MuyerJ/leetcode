package com.muyer.Q100_200;

import com.muyer.util.TreeNode;

/**
 * Description: 
 * date: 2022/8/11 23:37
 * @author YeJiang
 * @version
 */
public class Q100_IsSameTree {

    public static void main(String[] args) {
        TreeNode p = TreeNode.buildTree();
        TreeNode q = TreeNode.buildTree();
        System.out.println(isSameTree(p, q));

    }


    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}
