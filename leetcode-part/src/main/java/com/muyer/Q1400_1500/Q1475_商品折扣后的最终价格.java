package com.muyer.Q1400_1500;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/9/1 10:17
 */
public class Q1475_商品折扣后的最终价格 {
    public int[] finalPrices(int[] prices) {
        for(int i=0 ; i<prices.length ; i++){
            prices[i] -= getFirstLT(prices,i+1,prices.length);
        }
        return prices;
    }

    public int getFirstLT(int[] prices, int left, int right) {
        if (left > right || left < 1) {
            return 0;
        }
        int self = prices[left - 1];
        while (left < right) {
            if (prices[left] <= self) {
                return prices[left];
            }
            left++;
        }
        return 0;
    }
}
