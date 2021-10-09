package com.algorithm.a1006;

import java.util.Arrays;

/**
 * 三角形周长
 * 给定一个正数组成的数组，返回由其中三个长度租场的、面积部位零的三角形，返回0
 *
 * @author xf.chen
 * @date 2021/10/6 21:29
 * @since 1.0.0
 */
public class TrianglePerimeter {

    /**
     * 三角形需满足 a+b>c &&  a< c >b
     */
    public static int trianglePerimeter(int[] arr) {
        // 排序
        Arrays.sort(arr);

        // 遍历计算
        for (int i = arr.length-1; i >= 2; i--) {
            if (arr[i - 1] + arr[i - 2] > arr[i]) {
                return arr[i - 1] + arr[i - 2] + arr[i];
            }
        }
        return 0;
    }


}
