package com.algorithm.a1006;

/**
 * 给定一个数组，找到最长切连续递增的子序列，并返回该序列的长度
 *
 * @author xf.chen
 * @date 2021/10/6 20:16
 * @since 1.0.0
 */
public class FindSubSequence {

    // 1 2 3    2 3 4    3 4 5 6
    public static int getSubSequence(int[] nums) {
        int max = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i] <= nums[i - 1]) {
                start = i;
            }
            max = Math.max(max, i - start + 1);
        }
        return max;
    }

    /**
     * 双指针，滑动窗口
     *
     * @param nums
     * @return
     */
    public static int doublePointer(int[] nums) {
        int left = 0, right = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {

            // 找到了不满足递增的情况
            if (i > 0 && nums[i] <= nums[i - 1]) {
                left = i;
                right = left;
            } else {
                right = i;
            }
            max = Math.max(max, right - left + 1);

        }

        return max;
    }


}
