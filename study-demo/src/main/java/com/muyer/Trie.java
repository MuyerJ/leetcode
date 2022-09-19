package com.muyer;

/**
 * Description: 
 * date: 2022/9/19 23:15
 * @author YeJiang
 * @version
 */
public class Trie {
    TrieNode root;

    Trie() {
        root = new TrieNode();
    }

    void insert(String s) {
        TrieNode cur = root;
        for (char c : s.toCharArray()) {
            if (cur.children[c - 'a'] == null) {
                cur.children[c - 'a'] = new TrieNode();
            }
            cur = cur.children[c - 'a'];
        }
        //最后一个字符
        cur.exist = true;
    }

    boolean inDictionary(String s) {
        TrieNode cur = root;
        for (char c : s.toCharArray()) {
            cur = cur.children[c - 'a'];
            if (cur == null) {
                return false;
            }
        }
        return true;
    }
}

class TrieNode {
    boolean exist;
    TrieNode[] children;

    TrieNode() {
        exist = false;
        children = new TrieNode[26];
    }
}
