package com.muyer.Q1_100;

import java.util.ArrayList;
import java.util.List;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/30 13:28
 */
public class Q22_括号生成 {
    List<String> res = new ArrayList<String>();

    public List<String> generateParenthesis(int n) {
        dfs(n, n, "");
        return res;
    }

    public void dfs(int left, int right, String str) {
        if (left == 0 && right == 0) {
            res.add(str);
            return;
        }
        if (left > 0) {
            dfs(left - 1, right, str + "(");
        }
        if (right > left) {
            dfs(left, right - 1, str + ")");
        }
    }
}
