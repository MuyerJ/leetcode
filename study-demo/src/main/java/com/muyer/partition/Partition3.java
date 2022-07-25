package com.muyer.partition;

import com.muyer.util.CommonUtil;
import com.muyer.util.PrintUtil;

/**
 * @描述 荷兰国旗问题
 * 给定一个数组arr,和一个数num，请把小于num的数放在数组的左边，等于num的数放在数组的中间，大于num的数放在数组的右边。要求额外空间复杂度O(1)，时间复杂度O(N)
 * @创建人 yejiang
 * @创建时间 2022/7/25 12:31
 */
public class Partition3 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 14, 15, 10, 3, 16, 11, 10, 2, 3, 4};
        partition3(arr, 10);
        PrintUtil.printIntArray(arr);
    }

    public static void partition3(int[] arr, int num) {
        //循环数组
        //当前元素小于num，与左边界下一个交换，并且边界扩大1位
        //当前元素等于num，下一次循环
        //当前元素大于num，与右边界的上一个交换，并且边界扩大1位
        int left = -1;
        int right = arr.length;
        for (int i = 0; i < arr.length; ) {
            if (i == right) {
                break;
            }
            if (arr[i] < num) {
                CommonUtil.swap(arr, left + 1, i);
                left++;
                i++;
            } else if (arr[i] > num) {
                CommonUtil.swap(arr, right - 1, i);
                right--;
            } else {
                i++;
            }
        }
    }

}
