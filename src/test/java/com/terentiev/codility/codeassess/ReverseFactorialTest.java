package com.terentiev.codility.codeassess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseFactorialTest {
    @Test
    public void test() {
        ReverseFactorial reverseFactorial = new ReverseFactorial();
        assertEquals(1, reverseFactorial.solution(1));
        assertEquals(2, reverseFactorial.solution(2));
        assertEquals(5, reverseFactorial.solution(120));
        assertEquals(10, reverseFactorial.solution(3628800));
        assertEquals(12, reverseFactorial.solution(479001600));
    }
}
