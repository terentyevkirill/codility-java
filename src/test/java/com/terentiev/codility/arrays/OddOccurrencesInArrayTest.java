package com.terentiev.codility.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddOccurrencesInArrayTest {
    @Test
    public void test() {
        OddOccurrencesInArray solution = new OddOccurrencesInArray();
        assertEquals(solution.solution(new int[]{9,3,9,3,9,7,9}), 7);
    }
}
