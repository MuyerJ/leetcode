package com.muyer.util;

/**
 * @描述
 * @创建人 yejiang
 * @创建时间 2022/7/22 16:42
 */
public class PrintUtil {

    public static void printIntArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int a : array) {
            sb.append(a).append(",");
        }
        System.out.println(sb);
    }

    public static void printListNode(ListNode head) {
        ListNode p = head;
        StringBuilder sb = new StringBuilder();
        while (p!=null){
            sb.append(p.val).append(",");
            p = p.next;
        }
        System.out.println(sb);
    }
}
