package com.terentiev.codility.binarygap;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solution(305));
    }

    public static int solution(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        int maxLength = 0;

        for (int i = 0; i < chars.length; i++) {
            // find binary gap start (first 0 after 1)
            if (i != 0 && chars[i] == '0' && chars[i-1] == '1') {
                // count length of 0's sequence
                int length = 0;
                int j = i;
                while(j != chars.length && chars[j] != '1') {
                    length++;
                    j++;
                }
                // check if 0's sequence ends with 1
                if (j < chars.length && chars[j] == '1' && length > maxLength) {
                    maxLength = length;
                }
                i = j;
            }
        }
        return maxLength;
    }
}
