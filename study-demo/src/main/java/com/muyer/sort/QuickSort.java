package com.muyer.sort;

import com.muyer.util.PrintUtil;

/**
 * @描述
 * @创建人 yejiang
 * @创建时间 2022/7/25 13:01
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 5, 1, 6, 7};
        quickSort(arr, 0, arr.length - 1);
        PrintUtil.printIntArray(arr);
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int x = arr[start];
            int left = start;
            int right = end;
            //相等时，一次分割结束
            while (left < right) {
                //从右向左,小的交换
                while (left < right && x < arr[right]) {
                    right--;
                }
                //还没分割完
                if (left < right) {
                    arr[left] = arr[right];
                    left++;
                }
                //从左向右,大的交换
                while (left < right && x > arr[left]) {
                    left++;
                }
                if (left < right) {
                    arr[right] = arr[left];
                }
            }
            arr[left] = x;
            quickSort(arr, start, left - 1);
            quickSort(arr, left + 1, end);
        }
    }
}
