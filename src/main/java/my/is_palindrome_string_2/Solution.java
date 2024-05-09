package my.is_palindrome_string_2;

import java.util.Objects;

class Solution {

    public static boolean isPalindrome(String s) {
        return Objects.equals(s, new StringBuilder(s).reverse().toString());
    }

    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        boolean skipped = false;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s.substring(left + 1, right + 1)) ||
                        isPalindrome(s.substring(left, right));
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(validPalindrome("kakap"));
    }
}