package com.muyer.Q1_100;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/7/26 18:40
 */
//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
//
// 请必须使用时间复杂度为 O(log n) 的算法。
//
//
//
// 示例 1:
//
//
//输入: nums = [1,3,5,6], target = 5
//输出: 2
//
//
// 示例 2:
//
//
//输入: nums = [1,3,5,6], target = 2
//输出: 1
//
//
// 示例 3:
//
//
//输入: nums = [1,3,5,6], target = 7
//输出: 4
//
//
//
//
// 提示:
//
//
// 1 <= nums.length <= 10⁴
// -10⁴ <= nums[i] <= 10⁴
// nums 为 无重复元素 的 升序 排列数组
// -10⁴ <= target <= 10⁴
//
//
public class Q35_SearchInsert {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int target = 7;
        //int target = 0;
        System.out.println(searchInsert(nums, target));
        //PrintUtil.printIntArray(nums);
    }

    public static int searchInsert(int[] nums, int target) {
        int position = 0;
        for (int i = 0; i < nums.length; i++) {
            //如果数组中有，则返回下标
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] < target && nums.length - 1 != i) {
                continue;
            }
            position = nums[i] < target ? i + 1 : i;
            //扩容
            int[] newArray = new int[nums.length + 1];
            System.arraycopy(nums, 0, newArray, 0, nums.length);
            nums = newArray;
            //后移
            for (int j = nums.length - 2; j >= position; j--) {
                nums[j + 1] = nums[j];
            }
            //赋值
            nums[position] = target;
            break;
        }
        return position;
    }

    //数组扩容
    public static int[] largeArray(int[] array) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
