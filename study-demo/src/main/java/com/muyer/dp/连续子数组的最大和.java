package com.muyer.dp;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/8/31 13:36
 */
public class 连续子数组的最大和 {
    //n fn= Max{fn-1+nums[n] ,nums[n]}
    //n 范围 0 ~ nums.length-1
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i=1 ; i<nums.length ; i++){
            dp[i] = Math.max(dp[i-1] + nums[i] , nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
