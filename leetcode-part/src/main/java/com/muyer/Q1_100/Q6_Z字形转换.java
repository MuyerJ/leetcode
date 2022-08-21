package com.muyer.Q1_100;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 
 * date: 2022/8/21 23:06
 * @author YeJiang
 * @version
 */
public class Q6_Z字形转换 {
    public static void main(String[] args) {
        convert("PAYPALISHIRING", 3);
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        List<List<Character>> list = new ArrayList<List<Character>>();
        for (int i = 0; i < numRows; i++) {
            list.add(new ArrayList<Character>());
        }

        //s.length() % (numRows*2 -2) 即为循环的次数
        for (int i = 0; i < s.length(); i++) {
            int zCount = i % (numRows + numRows - 2);
            int listIndex = zCount < numRows ? zCount : (2 * numRows - zCount - 2);
            System.out.println(listIndex + "-->" + s.charAt(i));
            list.get(listIndex).add(s.charAt(i));

        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            List<Character> temp = list.get(i);
            for (int j = 0; j < temp.size(); j++) {
                if (temp.get(j) != null) {
                    sb.append(temp.get(j));
                }
            }
        }
        return sb.toString();
    }
}
