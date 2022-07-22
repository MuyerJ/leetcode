package com.muyer.sort;

import com.muyer.util.PrintUtil;

/**
 * @描述 工作原理：通过构建有序序列，对于未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
 * @创建人 yejiang
 * @创建时间 2022/7/22 16:48
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = new int[]{3, 4, 51, 61, 1, -1};
        for (int i = 1; i < array.length; i++) {
            int preIndex = i - 1;
            int element = array[i];
            //寻找合适的插入位置：只要遍历到数组第一个元素，一直遍历
            while (preIndex >= 0 && element < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = element;
        }

        PrintUtil.printIntArray(array);
        //insertPreArray();
    }

    /**
     * 插入排序核心：一个元素向前找到合适的位置插入(从后往前)
     */
    public static void insertPreArray() {
        int[] array = new int[]{3, 2, 4, 5, -1};
        //index=4，元素为-1的数，插入
        int element = -1;
        int preIndex = 3;
        while (preIndex >= 0 && element < array[preIndex]) {
            array[preIndex + 1] = array[preIndex];
            preIndex--;
        }
        array[preIndex + 1] = element;
        PrintUtil.printIntArray(array);

    }
}
