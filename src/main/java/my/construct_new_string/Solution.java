package my.construct_new_string;

//Zalando online assessment

//There are two-letter strings, "AA", "BB" & "AB", which appear AA, AB and BB times respectively.
//The task is to join some of these strings & to create the longest possible string which does not contain "AAA" or "BBB".
//
//eg.  AA = 5, AB = 0 AB = 0 & BB = 2, it is possible to join five strings by taking both of the BB" strings
// and three of the "AA" strings Then they can be joined into. A A B B A A BB AA.
// If there are more than one possible answer, the func may return any of them
public class Solution {

    public String solution(int AA, int AB, int BB) {
        // Implement your solution here
        StringBuilder sb = new StringBuilder();

        // what if BB == 0
        if (AA > BB) {
            while (BB > 0) {
                sb.append("AA");
                sb.append("BB");
                AA--;
                BB--;
            }
            sb.append("AA");
            AA--;
        } else if (BB > AA) {
            while (AA > 0) {
                sb.append("BB");
                sb.append("AA");
                BB--;
                AA--;
            }
            sb.append("BB");
            BB--;
        } else {
            while (AA > 0) {
                sb.append("AA");
                sb.append("BB");
                AA--;
                BB--;
            }
        }


        if (sb.length() == 0 || sb.charAt(sb.length()-1) == 'B') {
            while (AB > 0) {
                sb.append("AB");
                AB--;
            }
        } else if (sb.charAt(sb.length()-1) == 'A') {
            sb.delete(sb.length()-2, sb.length());
            while (AB > 0) {
                sb.append("AB");
                AB--;
            }
            sb.append("AA");
        }

        return sb.toString();
    }
}
