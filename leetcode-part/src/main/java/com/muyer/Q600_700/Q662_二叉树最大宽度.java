package com.muyer.Q600_700;

import com.muyer.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Description: 
 * date: 2022/8/27 23:14
 * @author YeJiang
 * @version
 */
public class Q662_二叉树最大宽度 {

    public int widthOfBinaryTree(TreeNode root) {
        int max = 0;
        Queue<R> queue = new LinkedList<R>();
        queue.add(new R(root,1));
        while(!queue.isEmpty()){
            int size = queue.size();
            List<R> list = new ArrayList<R>();
            for(int i=0 ; i<size ; i++){
                R r = queue.poll();
                list.add(r);
                int index = r.index;
                TreeNode cur = r.node;
                if(cur.left!=null){
                    queue.add(new R(cur.left,2*index));
                }
                if(cur.right!=null){
                    queue.add(new R(cur.right,2*index+1));
                }
            }
            max = Math.max(max,list.size()>=2 ?
                    list.get(list.size()-1).index - list.get(0).index+1
                    :
                    1);
        }
        return max;
    }

    class R{
        int index;
        TreeNode node;
        public R(TreeNode node,int index){
            this.index = index;
            this.node = node;
        }
    }
}
