package com.algorithm.a1006;

/**
 * 硬币排列
 * 给定整数n，找出在n个硬币范围能能排列完成多少层
 * 示例 假设n=5
 * 第1层 1个硬币 第2层 2个硬币 第3层 2个硬币
 * 第三层不能完整排列 因此返回2
 *
 * @author xf.chen
 * @date 2021/10/6 13:20
 * @since 1.0.0
 */
public class CoinsArrangement {

    public static int getLayer(int n) {
        return getLayerV2(n);
    }

    private static int force(int n) {
        for (int i = 1; i <= n; i++) {
            n = n - i;
            if (n <= i) {
                return i;
            }
        }
        return -1;
    }

    public static int getLayerV2(int n) {
        int low = 0, high = n;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int cost = (mid + mid * mid) / 2;
            if (cost == mid) {
                return mid;
            } else if (cost > n) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return high;

    }
}
