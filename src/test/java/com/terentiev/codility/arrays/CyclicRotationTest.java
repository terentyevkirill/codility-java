package com.terentiev.codility.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CyclicRotationTest {

    @Test
    public void test() {
        CyclicRotation cyclicRotation = new CyclicRotation();
        assertArrayEquals(cyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3), new int[]{9, 7, 6, 3, 8});
        assertArrayEquals(cyclicRotation.solution(new int[]{0, 0, 0}, 1), new int[]{0, 0, 0});
        assertArrayEquals(cyclicRotation.solution(new int[]{1, 2, 3, 4}, 4), new int[]{1, 2, 3, 4});
    }
}
