package com.algorithm.a1005;

import java.util.Arrays;

/**
 * 数组中心下标
 *
 * @author xf.chen
 * @date 2021/10/5 09:29
 * @since 1.0.0
 */
public class ArrayPivotIndex {

    // 1,2,3,2,1
    public static int getPivotIndex(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int tmpSum = 0;
        for (int i = 0; i < nums.length; i++) {
            tmpSum += nums[i];
            if (sum == tmpSum) {
                return i;
            }
           sum -= nums[i];

        }
        return -1;
    }
}
