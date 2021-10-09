package com.algorithm.a1006;

import org.junit.jupiter.api.Test;

class LemonTest {

    @Test
    void lemon() {

        int[] arr = {5, 5, 10};
        final boolean lemon = Lemon.lemon(arr);
        System.out.println(lemon);
    }
}