package com.terentiev.codility.arrays;


import java.util.Arrays;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int[] pairedIndexes = new int[A.length];
        Arrays.fill(pairedIndexes, -1);

        for (int i = 0; i < A.length; i++) {
            // looking for pair for A[i]
            if (pairedIndexes[i] == -1) {
                boolean isPairFound = false;
                int pairValue = A[i];
                int j = i + 1;
                while (!isPairFound && j < A.length) {
                    if (A[j++] == pairValue) {
                        // found pair for A[i]
                        pairedIndexes[i] = i;
                        pairedIndexes[j - 1] = j - 1;
                        isPairFound = true;
                    }
                }
                if (!isPairFound) {
                    // pair for A[i] not found
                    return pairValue;
                }
            }
        }
        return 0;
    }
}
