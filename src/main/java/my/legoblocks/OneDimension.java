//package my.legoblocks;
//
//public class OneDimension {
//
//    public static void main(String[] args) {
////        System.out.println(legoBlocks(4));
//        System.out.println(legoBlocks(2, 3));
//    }
//
//    public static int legoBlocks(int m) {
//        int[] d = new int[m+1];
//        d[0] = 1;
//        for (int j = 0; j <= m; j++) {
//            if (j - 1 >= 0) {
//                d[j] += d[j-1];
//            }
//            if (j - 2 >= 0) {
//                d[j] += d[j - 2];
//            }
//            if (j - 3 >= 0) {
//                d[j] += d[j - 3];
//            }
//            if (j - 4 >= 0) {
//                d[j] += d[j - 4];
//            }
//        }
//
//        return d[m];
//    }
//
//    public static int legoBlocks(int n, int m) {
//        // Write your code here
//
//        int[][] d = new int[n+1][m+1];
//
//        d[1][0] = 1;
//
//        for (int i = 1; i <= n; i++) {
//            d[i][0] += d[i-1][m];
//            for (int j = 1; j <= m; j++) {
//                if (j - 1 >= 0) {
//                    d[i][j] += d[i][j - 1];
//                }
//                if (j - 2 >= 0) {
//                    d[i][j] += d[i][j - 2];
//                }
//                if (j - 3 >= 0) {
//                    d[i][j] += d[i][j - 3];
//                }
//                if (j - 4 >= 0) {
//                    d[i][j] += d[i][j - 4];
//                }
//                d[i][j] %= 1000000007;
//            }
//        }
//
//        int[][] h = new int[n+1][m+1];
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= m; j++) {
//                h[i][j] = d[i][j] - d[1][j] * d[1][m-j];
//                h[]
//            }
//        }
//
//        return d[n][m];
//
//    }
//
//    public static int legoBlocks_(int n, int m) {
//        // Write your code here
//
//        int[] d = new int[m+1];
//        d[0] = 1;
//        for (int j = 0; j <= m; j++) {
//            if (j - 1 >= 0) {
//                d[j] += d[j-1];
//            }
//            if (j - 2 >= 0) {
//                d[j] += d[j - 2];
//            }
//            if (j - 3 >= 0) {
//                d[j] += d[j - 3];
//            }
//            if (j - 4 >= 0) {
//                d[j] += d[j - 4];
//            }
//        }
//
//        return d[m];
//
//    }
//
//
//}
