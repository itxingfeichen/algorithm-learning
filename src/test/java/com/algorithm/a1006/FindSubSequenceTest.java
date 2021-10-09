package com.algorithm.a1006;

import org.junit.jupiter.api.Test;

class FindSubSequenceTest {

    @Test
    void getSubSequence() {
        int[] arr = {1,3,5,4,7};
        final int subSequence = FindSubSequence.doublePointer(arr);
        System.out.println(subSequence);
    }
}