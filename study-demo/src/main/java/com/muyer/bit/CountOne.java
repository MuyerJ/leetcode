package com.muyer.bit;

/**
 * Description:
 *  统计一个二进制数有多少个二进制1
 *  https://blog.csdn.net/qq_52242864/article/details/123675321
 * date: 2022/8/28 20:22
 * @author YeJiang
 * @version
 */
public class CountOne {

    public static void main(String[] args) {
        System.out.println(countOne(0));
        System.out.println(countOne(1));
        System.out.println(countOne(2));
        System.out.println(countOne(3));
        System.out.println(countOne(4));
        System.out.println(countOne(5));
    }

    private static int countOne(int i) {
        int count = 0;
        while (i != 0){
            count++;
            i = i & (i - 1);
        }

        return count;
    }
}
