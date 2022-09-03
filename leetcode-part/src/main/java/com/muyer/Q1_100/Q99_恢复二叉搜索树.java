package com.muyer.Q1_100;

import com.muyer.util.TreeNode;

import java.util.*;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/26 13:10
 */
public class Q99_恢复二叉搜索树 {
    public void recoverTree(TreeNode root) {
        //收集所有节点，并且排好序
        List<Integer> list = new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            list.add(cur.val);
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
        Collections.sort(list);
        //中序遍历赋值
        int index = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.add(root);
                root = root.left;
            }
            root = stack.pop();
            root.val = list.get(index++);
            root = root.right;
        }
    }
}
