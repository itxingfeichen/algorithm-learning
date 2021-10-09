package com.algorithm.a1005;

/**
 * 平方根
 *
 * @author xf.chen
 * @date 2021/10/5 10:59
 * @since 1.0.0
 */
public class Sqrt {

    public static int getSqrt(int num) {
        // 二分查找
        return (int) newton(2,num);

    }

    private static int binarySearch(int num) {
        int index = -1, left = 0, right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (mid * mid <= num) {
                left = mid + 1;
                index = mid;
            } else {
                right = right - 1;
            }
        }
        return index;
    }

    // x = n*n
    public static double newton(int i, int num) {
        int res = (i + num /i ) / 2;
        if (res == i) {
            return res;
        } else {
            return newton(res, num);
        }

    }
}
