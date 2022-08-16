package com.muyer.bit;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/15 15:12
 */
public class BloomFilter {

    //布隆过滤器 可以通过int来实现
    //一个int 8Byte --> 32bit
    public static void main(String[] args) {

        //一、int 如何描述位
        // 32bit * 10 = 320 bit
        // arr[0] --> 0 - 31
        // arr[1] --> 32- 63
        // ...
        int[] arr = new int[10];

        //二、如何获取第i个的位置
        int i = 178;
        //看i 在arr的第几位
        int numIndex = i / 32;
        //看i 在arr某个数上的第几位
        int bitIndex = i % 32;

        //三、获取第i个位置的状态
        int s = (arr[numIndex] >> bitIndex & 1);

        //四、把第i个位置上的状态改为1
        arr[numIndex] = arr[numIndex] | (1 << bitIndex);

        //五、把第i个位置上的状态改为0
        arr[numIndex] = arr[numIndex] & (~(1 << bitIndex));


        //总结三个操作：
        //1.第i个位置上的值拿出来 ==> ( arr[i/32] >> i%32 ) &1
        //2.第i个位置上的值改为0
        //3.第i个位置上的值改为1

    }


}
