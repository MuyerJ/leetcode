package com.muyer.面试题;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/9/28 10:10
 */
public class 第k个数 {
    public static void main(String[] args) {
        System.out.println(getKthMagicNumber(99));
    }

    /**
     * PriorityQueue#offer
     * PriorityQueue#poll
     * PriorityQueue#peek
     * PriorityQueue#contains
     * @param k
     * @return
     */
    public static int getKthMagicNumber(int k) {
        int[] factors = {3, 5, 7};
        Set<Long> seen = new HashSet<Long>();
        PriorityQueue<Long> heap = new PriorityQueue<Long>();
        seen.add(1L);
        heap.offer(1L);
        int res = 0;
        for (int i = 0; i < k; i++) {
            long curr = heap.poll();
            res = (int) curr;
            for (int factor : factors) {
                long next = curr * factor;
                if (seen.add(next)) {
                    heap.offer(next);
                }
            }
        }
        return res;
    }

    public static int getKthMagicNumber2(int k) {
        int[] res = new int[k];
        res[0] = 1;
        int p1 = 0, p2 = 0, p3 = 0;
        for (int i = 1; i < k; i++) {
            int curMin = Math.min(Math.min(res[p1] * 3, res[p2] * 5), res[p3] * 7);
            if (curMin % 3 == 0) {
                p1++;
            }
            if (curMin % 5 == 0) {
                p2++;
            }
            if (curMin % 7 == 0) {
                p3++;
            }
            res[i] = curMin;
        }
        return res[k - 1];
    }
}
