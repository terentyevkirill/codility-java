package com.terentiev.codility.custom;

public class ReverseFactorial {
    public int solution(int N) {
        // 1! = 1
        if (N == 1)
            return 1;

        int x = 2;
        while (N != x) {
            N = N/x;
            x++;
        }
        return N;
    }
}
