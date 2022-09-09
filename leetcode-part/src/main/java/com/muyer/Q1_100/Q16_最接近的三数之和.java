package com.muyer.Q1_100;

import java.util.Arrays;

/**
 * Description: 
 * date: 2022/9/9 22:20
 * @author YeJiang
 * @version
 */
public class Q16_最接近的三数之和 {
    public static void main(String[] args) {

    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    return sum;
                }
                if (res == Integer.MAX_VALUE) {
                    res = sum;
                } else {
                    res = Math.abs(sum - target) < Math.abs(res - target) ? sum : res;
                }
            }
        }
        return res;
    }
}
