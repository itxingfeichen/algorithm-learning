package com.algorithm.a1005;

/**
 * 斐波那契数列
 *
 * @author xf.chen
 * @date 2021/10/5 21:57
 * @since 1.0.0
 */
public class Fibonacci {

    public static int getFibonacci(int n) {
        return method3(n);
    }

    private static int method1(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

    private static int method2(int[] ns, int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        if (ns[n] != 0) {
            return ns[n];
        }

        final int newN = method2(ns, n - 1) + method2(ns, n - 2);
        ns[n] = newN;
        return ns[n];
    }


    // O(n) + O(1)
    private static int method3(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int low = 0, high = 1;
        for (int i = 2; i <= n; i++) {
            int sum = low + high;
            low = high;
            high = sum;
        }

        return high;
    }
}
