package com.muyer.Q1_100;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/7/28 13:12
 */
//给定一个已排序的链表的头
// head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
//
//
//
// 示例 1：
//
//
//输入：head = [1,1,2]
//输出：[1,2]
//
//
// 示例 2：
//
//
//输入：head = [1,1,2,3,3]
//输出：[1,2,3]
//
//
//
//
// 提示：
//
//
// 链表中节点数目在范围 [0, 300] 内
// -100 <= Node.val <= 100
// 题目数据保证链表已经按升序 排列
//
//
// Related Topics 链表 👍 828 👎 0


//leetcode submit region begin(Prohibit modification and deletion)

import com.muyer.util.ListNode;
import com.muyer.util.PrintUtil;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class Q83_DeleteDuplicates {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode p1 = new ListNode(1);
        ListNode p2 = new ListNode(1);
        ListNode p3 = new ListNode(2);
        head.next = p1;
        p1.next = p2;
        p2.next = p3;
        PrintUtil.printListNode(head);
        deleteDuplicates(head);
        PrintUtil.printListNode(head);

    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode p = head;
        //循环链表
        while (p != null && p.next != null) {
            //删除重复元素
            if (p.val == p.next.val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
