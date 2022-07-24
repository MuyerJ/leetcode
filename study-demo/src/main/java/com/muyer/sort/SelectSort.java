package com.muyer.sort;

import com.muyer.util.CommonUtil;
import com.muyer.util.PrintUtil;

/**
 * Description: 
 * date: 2022/7/24 10:59
 * @author YeJiang
 * @version
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] array = new int[]{5, 4, 3, 21, 2};
        //选择一个最小的元素放在前面
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }
            //交换
            if (i != minIndex) {
                CommonUtil.swap(array, i, minIndex);
            }
        }

        PrintUtil.printIntArray(array);
    }
}
