package com.algorithm;

import com.algorithm.a1005.Fibonacci;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    @Test
    void getFibonacci() {
        // 0 1 1 2 3 5 8 13 21
        System.out.println(Fibonacci.getFibonacci(10));
    }
}