package com.muyer.node;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/7/28 13:35
 */
public class Node {
    public int val;
    public Node next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
