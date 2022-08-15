package com.muyer.bit.base;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/15 16:27
 */
public class Or {
    public static void main(String[] args) {
        orOne();
    }

    public static void orOne(){
        //1000 | 0001 = 1001
        System.out.println(8 | 1);
        //1000 | 0010 = 1010
        System.out.println(8 | 2);
    }
}
