package com.muyer.Q1_100;

import com.muyer.util.ListNode;
import com.muyer.util.PrintUtil;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/7/29 11:14
 */
//给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
// 示例 1：
//输入：head = [1,2,3,4]
//输出：[2,1,4,3]
//
// 示例 2：
//输入：head = []
//输出：[]
//
// 示例 3：
//输入：head = [1]
//输出：[1]
// 提示：
//
//
// 链表中节点的数目在范围 [0, 100] 内
// 0 <= Node.val <= 100
public class Q24_SwapPairs {

    public static void main(String[] args) {
        PrintUtil.printListNode(swapPairs(new ListNode()));
        PrintUtil.printListNode(swapPairs(ListNode.buildNodes(new int[]{1})));
        PrintUtil.printListNode(swapPairs(ListNode.buildNodes(new int[]{1, 2, 3, 4, 5})));
        PrintUtil.printListNode(swapPairs(ListNode.buildNodes(new int[]{1, 2, 3, 4, 5, 6})));
    }

    public static ListNode swapPairs(ListNode head) {
        //size=0  size=1
        if (head == null || head.next == null) {
            return head;
        }
        //size>1
        ListNode hair = new ListNode(0, head);
        ListNode pre = hair;
        ListNode firstNode;
        ListNode secondNode;
        while ((firstNode = pre.next) != null && (secondNode = pre.next.next) != null) {
            //交换
            pre.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            //重新赋值
            pre = firstNode;
        }
        return hair.next;
    }
}
