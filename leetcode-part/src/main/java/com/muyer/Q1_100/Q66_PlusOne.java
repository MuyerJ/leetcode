package com.muyer.Q1_100;

import com.muyer.util.PrintUtil;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/7/27 16:10
 */
//给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
// 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
// 你可以假设除了整数 0 之外，这个整数不会以零开头。
//
// 示例 1：
//输入：digits = [1,2,3]
//输出：[1,2,4]
//解释：输入数组表示数字 123。
//
// 示例 2：
//输入：digits = [4,3,2,1]
//输出：[4,3,2,2]
//解释：输入数组表示数字 4321。
//
// 示例 3：
//输入：digits = [0]
//输出：[1]
// 提示：
// 1 <= digits.length <= 100
// 0 <= digits[i] <= 9
//
public class Q66_PlusOne {

    public static void main(String[] args) {
        PrintUtil.printIntArray(plusOne(new int[]{1, 2, 3}));
        PrintUtil.printIntArray(plusOne(new int[]{4, 3, 2, 1}));
        PrintUtil.printIntArray(plusOne(new int[]{0}));
        PrintUtil.printIntArray(plusOne(new int[]{9}));
        PrintUtil.printIntArray(plusOne(new int[]{9, 9}));
    }

    public static int[] plusOne(int[] digits) {
        digits[digits.length - 1] = 1 + digits[digits.length - 1];
        //进位标记
        boolean flag = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            //进位
            int r = flag ? digits[i] + 1 : digits[i];
            if (r < 10) {
                digits[i] = r;
                return digits;
            }
            flag = true;
            digits[i] = r - 10;
        }
        if (flag) {
            //扩容 移位
            int[] newArray = new int[digits.length + 1];
            System.arraycopy(digits, 0, newArray, 0, digits.length);
            digits = newArray;
            //0到length-2 向右移1位
            for (int i = digits.length - 2; i >= 0; i--) {
                digits[i + 1] = digits[i];
            }
            digits[0] = 1;
        }
        return digits;
    }
}
