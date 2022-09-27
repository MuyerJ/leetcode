package com.muyer.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/9/27 12:15
 */
public class 字符串的前缀分数和 {

    public static void main(String[] args) {
        //System.out.println(Arrays.toString(sumPrefixScores(new String[]{"abc", "ab", "bc", "b"})));
        System.out.println(Arrays.toString(sumPrefixScores(new String[]{"qtcqcmwcin", "vkjotbrbzn", "eoorlyfche",
                "eoorlyhn", "eoorlyfcxk",
                "qfnmjilcom",
                "eoorlyfche", "qtcqcmwcnl", "qtcqcrpjr"})));
    }

    public static int[] sumPrefixScores(String[] words) {
        TrieNode root = buildTrie(words);
        int[] res = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int total = 0;
            List<String> prefixs = getPrefix(words[i]);
            for (int j = 0; j < prefixs.size(); j++) {
                total += search(root, prefixs.get(j));
            }
            res[i] = total;
        }
        return res;
    }

    //某个前缀下面还有多少个单词
    public static int search(TrieNode root, String word) {
        TrieNode cur = root;
        int i = 0;
        while (i < word.length()) {
            cur = cur.children[word.charAt(i) - 'a'];
            if (cur == null) {
                break;
            }
            i++;
        }
        //字段树没有word
        if (i < word.length()) {
            return 0;
        }
        int[] res = new int[]{cur.isWord ? 1 : 0};
        dfs(cur, res);
        return res[0];
    }

    public static void dfs(TrieNode cur, int[] res) {
        if (cur.children == null) {
            return;
        }
        for (int i = 0; i < cur.children.length; i++) {
            if (cur.children[i] == null) {
                continue;
            }
            if (cur.children[i].isWord) {
                res[0] = 1 + res[0];
            }
            dfs(cur.children[i], res);
        }
    }

    public static List<String> getPrefix(String word) {
        List<String> prefixs = new ArrayList<>();
        for (int i = 1; i <= word.length(); i++) {
            prefixs.add(word.substring(0, i));
        }
        return prefixs;
    }

    public static TrieNode buildTrie(String[] words) {
        TrieNode root = new TrieNode();
        for (String word : words) {
            TrieNode cur = root;
            for (char c : word.toCharArray()) {
                if (cur.children[c - 'a'] == null) {
                    cur.children[c - 'a'] = new TrieNode();
                }
                cur = cur.children[c - 'a'];
            }
            cur.isWord = true;
        }
        return root;
    }

}
