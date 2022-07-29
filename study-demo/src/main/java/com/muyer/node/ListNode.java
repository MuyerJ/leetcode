package com.muyer.node;

import com.muyer.util.CommonUtil;
import com.muyer.util.PrintUtil;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/7/28 13:38
 */
public class ListNode {

    public static void main(String[] args) {
        Node head = new Node(0);
        head.next = new Node(10);
        head.next.next = new Node(9);
        head.next.next.next = new Node(8);
        head.next.next.next.next = new Node(7);
        PrintUtil.printList(head);
        reverseList(head);
        PrintUtil.printList(head);
    }

    //头插
    public static void addFirst(Node head, int val) {
        Node newNode = new Node(val);
        //新节点指
        newNode.next = head.next;
        //头节点指
        head.next = newNode;
    }

    //尾插
    public static void addTail(Node head, int val) {

    }

    //头删
    public static void deleteFirst() {
    }

    //尾删
    public static void deleteTail() {
    }

    //反转链表(带头节点)
    public static void reverseList(Node head) {
        if (head.next == null || head.next.next == null) {
            return;
        }
        //当前节点
        Node p1 = head.next;
        //向前节点的下一个节点
        Node p2 = null;
        //反转表的头节点
        Node reverseNode = new Node(0);
        //循环反转
        while (p1 != null) {
            //头插法反转
            p2 = p1.next;
            p1.next = reverseNode.next;
            reverseNode.next = p1;
            p1 = p2;
        }
        head.next = reverseNode.next;
    }


}
