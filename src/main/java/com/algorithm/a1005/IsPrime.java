package com.algorithm.a1005;

/**
 * 判断指定整数范围内有多少个素数（0，1除外）
 *
 * @author xf.chen
 * @date 2021/10/5 08:13
 * @since 1.0.0
 */
public class IsPrime {

    /**
     * 获取素数数量
     */
    public static int countPrime(int n) {
        boolean[] nonePrimes = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!nonePrimes[i]) {
                count++;
                for (int j = 2 * i; j < n; j += i) {
                    nonePrimes[j] = true;
                }
            }
        }

        return count;
    }

    /**
     * 暴力算法
     */
    private static int force(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i * i == 0) {
                return false;
            }
        }
        return true;
    }


}
