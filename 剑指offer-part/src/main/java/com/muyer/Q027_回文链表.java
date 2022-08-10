package com.muyer;

import com.muyer.util.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 
 * date: 2022/8/10 23:41
 * @author YeJiang
 * @version
 */

public class Q027_回文链表 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;

        System.out.println(isPalindrome(l1));

    }


    /**
     * 给定一个链表的 头节点 head ，请判断其是否为回文链表。
     * 如果一个链表是回文，那么链表节点序列从前往后看和从后往前看是相同的。
     * @param head
     * @return
     */
    public static boolean isPalindrome(ListNode head) {
        ListNode cur = head;

        //链表转化成数组
        List<ListNode> list = new ArrayList<ListNode>();
        while (cur != null) {
            list.add(cur);
            cur = cur.next;
        }

        //两个指针前后遍历判断回文字
        for (int i = 0; i < list.size() / 2; i++) {
            int end = list.size() - i - 1;
            if (list.get(i).val != list.get(end).val) {
                return false;
            }
        }

        return true;

    }
}
