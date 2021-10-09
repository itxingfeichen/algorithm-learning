package com.algorithm.a1005;

/**
 * 有序数组中的两数之和
 *
 * @author xf.chen
 * @date 2021/10/5 21:07
 * @since 1.0.0
 */
public class TowSumSorted {

    public static int[] towSum(int[] nums, int target) {

        return towSumForDoublePointer(nums, target);
    }

    private static int[] towSumFoBinary(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            int low = i + 1, high = nums.length - 1;
            while (low <= high) {
                int mid = (high - low) / 2 + low;
                if (target == nums[mid] + nums[i]) {
                    return new int[]{i + 1, mid + 1};
                } else if (target > nums[mid] + nums[i]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return new int[]{-1, -1};
    }

    private static int[] towSumForDoublePointer(int[] nums, int target) {
        int p1 = 0, p2 = nums.length - 1;
        while (p1 <= p2) {
            if (target == nums[p1] + nums[p2]) {
                return new int[]{p1, p2};
            }else if(target > nums[p1] + nums[p2]){
                p1++;
            }else{
               p2--;
            }
        }
        return new int[]{-1, -1};
    }
}
