package com.muyer.sort;

import com.muyer.util.PrintUtil;

/**
 * @描述
 * @创建人 yejiang
 * @创建时间 2022/7/22 16:33
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 5, 2, 1, 9, 10};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                //第j个交换
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
        PrintUtil.printIntArray(array);
    }

    public static void swap(int[] array, int index1, int index2) {
        array[index1] = array[index1] ^ array[index2];
        array[index2] = array[index1] ^ array[index2];
        array[index1] = array[index1] ^ array[index2];
    }
}
