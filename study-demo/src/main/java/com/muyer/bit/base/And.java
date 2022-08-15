package com.muyer.bit.base;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/15 16:23
 */
public class And {
    public static void main(String[] args) {
        addOne();
    }

    public static void addOne() {
        //1000 & 0001 = 0000
        System.out.println(8 & 1);
        //1001 & 0001 = 0001
        System.out.println(9 & 1);
        //1001 & 1000 = 1000
        System.out.println(9 & 8);
    }
}

