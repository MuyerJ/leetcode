package com.muyer.sort;

import com.muyer.util.PrintUtil;

/**
 * Description: 
 * date: 2022/7/23 8:46
 * @author YeJiang
 * @version
 */
public class MergeSort {

    public static void main(String[] args) {
        //int[] array = new int[]{1, 3, 5, 9, 2, 3, 4, 5};
        //int[] array = new int[]{1, 300, 5, 9, 2, 3, 4, 5};
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        //mergeArray(array, 0, 2, 4);

        mergeSort(array, 0, array.length);

        PrintUtil.printIntArray(array);
    }

    public static void mergeSort(int[] array, int left, int right) {
        if (left < right - 1) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid, right);
            mergeArray(array, left, mid, right);
        }
    }

    public static void mergeArray(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left];
        int p1 = 0;//temp指针
        int p2 = left;
        int p3 = mid;
        while (p2 < mid && p3 < right) {
            if (array[p2] <= array[p3]) {
                temp[p1++] = array[p2++];
            } else {
                temp[p1++] = array[p3++];
            }
        }
        while (p2 < mid) {
            temp[p1++] = array[p2++];
        }
        while (p3 < right) {
            temp[p1++] = array[p3++];

        }
        for (int i = 0; i < temp.length; i++) {
            array[left + i] = temp[i];
        }
    }
}
