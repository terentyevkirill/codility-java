package com.terentiev.codility.arrays;

public class OddOccurrencesInArray {
    public int solution(int[] A) {
        if (A.length == 0)
            return 0;

        /*
        Using XOR (^):
        if A=B: A^B=0
        A^B^C=C
         */

        int unpaired = A[0];
        for (int i = 1; i < A.length; i++) {
            unpaired = unpaired ^ A[i];
        }

        return unpaired;
    }
}
