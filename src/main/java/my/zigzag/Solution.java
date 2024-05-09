package my.zigzag;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine().trim());
        while (t > 0) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());
            String[] stringNumbers = bufferedReader.readLine().trim().split(" +");
            List<Integer> numbers = Arrays.stream(stringNumbers)
                                            .map(Integer::parseInt)
                                            .sorted()
                                            .collect(Collectors.toList());

            List<Integer> result = new ArrayList<>(n);
            for (int i = 0; i < n/2; i++) {
                result.add(numbers.get(i));
            }

            result.add(numbers.get(numbers.size() - 1));

            for (int i = numbers.size() - 2; i >= n/2; i--) {
                result.add(numbers.get(i));
            }

            String resultString = result.stream().map(String::valueOf).collect(Collectors.joining(" "));

            System.out.println(resultString);

            t--;
        }
    }
}