package my;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class AResult {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // Write your code here
        List<List<Character>> gridSorted = new ArrayList<>();
        for (String s : grid) {

            List<Character> sortedLine = s.chars().mapToObj(c -> (char) c).sorted().toList();
            gridSorted.add(sortedLine);
        }
        for (int column = 0; column < grid.size(); column++) {
            for (int row = 0; row < grid.size() - 1; row ++) {
                if (gridSorted.get(row).get(column) >= gridSorted.get(row+1).get(column)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                List<String> grid = IntStream.range(0, n).mapToObj(i -> {
                            try {
                                return bufferedReader.readLine();
                            } catch (IOException ex) {
                                throw new RuntimeException(ex);
                            }
                        })
                        .collect(toList());

                String result = AResult.gridChallenge(grid);

                System.out.println(result);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
    }
}
