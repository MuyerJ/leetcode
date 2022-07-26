package com.muyer.merge;

/**
 * @描述 小和问题
 * 在一个数组中，每一个数左边比当前数小的数累加起来，叫做这个数组的小和。求一个数组的小和。
 * @创建人 yejiang
 * @创建时间 2022/7/25 15:38
 */
public class SmallSum {

    public static void main(String[] args) {
        twoCircle(new int[]{1, 3, 4, 2, 5});
    }

    /**
     * 两层循环
     */
    public static void twoCircle(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i]) {
                    sum = sum + arr[j];
                }
            }
        }
        System.out.println(sum);
    }

}
