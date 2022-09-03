package com.muyer.Q900_1000;

/**
 * Description: 
 * date: 2022/9/3 12:32
 * @author YeJiang
 * @version
 */
public class Q917_仅仅反转字母 {
    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

    public static String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        while(left < right){
            char c1 = chars[left];
            char c2 = chars[right];
            if(!Character.isLowerCase(c1) && !Character.isUpperCase(c1)){
                left++;
            } else if(!Character.isLowerCase(c2) && !Character.isUpperCase(c2)){
                right--;
            } else {
                char c3 = c1;
                chars[left] = chars[right];
                chars[right] = c3;
                left++;
                right--;
            }
        }
        return new String(chars);
    }
}
