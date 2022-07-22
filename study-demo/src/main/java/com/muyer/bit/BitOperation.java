package com.muyer.bit;

/**
 * @描述
 * @创建人 yejiang
 * @创建时间 2022/7/22 11:46
 */
public class BitOperation {

    /**
     * 一个数组[]，一堆数字，一种数有奇数个，其他数偶数次，这个数是多少
     * 一个数组[]，一堆数字，两种数有奇数个，其他数偶数次，这两个数是多少
     * 要求时间复杂度O(N),空间复杂度O(1)
     */

    public static void main(String[] args) {
        //swap();
        //demo();
        //getOne();
        //System.out.println(getRightOne(6) + "," + getRightOne(3));
        getTwo();
    }

    /**
     * 假如那两个数是a,b
     * 先获取 a^b
     * 再获取 a
     * 再获取 b
     */
    private static void getTwo() {
        int[] intArray = new int[]{1, 1, 2, 2, 3, 4};
        //步骤1：获取a^b
        int ab = 0;
        int a = 0;
        for (int num : intArray) {
            ab = ab ^ num;
        }
        //步骤2：获取a
        //获取a最右1位为1的数
        int rightOne = ab & (~ab + 1);
        //最右为1的数 有奇数个a 和 偶数个其他数(可能有)
        for (int num : intArray) {
            if ((rightOne & num) == 0) {
                a = a ^ num;
            }
        }
        //步骤3：获取b
        int b = ab ^ a;
        System.out.println(a + "," + b);
    }

    private static void getOne() {
        int[] intArray = new int[]{1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4};
        int eof = 0;
        for (int e : intArray) {
            eof = eof ^ e;
        }
        System.out.println(eof);
    }

    public static void swap() {
        int a = 111;
        int b = 222;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + "," + b);
    }

    public static int getRightOne(int num) {
        return num & (~num + 1);
    }

    public static void demo() {
        System.out.println(1 ^ 1);
        System.out.println(1 ^ 2 ^ 1);
        System.out.println(2 ^ 1 ^ 1);
    }
}
