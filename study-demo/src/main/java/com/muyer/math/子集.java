package com.muyer.math;

import java.util.ArrayList;
import java.util.List;

/**
 * Description: 
 * date: 2022/9/3 22:00
 * @author YeJiang
 * @version
 */
public class 子集 {

    //子集是一个数学概念,
    // 对于一个有n个元素的集合而言,其共有2^n个子集。其中空集和自身。
    public static void main(String[] args) {
        getSubSet(new int[]{1, 2, 3, 4});

    }

    //  1 << i 就是左移 i 位，得到的是2的 i 次方
    // (i & (1 << j))
    public static List<List<Integer>> getSubSet(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int n = nums.length;
        for (int i = 0; i < Math.pow(2, n); i++) {
            List<Integer> lists = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    lists.add(nums[j]);
                }
            }
            list.add(lists);
        }
        return list;

    }
}
