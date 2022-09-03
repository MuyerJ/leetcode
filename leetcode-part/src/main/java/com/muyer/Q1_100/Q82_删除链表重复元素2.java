package com.muyer.Q1_100;

import com.muyer.util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/9/2 13:28
 */
public class Q82_删除链表重复元素2 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode hair = new ListNode(-1, head);
        Set<Integer> set = new HashSet<Integer>();
        ListNode p = head;
        while (p.next != null) {
            if (p.val == p.next.val) {
                set.add(p.val);
            }
            p = p.next;
        }
        p = hair;
        while (p.next != null) {
            if (set.contains(p.next.val)) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }
        return hair.next;
    }
}
