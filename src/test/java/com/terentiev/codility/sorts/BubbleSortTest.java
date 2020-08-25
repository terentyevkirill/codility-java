package com.terentiev.codility.sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {
    @Test
    public void test() {
        BubbleSort bs = new BubbleSort();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, bs.sortAsc(new int[]{3, 2, 5, 1, 4}));
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, bs.sortDesc(new int[]{3, 2, 5, 1, 4}));
    }
}
