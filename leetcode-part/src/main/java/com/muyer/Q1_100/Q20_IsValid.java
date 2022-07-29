package com.muyer.Q1_100;

import java.util.Stack;

/**
 * @描述
 * @创建人 yejiang
 * @创建时间 2022/7/26 13:55
 */

//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
// 有效字符串需满足：
// 左括号必须用相同类型的右括号闭合。
// 左括号必须以正确的顺序闭合。
// 示例 1：
//输入：s = "()"
//输出：true
// 示例 2：
//输入：s = "()[]{}"
//输出：true
// 示例 3：
//输入：s = "(]"
//输出：false
// 示例 4：
//输入：s = "([)]"
//输出：false
// 示例 5：
//输入：s = "{[]}"
//输出：true
// 提示：
// 1 <= s.length <= 10⁴
// s 仅由括号 '()[]{}' 组成

public class Q20_IsValid {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("]"));
    }

    public static boolean isValid(String s) {
        char x1 = '{', x2 = '[', x3 = '(';
        char x4 = '}', x5 = ']', x6 = ')';
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (curChar == x1 || curChar == x2 || curChar == x3) {
                stack.push(curChar);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character popChar = stack.pop();
                if (popChar == null) {
                    return false;
                }
                if (curChar == x4 && x1 != popChar) {
                    return false;
                }
                if (curChar == x5 && x2 != popChar) {
                    return false;
                }
                if (curChar == x6 && x3 != popChar) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
