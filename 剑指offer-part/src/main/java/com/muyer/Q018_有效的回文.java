package com.muyer;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * date: 2022/8/11 0:00
 * @author YeJiang
 * @version
 */
public class Q018_有效的回文 {
    public static void main(String[] args) {

    }

    /**
     * 给定一个字符串 s ，验证 s 是否是 回文串 ，只考虑字母和数字字符，可以忽略字母的大小写。
     *
     * 本题中，将空字符串定义为有效的 回文串 。
     *
     * @param s
     * @return
     */
    public static boolean isPalindrome(String s)  {
        if(s == null || s.length()==0 || s.length()==1){
            return true;
        }
        List<Character> chars = new ArrayList<Character>();
        for(int i = 0 ; i<s.length() ;i++){
            char c = s.charAt(i);
            if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9'){
                if(c >= 'a' && c <= 'z'){
                    c = (char)(c - 32);
                }
                chars.add(c);
            }
        }
        int left = 0;
        int right = chars.size()-1;
        while(left < right){
            if(chars.get(left) != chars.get(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
