package com.algorithm;

import com.algorithm.a1005.TowSumSorted;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class TowSumSortedTest {

    @Test
    void towSum() {

        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(TowSumSorted.towSum(nums, 9)));
    }
}