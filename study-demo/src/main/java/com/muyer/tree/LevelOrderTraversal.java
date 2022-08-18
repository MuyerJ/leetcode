package com.muyer.tree;

import com.muyer.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *@描述
 *@创建人 yejiang 层次
 *@创建时间 2022/8/11 17:24
 */
public class LevelOrderTraversal {

    public static void main(String[] args) {
        TreeNode root = TreeNode.buildTree();
        levelTraversal(root);
    }

    public static void levelTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.println(cur.val);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }


    }
}
