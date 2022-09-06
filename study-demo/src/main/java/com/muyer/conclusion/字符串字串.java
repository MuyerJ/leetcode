package com.muyer.conclusion;

import java.util.ArrayList;
import java.util.List;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/9/6 13:36
 */
public class 字符串字串 {
    public static void main(String[] args) {
        List<String> list = getAllSubString("ABA");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static List<String> getAllSubString(String s) {
        List<String> list = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        while (index1 < s.length()) {
            while (index2 < s.length()) {
                if (index1 <= index2) {
                    String str = s.substring(index1, index2 + 1);
                    list.add(str);
                    //System.out.println(str);
                }
                index2++;
            }
            index1++;
            index2 = 0;
        }
        return list;
    }
}
