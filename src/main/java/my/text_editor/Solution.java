package my.text_editor;


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<String> states = new Stack<>();
        states.push("");

        int q = Integer.parseInt(bufferedReader.readLine().trim());
        while (q > 0) {
            String query = bufferedReader.readLine().trim();
            if (query.startsWith("1")) {
                String piece = query.split(" ")[1];
                states.push(sb.toString());
                sb.append(piece);
            } else if (query.startsWith("2")) {
                int k = Integer.parseInt(query.split(" ")[1]);
                states.push(sb.toString());
                sb.delete(Math.max(0, sb.length() - k), sb.length());
            } else if (query.startsWith("3") && !sb.isEmpty()) {
                int k = Integer.parseInt(query.split(" ")[1]);
                System.out.println(sb.charAt(k - 1));
            } else if (query.startsWith("4")) {
                sb.replace(0, sb.length(), states.pop());
                if (states.empty()) {
                    states.push("");
                }

            }
            q--;
        }
    }
}