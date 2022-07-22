package com.muyer.util;

/**
 * @描述
 * @创建人 yejiang
 * @创建时间 2022/7/22 16:54
 */
public class CommonUtil {
    public static void swap(int[] array, int a, int b) {
        array[a] = array[a] ^ array[b];
        array[b] = array[a] ^ array[b];
        array[a] = array[a] ^ array[b];
    }
}
