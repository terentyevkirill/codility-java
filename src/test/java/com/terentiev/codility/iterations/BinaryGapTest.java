package com.terentiev.codility.iterations;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryGapTest {
    @Test
    public void test() {
        BinaryGap gap = new BinaryGap();
        assertEquals(4, gap.solution(529));
        assertEquals(1, gap.solution(20));
        assertEquals(0, gap.solution(15));
        assertEquals(0, gap.solution(32));
    }
}
