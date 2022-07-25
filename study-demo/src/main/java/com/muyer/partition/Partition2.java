package com.muyer.partition;

import com.muyer.util.CommonUtil;
import com.muyer.util.PrintUtil;

/**
 * @描述 给定一个数组arr，和一个数num，请把小于等于num的数放在数组的左边，大于num的数放在数组的右边。
 * 要求额外空间复杂度O(1）,时间复杂度 O(N）
 * @创建人 yejiang
 * @创建时间 2022/7/25 10:09
 */
public class Partition2 {

    public static void main(String[] args) {
        int[] arr = new int[]{11, 14, 15, 16, 11, 2, 3, 4};
        partition2(arr, 10);
        PrintUtil.printIntArray(arr);
    }

    public static void partition2(int[] arr, int num) {
        //小于num的边界
        int smallIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > num) {
                //假如比num大，直接下一个
            } else {
                //假如比num小，当前数与边界下一个数交换，并且边界扩大1
                int nextIndex = smallIndex + 1;
                CommonUtil.swap(arr, nextIndex, i);
                smallIndex++;
            }
        }
    }
}
