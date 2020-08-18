package com.terentiev.codility.codeassess;

import java.io.DataInputStream;

/**
 * <h1>Task:</h1>
 * <b>Find the length of the longest strictly increasing digit sum sequence.</b>
 * Input in 2 lines:
 * - First line - number of elements
 * - Second line - space-separated array of given length
 * Example 1:
 * Input:
 * 3
 * 3 4 2
 * Output:
 * 2
 * digit sum: 3 - 3, 4 - 4, 2 - 2
 * longest sequence: 3 4 (length = 2)
 * Example 2:
 * Input:
 * 3
 * 12 4 20
 * Output:
 * 2
 * digit sum: 12 - 3, 4 - 4, 20 - 2
 * longest seqence: 12 4 (length = 2)
 */
public class LongestDigSumSequence {
    public static void main(String[] args) throws java.lang.Exception {

        String firstLine;
        String secondLine;
        DataInputStream in = new DataInputStream(System.in);
        firstLine = in.readLine();
        secondLine = in.readLine();
        int n = Integer.parseInt(firstLine);
        String[] secondLineSplit = secondLine.split(" ");
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(secondLineSplit[i]);
        }
        System.out.println(solution(array));
    }

    static int solution(int[] array) {
        int maxLength = 0;
        int currentLength = 1;
        for (int i = 1; i < array.length; i++) {
            if (digitsSum(array[i - 1]) < digitsSum(array[i])) {
                currentLength++;
            } else {
                maxLength = Math.max(maxLength, currentLength);
                currentLength = 1;
            }
        }
        return Math.max(maxLength, currentLength);
    }

    static int digitsSum(int m) {
        int n, sum = 0;

        while (m > 0) {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        return sum;
    }
}
