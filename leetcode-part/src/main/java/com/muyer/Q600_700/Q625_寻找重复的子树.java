package com.muyer.Q600_700;

import com.muyer.util.TreeNode;

import java.util.*;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/9/5 12:19
 */
public class Q625_寻找重复的子树 {
    Map<String,Integer> countMap = new HashMap<>();
    Set<TreeNode> set = new HashSet<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        dfs(root);
        return new ArrayList<>(set);
    }

    public String dfs(TreeNode root){
        if(root == null){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(root.val);
        sb.append("(");
        sb.append("(");
        sb.append(dfs(root.left));
        sb.append(")");
        sb.append("(");
        sb.append(dfs(root.right));
        sb.append(")");
        sb.append(")");
        String serial = sb.toString();
        if(countMap.containsKey(serial)){
            int count = countMap.get(serial);
            if( count == 1){
                set.add(root);
            }
            countMap.put(serial,count+1);
        } else {
            countMap.put(serial,1);
        }
        return serial;

    }
}
