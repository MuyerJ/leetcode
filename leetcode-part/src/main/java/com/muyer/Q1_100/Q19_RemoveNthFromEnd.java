package com.muyer.Q1_100;

import com.muyer.util.ListNode;
import com.muyer.util.PrintUtil;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/7/29 10:14
 */
//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
//
//
// 示例 2：
//
//
//输入：head = [1], n = 1
//输出：[]
//
//
// 示例 3：
//
//
//输入：head = [1,2], n = 1
//输出：[1]
//
//
//
//
// 提示：
//
//
// 链表中结点的数目为 sz
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
public class Q19_RemoveNthFromEnd {

    public static void main(String[] args) {
        ListNode head = ListNode.buildNodes(new int[]{1, 2, 3, 4, 5, 6});
        head = removeNthFromEnd(head, 6);
        PrintUtil.printListNode(head);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //题目给出至少一个节点,并且 n 小于链表长度
        //p1 和 p2 相隔n
        ListNode hair = new ListNode(0, head);
        ListNode p1 = hair;
        ListNode p2 = hair;
        while (n > 0) {
            p2 = p2.next;
            n--;
        }
        //p1、p2一起向后移动，直到p2为最后一个节点
        while (p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }

        //删除p1节点的下一节点即可
        p1.next = p1.next.next;
        return hair.next;
    }
}
