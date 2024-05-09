package my.remove_adjacent_letters;

//Zalando online assessment


import java.util.LinkedList;

//A string consisting of the letters A, B, C and D is given.
//The string can be transformed either by removing a letter a together
//with an adjacent letter b or by removing a letter c together with an adjacent letter d.
//Write a function so that the given string s consisting of n characters returns any string
public class Solution {

    public String solution(String S) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char c : S.toCharArray()) {
            if (!stack.isEmpty() && canRemove(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pollLast());
        }

        return result.toString();
    }

    private boolean canRemove(char a, char b) {
        return (a == 'A' && b == 'B') || (a == 'B' && b == 'A')
                || (a == 'C' && b == 'D') || (a == 'D' && b == 'C');
    }

}
