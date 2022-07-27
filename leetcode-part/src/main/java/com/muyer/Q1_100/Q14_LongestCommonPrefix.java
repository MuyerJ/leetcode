package com.muyer.Q1_100;

/**
 * @描述
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1：
 *
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 *
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * @创建人 yejiang
 * @创建时间 2022/7/26 13:17
 */
public class Q14_LongestCommonPrefix {

    public static void main(String[] args) {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println(result);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs[0].length(); i++) {
            char curChar = strs[0].charAt(i);
            //后续所有第i位字符都一样
            boolean isAllSame = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() - 1 < i || strs[j].charAt(i) != curChar) {
                    isAllSame = false;
                }
            }
            if (isAllSame) {
                sb.append(curChar);
            } else {
                break;
            }
        }
        return sb.toString();
    }
}
