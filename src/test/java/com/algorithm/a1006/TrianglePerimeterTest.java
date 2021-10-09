package com.algorithm.a1006;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianglePerimeterTest {

    @Test
    void trianglePerimeter() {
        int[] arr = {3,6,2,3};
        final int perimeter = TrianglePerimeter.trianglePerimeter(arr);
        System.out.println(perimeter);
    }
}