package com.muyer.util;

import com.muyer.node.Node;

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

    public static void printIntegerArray(Integer[] array) {
        StringBuilder sb = new StringBuilder();
        for (int a : array) {
            sb.append(a).append(",");
        }
        System.out.println(sb);
    }

    public static void printList(Node head) {
        if (head.next == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        Node p = head.next;
        while (p != null) {
            sb.append(p.val).append(",");
            p = p.next;
        }
        System.out.println(sb);
    }
}
