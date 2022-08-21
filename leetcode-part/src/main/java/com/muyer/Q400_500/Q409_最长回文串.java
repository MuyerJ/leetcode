package com.muyer.Q400_500;

import java.util.Arrays;

/**
 * Description:
 *  给定一个包含大写字母和小写字母的字符串 s ，返回 通过这些字母构造成的 最长的回文串 。
 * date: 2022/8/21 10:09
 * @author YeJiang
 * @version
 */
public class Q409_最长回文串 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("ab"));
        System.out.println(isPalindrome("aba"));
        System.out.println(longestPalindrome("abccccdd"));
    }

    public static int longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int size = 0;
        boolean flag = false;
        int index = 0;
        while (index < s.length() - 1) {
            if (chars[index] == chars[index + 1]) {
                index = index + 2;
                size = size + 2;
            } else {
                index++;
                flag = true;
            }
        }
        if (flag || s.length() % 2 == 1) {
            size++;
        }
        return size;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
