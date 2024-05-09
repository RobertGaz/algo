package my.perfect_square;

// Given a positive integer num, return true if num is a perfect square or false otherwise.
//
// A perfect square is an integer that is the square of an integer.
// In other words, it is the product of some integer with itself.
//
// You must not use any built-in library function, such as sqrt.

class Solution {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(808201));
    }

    public static boolean isPerfectSquare(int num) {
        long min = 1;
        long max = num/2 + 1;

        while (min < max) {
            long candidate = min + (max - min) / 2;
            System.out.printf("min: %d, candidate: %d, max: %d%n", min, candidate, max);
            if ( candidate * candidate > num) {
                max = candidate - 1;
            } else if (candidate * candidate < num) {
                min = candidate + 1;
            } else {
                return true;
            }
        }

        return min * min == num;
    }
}
