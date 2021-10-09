package com.algorithm;

import com.algorithm.a1005.RemoveDupNum;
import org.junit.jupiter.api.Test;

class RemoveDupNumTest {

    @Test
    void removeDup() {
        int[] nums = {0,1,2,2,3,3,4};
        System.out.println(RemoveDupNum.removeDup(nums));
    }
}