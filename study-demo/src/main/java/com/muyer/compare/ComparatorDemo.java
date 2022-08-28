package com.muyer.compare;

import com.muyer.util.PrintUtil;

import java.util.Arrays;
import java.util.Comparator;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/7/28 10:15
 */
public class ComparatorDemo {
    public static void main(String[] args) {
        Integer[] nums = new Integer[]{4, 3, 2, 8, 2, 3};
        //Arrays.sort(nums,new IntDesComparator());
        //Arrays.sort(nums, (o1, o2) -> o2 - o1);
        PrintUtil.printIntegerArray(nums);
    }

    static class IntDesComparator implements Comparator<Integer> {
        public int compare(Integer o1, Integer o2) {
            //return o1 - o2;
            return o2 - o1;
        }
    }
}
