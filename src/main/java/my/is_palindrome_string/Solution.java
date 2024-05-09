package my.is_palindrome_string;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("([^\\d\\w]|_)", "");

        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "Kek_why34ME...!";
        s = s.toLowerCase().replaceAll("[^\\w]", "");
        System.out.println(s);
    }
}