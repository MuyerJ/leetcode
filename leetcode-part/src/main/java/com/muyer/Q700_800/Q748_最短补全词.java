package com.muyer.Q700_800;

import java.util.Arrays;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/9/7 13:11
 */
public class Q748_最短补全词 {
    public static void main(String[] args) {
        //判断是否是子串
        System.out.println(isCompletingWord("psst".toCharArray(), "epsst".toCharArray()));
        System.out.println(shortestCompletingWord("1s3 PSt", new String[]{"step", "steps", "stripe", "stepple"}));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {
        StringBuilder sb = new StringBuilder();
        int size = 'a' - 'A';
        for (int i = 0; i < licensePlate.length(); i++) {
            char c = licensePlate.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + size);
            }
            if (c >= 'a' && c <= 'z') {
                sb.append(c);
            }
        }

        char[] c1 = sb.toString().toCharArray();
        Arrays.sort(c1);
        //System.out.println(new String(c1));

        String res = "";
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            Arrays.sort(word);
            //System.out.println(new String(word));
            if (isCompletingWord(c1, word)) {
                if (res.equals("") || res.length() > word.length) {
                    res = new String(word);
                }
            }
        }
        return res;
    }

    public static boolean isCompletingWord(char[] c1, char[] c2) {
        int index1 = 0;
        int index2 = 0;
        while (index2 < c2.length) {
            if (c1[index1] == c2[index2]) {
                index1++;
            }
            if (index1 == c1.length) {
                return true;
            }
            index2++;
        }
        return index1 == c1.length;
    }
}
