package com.algorithm.a1010;

/**
 * 石子问题
 *
 * @author xf.chen
 * @date 2021/10/10 16:54
 * @since 1.0.0
 */
public class StoreProblem {

    public static int pk(int[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        }
        int left = 0, right = 0;
        if (r - l == 1) {
            left = arr[l];
            right = arr[r];
        }

        if (r - l >= 2) {
            left = arr[l] + Math.min(pk(arr, l + 2, r), pk(arr, l + 1, r - 1));
            right = arr[l] + Math.min(pk(arr, l + 1, r-1), pk(arr, l, r - 2));
        }

        return Math.max(left,right);
    }
}
