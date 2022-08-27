package com.muyer.Q100_200;

import com.muyer.util.TreeNode;

/**
 * Description: 
 * date: 2022/8/28 0:25
 * @author YeJiang
 * @version
 */
public class Q108_数组转为二叉搜索树 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length  == 1){
            return new TreeNode(nums[0]);
        }
        return build(nums,0,nums.length-1);
    }

    public TreeNode build(int[] nums,int left,int right){
        if((right - left) == 1){
            return new TreeNode(nums[left],null,new TreeNode(nums[right]));
        }
        if((right - left) == 0){
            return new TreeNode(nums[left]);
        }
        int mid = (right + left)/2;
        //System.out.print(mid+"@");
        TreeNode root = new TreeNode(nums[mid]);
        root.left = build(nums,left,mid-1);
        root.right = build(nums,mid+1,right);
        return root;
    }
}
