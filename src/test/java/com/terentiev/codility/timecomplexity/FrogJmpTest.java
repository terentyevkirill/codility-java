package com.terentiev.codility.timecomplexity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FrogJmpTest {
    @Test
    public void test() {
        FrogJmp frogJmp = new FrogJmp();
        assertEquals(3, frogJmp.solution(10, 85, 30));
        assertEquals(0, frogJmp.solution(10, 10, 50));
        assertEquals(4, frogJmp.solution(5, 29, 7));
    }
}
