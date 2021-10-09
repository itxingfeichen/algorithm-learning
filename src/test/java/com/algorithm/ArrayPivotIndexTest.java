package com.algorithm;

import com.algorithm.a1005.ArrayPivotIndex;
import org.junit.jupiter.api.Test;

class ArrayPivotIndexTest {

    @Test
    void getPivotIndex() {

        int[] nums = {1,2,3,2,1};
        System.out.println(ArrayPivotIndex.getPivotIndex(nums));
    }
}