package com.terentiev.codility.codeassess;

import java.io.*;

/**
 * <h1>Task:</h1>
 * <b>Calculate number of combinations (n - objects, r - sample)</b>
 */
public class CombinationsNumber {
    public static void main(String[] args) throws java.lang.Exception {
        //use the following code to fetch input from console
        String line;

        DataInputStream in = new DataInputStream(System.in);

        line = in.readLine();
        String[] input = line.split(" ");
        long n = Long.parseLong(input[0]);
        long r = Long.parseLong(input[1]);
        System.out.println(nCr(n, r));
    }

    static long nCr(long n, long r) {
        return fact(n) / (fact(r) * fact(n - r));
    }

    static long fact(long n) {
        if (n == 0 || n == 1)
            return 1;

        return n * fact(n - 1);
    }
}
