package com.algorithm.a1005;

/**
 * 删除有序数组中的重复项
 *
 * @author xf.chen
 * @date 2021/10/5 09:14
 * @since 1.0.0
 */
public class RemoveDupNum {


    public static int removeDup(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }

        }
        return i+1;

    }
}
