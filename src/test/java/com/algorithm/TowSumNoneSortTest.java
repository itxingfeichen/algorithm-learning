package com.algorithm;

import com.algorithm.a1005.TowSumNoneSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TowSumNoneSortTest {

    @Test
    void towSum() {

        int[] nums = {2,11,7,15};
        System.out.println(Arrays.toString(TowSumNoneSort.towSum(nums, 9)));
    }
}