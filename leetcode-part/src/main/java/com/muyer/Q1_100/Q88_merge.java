package com.muyer.Q1_100;

import com.muyer.util.PrintUtil;

import java.util.Arrays;

/**
 * Description:
 *
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
 * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
 *
 * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，
 *      其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
 *
 * date: 2022/8/14 22:26
 * @author YeJiang
 * @version
 */
public class Q88_merge {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0};
        merge1(nums1, 3, new int[]{2, 5, 6}, 2);
        PrintUtil.printIntArray(nums1);
    }


    /**
     * 先合并 再排序
     * @param nums1 初始长度 是 n+m
     * @param m
     * @param nums2
     * @param n
     */
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {

        //合并
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        //排序
        Arrays.sort(nums1);

    }
}
