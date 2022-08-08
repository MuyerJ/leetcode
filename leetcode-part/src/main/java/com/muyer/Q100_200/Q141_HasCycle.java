package com.muyer.Q100_200;

import com.muyer.util.ListNode;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/7/28 13:48
 */
//给你一个链表的头节点 head ，判断链表中是否有环。如果链表中存在环 ，则返回 true 。 否则，返回 false 。
//
// 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 为了表示给定链表中的环，评测系统内部使用整数 pos 来表示链表尾连接到
//链表中的位置（索引从 0 开始）。注意：pos 不作为参数进行传递 。仅仅是为了标识链表的实际情况。
//
// 如果链表中存在环 ，则返回 true 。 否则，返回 false 。
//
//
//
// 示例 1：
//输入：head = [3,2,0,-4], pos = 1
//输出：true
//解释：链表中有一个环，其尾部连接到第二个节点。
//
//
// 示例 2：
//输入：head = [1,2], pos = 0
//输出：true
//解释：链表中有一个环，其尾部连接到第一个节点。
//
//
// 示例 3：
//输入：head = [1], pos = -1
//输出：false
//解释：链表中没有环。
// 提示：
// 链表中节点的数目范围是 [0, 10⁴]
// -10⁵ <= Node.val <= 10⁵
// pos 为 -1 或者链表中的一个 有效索引 。
//
// 进阶：你能用 O(1)（即，常量）内存解决此问题吗？
//
public class Q141_HasCycle {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        System.out.println(hasCycle(head));
        ListNode p1 = new ListNode(2);
        head.next = p1;
        p1.next = head;
        System.out.println(hasCycle(head));

    }

    //快慢指针实现
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode p1 = head, p2 = head;
        while (p1 != null && p2 != null) {
            p1 = p1.next;
            p2 = p2.next == null ? null : p2.next.next;
            if (p1 == p2) {
                break;
            }
        }
        return p1 == p2;
    }
}
