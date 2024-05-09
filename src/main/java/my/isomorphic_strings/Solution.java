package my.isomorphic_strings;

//Given two strings s and t, determine if they are isomorphic.
//
//Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//All occurrences of a character must be replaced with another character while preserving the order of characters.
// No two characters may map to the same character, but a character may map to itself.

import java.util.HashMap;

//Examples:
//
//Input: s = "egg", t = "add"
//Output: true
//
//Input: s = "foo", t = "bar"
//Output: false
public class Solution {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }


        HashMap<Character, Character> mapping = new HashMap<>();
        HashMap<Character, Character> reverseMapping = new HashMap<>();

        int pointer = 0;
        while (pointer < s.length()) {
            char sChar = s.charAt(pointer);
            char tChar = t.charAt(pointer);
            if (mapping.containsKey(sChar)) {
                if (mapping.get(sChar) != tChar) {
                    return false;
                }
            } else {
                if (reverseMapping.containsKey(tChar)) {
                    return false;
                }
                mapping.put(sChar, tChar);
                reverseMapping.put(tChar, sChar);
            }

            pointer++;
        }

        return true;
    }

}
