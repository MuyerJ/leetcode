package com.muyer.util;

import java.util.LinkedList;
import java.util.Queue;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/9 12:55
 */
public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        TreeNode treeNode = levelBuildTree(new Integer[]{1, null, 2, null, null, 5});
        System.out.println(treeNode);
    }

    /**
     * 数组创建二叉树
     * @param array
     * @return
     */
    public static TreeNode levelBuildTree(Integer[] array) {
        TreeNode root = new TreeNode(array[0]);
        TreeNode p = root;

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        int i = 0;
        while (p != null || !queue.isEmpty()) {
            //左边
            if ((2 * i + 1) < array.length && p != null) {
                p.left = array[2 * i + 1] == null ? null : new TreeNode(array[2 * i + 1]);
                queue.add(p.left);
            }
            //右边
            if ((2 * i + 2) < array.length && p != null) {
                p.right = array[2 * i + 2] == null ? null : new TreeNode(array[2 * i + 2]);
                queue.add(p.right);
            }
            p = queue.poll();
            i++;
        }
        return root;
    }

    public static TreeNode buildTree() {
        /**
         *
         *       r1
         *     r2   r3
         *   r4 r5 r6 r7
         */
        TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);
        TreeNode r7 = new TreeNode(7);
        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;
        r3.left = r6;
        r3.right = r7;
        return r1;
    }
}
