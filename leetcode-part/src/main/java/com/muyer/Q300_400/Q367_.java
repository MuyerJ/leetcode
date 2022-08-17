package com.muyer.Q300_400;

/**
 *@描述
 *  给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 * 进阶：不要 使用任何内置的库函数，如 sqrt 。
 *@创建人 yejiang
 *@创建时间 2022/8/16 13:56
 */
public class Q367_ {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare( 1));
        System.out.println(isPerfectSquare( 11));
        System.out.println(isPerfectSquare( 14));
        System.out.println(isPerfectSquare(16));
        System.out.println(isPerfectSquare(808201));
    }

    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            long square = (long) mid * mid;
            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else if (square > num) {
                right = mid ;
            }
        }
        return false;
    }
}
