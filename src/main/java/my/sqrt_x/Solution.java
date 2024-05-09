package my.sqrt_x;

// Easy

// Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
// The returned integer should be non-negative as well.
//
// You must not use any built-in exponent function or operator.

public class Solution {
    public static int mySqrt(int x) {
        long min = 0;
        long max = x/2 +1;

        while (min <= max) {
            long candidate = min + (max - min)/2;
            if (candidate * candidate > x) {
                max = candidate - 1;
            } else if (candidate * candidate < x) {
                min = candidate + 1;
            } else {
                return (int) candidate;
            }
        }

        return (int) max;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(17));
    }
}
