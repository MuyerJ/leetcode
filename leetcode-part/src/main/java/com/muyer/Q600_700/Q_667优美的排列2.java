package com.muyer.Q600_700;

/**
 *@描述
 *@创建人 yejiang
 *@创建时间 2022/9/8 12:21
 */
public class Q_667优美的排列2 {

    public static void main(String[] args) {
//        constructArray(9,8);
        constructArray(9, 6);
    }

    public static int[] constructArray(int n, int k) {
        int kk = k;
        int[] res = new int[n];
        int i = 1;
        int j = 1 + k;
        int index = 0;
        res[index++] = i;
        res[index++] = j;
        while (k > 0) {
            i = j - (--k);
            res[index] = i;
            if (++index == n || k <= 0) {
                break;
            }
            j = i + (--k);
            res[index] = j;
            if (++index == n || k <= 0) {
                break;
            }
        }
        for (i = 0; i < n - kk - 1; i++) {
            res[n - i - 1] = n - i;
        }
        return res;
    }
}
