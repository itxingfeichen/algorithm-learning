package com.algorithm.a1005;

import java.util.HashMap;
import java.util.Map;

/**
 * 无序数组中的两数之和
 *
 * @author xf.chen
 * @date 2021/10/5 21:07
 * @since 1.0.0
 */
public class TowSumNoneSort {
    public static int[] towSum(int[] nums, int target) {

        return towSumForMap(nums, target);
    }

    private static int[] towSumForForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    private static int[] towSumForMap(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int key = target - nums[i];
            if (map.containsKey(key)) {
                return new int[]{map.get(key), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

}
