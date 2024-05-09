package my.legoblocks;

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

class Result {

    /*
     * Complete the 'legoBlocks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER m
     */

    public static int legoBlocks(int n, int m) {
        // Write your code here

        int[][] d = new int[n+1][m+1];
        d[0][0] = 1;
        d[1][1] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                d[i][j] += d[i-1][m];
                d[i][j] -= d[i-1][j];

                if (j - 1 >= 1) {
                    d[i][j] += d[i][j - 1];
                }
                if (j - 2 >= 1) {
                    d[i][j] += d[i][j - 2];
                }
                if (j - 3 >= 1) {
                    d[i][j] += d[i][j - 3];
                }
                if (j - 4 >= 1) {
                    d[i][j] += d[i][j - 4];
                }
            }
        }

        return d[n][m];

    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int m = Integer.parseInt(firstMultipleInput[1]);

                int result = Result.legoBlocks(n, m);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
