package com.muyer.sort;

import com.muyer.util.CommonUtil;
import com.muyer.util.PrintUtil;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/7/27 9:58
 */
public class HeapSort {
    public static void main(String[] args) {
        //测试  heapInsert
        /**
         *   [5,3,2,1,4,8,9]
         *              5
         *           3     2
         *         1  4   8  9
         *  以 9 向上移动 , index=6
         *   [9,3,5,1,4,8,2]
         *              9
         *           3     5
         *         1  4   8  2
         */
        int[] array1 = {5, 3, 2, 1, 4, 8, 9};
        heapInsert(array1, 6);
        PrintUtil.printIntArray(array1);

        //测试 heapify
        /**
         *   [5,3,2,1,4,8,9]
         *              5
         *           3     2
         *         1  4   8  9
         *   [5,4,9,1,3,8,2]
         *              5
         *           4     9
         *         1  3   8  2
         */
        int[] array2 = {5, 3, 2, 1, 4, 8, 9};
        for (int i = 0; i < array2.length; i++) {
            heapify(array2, i, array2.length);
            PrintUtil.printIntArray(array2);
        }
    }

    /**
     * 向下 调整
     *  只要有左孩子就调整
     *  获取左右孩子和父亲中最大值大下标
     *      如果是父节点最大，结束调整
     *      如果是孩子最大，讲孩子和父亲调整，继续调整
     * @param arr
     * @param index
     * @param heapSize
     */
    public static void heapify(int[] arr, int index, int heapSize) {
        int left = getLeft(index);
        //如果还有孩子 继续向下 调整
        while (left < heapSize) {
            /*
            index:父 ， 父和两个孩子谁的值大，就把下标给largest
                两个 孩子中，谁的值大，就把下标给largest
                父与孩子之间，谁的值大，把下标给largest
             */
            int largestIndex = left;
            if (left + 1 < heapSize) {
                largestIndex = arr[left + 1] > arr[left] ? left + 1 : left;
            }
            largestIndex = arr[largestIndex] > arr[index] ? largestIndex : index;

            //如果父节点就是最大的直接返回
            if (largestIndex == index) {
                return;
            }
            //如果父节点不是最大的，则交换
            CommonUtil.swap(arr, largestIndex, index);
            //重置各个指针，继续循环
            index = largestIndex;
            left = getLeft(index);
        }


    }

    /**
     * 向上 调整
     * @param arr
     * @param index
     */
    public static void heapInsert(int[] arr, int index) {
        //如果index位置上的数比父节点大就循环
        while (arr[index] > arr[getParent(index)]) {
            //交换当前节点和父节点
            CommonUtil.swap(arr, index, getParent(index));
            //以父节点为index继续向上移动
            index = getParent(index);
        }
    }

    public static int getRight(int index) {
        return 2 * index + 2;
    }

    public static int getLeft(int index) {
        return 2 * index + 1;
    }

    public static int getParent(int index) {
        return (index - 1) / 2;
    }
}
