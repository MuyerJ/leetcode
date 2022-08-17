package com.muyer.Q100_200;

import com.muyer.util.ListNode;
import com.muyer.util.PrintUtil;

/**
 *@描述 链表插入排序
 *@创建人 yejiang
 *@创建时间 2022/8/17 12:14
 */
public class Q147_insertionSortList {

    public static void main(String[] args) {
        //ListNode listNode = insertionSortList(ListNode.buildNodes(new int[]{4, 3, 2, 1}));
        ListNode listNode = insertionSortList1(ListNode.buildNodes(new int[]{4, 3, 2, 1}));
        PrintUtil.printListNode(listNode);

    }

    public static ListNode insertionSortList1(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode hair = new ListNode(-1, head);
        ListNode hairEnd = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (hairEnd.val <= cur.val) {
                hairEnd = cur;
            } else {
                //从hair开始找，找到合适位置的前一个
                ListNode pre = hair;
                while (pre.next.val <= cur.val) {
                    pre = pre.next;
                }
                //cur 插入到pre的后面
                hairEnd.next = cur.next;
                cur.next = pre.next;
                pre.next = cur;
            }
            cur = hairEnd.next;
        }
        return hair.next;
    }

    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode hair = new ListNode(-1, head);
        ListNode cur = head.next;
        head.next = null;
        ListNode pre = hair;
        ListNode p = hair.next;
        ListNode tail = hair.next;
        while (cur != null) {
            if (tail.val <= cur.val) {
                tail.next = cur;
                tail = tail.next;
                cur = cur.next;
                tail.next = null;
            } else {
                //移动p找合适的插入位置
                while (p != null) {
                    if (p.val > cur.val) {
                        break;
                    } else {
                        pre = p;
                        p = p.next;
                    }
                }
                pre.next = cur;
                cur = cur.next;
                pre.next.next = p;
            }
            //重置
            p = hair.next;
            pre = hair;
        }
        return hair.next;
    }
}
